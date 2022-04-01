package ec.edu.service;

import ec.edu.modelo.Doctor;

public interface IDoctorService {
	void guardarDoctor(Doctor doctor);
	void actualizarDoctor(Doctor doctor);
	Doctor buscarDoctor(Integer id);
	void eliminarDoctor(Integer id);
	Doctor buscarDoctorCedula(String cedula);
}
