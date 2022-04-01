package ec.edu.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.Doctor;


@Repository
@Transactional
public class DoctorRepoImpl implements IDoctorRepo{

	@PersistenceContext // para la inyeccion
	private EntityManager entityManager;
	
	@Override
	public void guardarDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(doctor);
	}

	@Override
	public void actualizarDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(doctor);
	}

	@Override
	public Doctor buscarDoctor(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Doctor.class, id);
	}

	@Override
	public void eliminarDoctor(Integer id) {
		// TODO Auto-generated method stub
		Doctor doct=this.buscarDoctor(id);
		this.entityManager.remove(doct);
	}

	@Override
	public Doctor buscarDoctorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Doctor> miTypedQuery = this.entityManager
				.createQuery("select d from Doctor d where d.cedula = :valor",Doctor.class);
		miTypedQuery.setParameter("valor", cedula);

		return miTypedQuery.getSingleResult();
	}

	
	
	
}
