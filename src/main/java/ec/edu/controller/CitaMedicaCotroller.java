package ec.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ec.edu.modelo.CitaMedica;
import ec.edu.modelo.Paciente;
import ec.edu.repository.ICitaMedicaRepo;
import ec.edu.service.ICitaMedicaService;
import ec.edu.service.IPacienteService;

@Controller
@RequestMapping("/citaMedica/")
public class CitaMedicaCotroller {
	@Autowired
	private ICitaMedicaService citaService;
	
	@GetMapping("todos")
	public String buscarEstudiantesTodos(Model modelo) {
		List<CitaMedica> listacitas = this.citaService.buscarCitasTodos();
		modelo.addAttribute("citaMedica", listacitas);
		return "lista";
	}
	
	
	
	@GetMapping("citanueva")
	public String obtenerpaginaIngresoDatos(CitaMedica citaMedica) {
		return "citanueva";
	}
	
	@PostMapping("insertar")
	public String insertarPaciente(, BindingResult result, Model modelo, RedirectAttributes redirectAttrs) {
		
		this.citaService.insertarCita(null, null, null, null, null, null);
		redirectAttrs.addFlashAttribute("mensaje","Paciente guardado");
		
		return "redirect:todos";
	}
}
