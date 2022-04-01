package ec.edu.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.CitaMedica;
import ec.edu.modelo.Doctor;
import ec.edu.modelo.Paciente;

@Transactional
@Repository
public class CitaMedicaRepoImpl implements ICitaMedicaRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarCita(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citaMedica);
	}

	@Override
	public void actualizarCita(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
		
	}

	@Override
	public CitaMedica buscarNumero(Integer numero) {

		TypedQuery<CitaMedica> miTypedQuery = this.entityManager
				.createQuery("select c from CitaMedica c where c.numero = :valor",CitaMedica.class);
		miTypedQuery.setParameter("valor", numero);

		return miTypedQuery.getSingleResult();
	}

	@Override
	public List<CitaMedica> buscarCitasTodos() {
		// TODO Auto-generated method stub
		TypedQuery<CitaMedica> miQuery = this.entityManager
				.createQuery("SELECT c FROM CitaMedica c ",CitaMedica.class);
		return miQuery.getResultList();
	}
	
}
