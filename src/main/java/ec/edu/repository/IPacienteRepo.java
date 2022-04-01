package ec.edu.repository;

import java.util.List;

import ec.edu.modelo.Doctor;
import ec.edu.modelo.Paciente;

public interface IPacienteRepo {

	void insertarPaciente(Paciente paciente);
	Paciente buscarPacienteCedula(String cedula);
	List<Paciente> buscarPacienteTodos();
	
}
