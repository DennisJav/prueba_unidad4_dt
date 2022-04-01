package ec.edu.repository;

import ec.edu.modelo.Doctor;

public interface IDoctorRepo {

	void guardarDoctor(Doctor doctor);
	void actualizarDoctor(Doctor doctor);
	Doctor buscarDoctor(Integer id);
	void eliminarDoctor(Integer id);
	Doctor buscarDoctorCedula(String cedula);
}
