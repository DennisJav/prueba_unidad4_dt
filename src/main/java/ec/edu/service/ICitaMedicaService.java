package ec.edu.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import ec.edu.modelo.CitaMedica;


public interface ICitaMedicaService {

	void insertarCita(Integer numero, LocalDateTime fechaCita, BigDecimal valor, String lugarCita, String cedulaDoctor, String cedulaPaciente);
	void actualizarCita(Integer numero, String diagnostico, String receta, LocalDateTime fechaControl);
	List<CitaMedica> buscarCitasTodos();
}
