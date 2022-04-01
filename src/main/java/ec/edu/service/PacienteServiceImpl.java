package ec.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Paciente;
import ec.edu.repository.IPacienteRepo;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepo pacienteRepo;
	
	@Override
	public void insertarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepo.insertarPaciente(paciente);
		
	}

	@Override
	public Paciente buscarPacienteCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.pacienteRepo.buscarPacienteCedula(cedula);
	}

	@Override
	public List<Paciente> buscarPacienteTodos() {
		// TODO Auto-generated method stub
		return this.pacienteRepo.buscarPacienteTodos();
	}

}
