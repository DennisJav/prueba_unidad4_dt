package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Doctor;
import ec.edu.repository.IDoctorRepo;

@Service
public class IDoctorServiceImpl implements IDoctorService{

	@Autowired
	private IDoctorRepo doctorRepo;
	
	@Override
	public void guardarDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepo.guardarDoctor(doctor);
	}

	@Override
	public void actualizarDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepo.actualizarDoctor(doctor);
	}

	@Override
	public Doctor buscarDoctor(Integer id) {
		// TODO Auto-generated method stub
		return this.doctorRepo.buscarDoctor(id);
	}

	@Override
	public void eliminarDoctor(Integer id) {
		// TODO Auto-generated method stub
		this.doctorRepo.eliminarDoctor(id);
	}

	@Override
	public Doctor buscarDoctorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.doctorRepo.buscarDoctorCedula(cedula);
	}

	
	
	
}
