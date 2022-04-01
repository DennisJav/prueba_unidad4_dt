package ec.edu.service;

import java.util.List;

import ec.edu.modelo.Paciente;

public interface IPacienteService {
	void insertarPaciente(Paciente paciente);
	Paciente buscarPacienteCedula(String cedula);
	List<Paciente> buscarPacienteTodos();
	
}
