package ec.edu.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.CitaMedica;
import ec.edu.modelo.Doctor;
import ec.edu.modelo.Paciente;
import ec.edu.repository.ICitaMedicaRepo;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{

	@Autowired
	private ICitaMedicaRepo citaMedicaRepo;
	@Autowired
	private IDoctorService doctorService;
	@Autowired
	private IPacienteService pacienteService;

	@Override
	public void insertarCita(Integer numero, LocalDateTime fechaCita, BigDecimal valor, String lugarCita, String cedulaDoctor, String cedulaPaciente) {
		// TODO Auto-generated method stub
		
	
		Paciente pac = this.pacienteService.buscarPacienteCedula(cedulaPaciente);
		Doctor doc = this.doctorService.buscarDoctorCedula(cedulaPaciente);
		
	
		
		CitaMedica citanueva =  new CitaMedica();
		citanueva.setNumero(numero);
		citanueva.setFecha_cita(fechaCita);
		citanueva.setValorCita(valor);
		citanueva.setLugarCita(lugarCita);
		citanueva.setDoctor(doc);
		citanueva.setPaciente(pac);
		
		this.citaMedicaRepo.insertarCita(citanueva);
		
		
	}

	@Override
	public void actualizarCita(Integer numero, String diagnostico, String receta, LocalDateTime fechaControl) {
		// TODO Auto-generated method stub
		CitaMedica ci = this.citaMedicaRepo.buscarNumero(numero);
		ci.setId(ci.getId());
		ci.setDiagnostico(diagnostico);
		ci.setReceta(receta);
		ci.setFechaControl(fechaControl);
		
		this.citaMedicaRepo.actualizarCita(ci);
		
	}

	@Override
	public List<CitaMedica> buscarCitasTodos() {
		// TODO Auto-generated method stub
		return this.citaMedicaRepo.buscarCitasTodos();
	}
	
	


	
	
}
