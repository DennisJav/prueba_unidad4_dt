package ec.edu.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.Doctor;
import ec.edu.modelo.Paciente;

@Transactional
@Repository
public class PacienteRepoImpl implements IPacienteRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public Paciente buscarPacienteCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Paciente> miTypedQuery = this.entityManager
				.createQuery("select p from Paciente p where p.cedula = :valor",Paciente.class);
		miTypedQuery.setParameter("valor", cedula);

		return miTypedQuery.getSingleResult();
	}

	@Override
	public List<Paciente> buscarPacienteTodos() {
		TypedQuery<Paciente> miQuery = this.entityManager
				.createQuery("SELECT p FROM Paciente p ",Paciente.class);
		return miQuery.getResultList();
	}
	
	
}
