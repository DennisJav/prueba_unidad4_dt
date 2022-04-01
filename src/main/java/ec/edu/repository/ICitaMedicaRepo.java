package ec.edu.repository;

import java.util.List;

import ec.edu.modelo.CitaMedica;
import ec.edu.modelo.Paciente;

public interface ICitaMedicaRepo {

	void insertarCita(CitaMedica citaMedica);
	void actualizarCita(CitaMedica citaMedica);
	CitaMedica buscarNumero(Integer numero);
	List<CitaMedica> buscarCitasTodos();
}
