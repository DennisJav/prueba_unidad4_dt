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

import ec.edu.modelo.Paciente;
import ec.edu.service.IPacienteService;


@Controller
@RequestMapping("/paciente/")
public class PacienteController {

	@Autowired
	private IPacienteService pacienteService;
	
	@GetMapping("todos")
	public String buscarEstudiantesTodos(Model modelo) {
		List<Paciente> listaEstudiantes = this.pacienteService.buscarPacienteTodos();
		modelo.addAttribute("estudiantes", listaEstudiantes);
		return "lista";
	}
	
	
	
	@GetMapping("pacientenuevo")
	public String obtenerpaginaIngresoDatos(Paciente paciente) {
		return "pacientenuevo";
	}
	
	@PostMapping("insertar")
	public String insertarPaciente(Paciente paciente, BindingResult result, Model modelo, RedirectAttributes redirectAttrs) {
		this.pacienteService.insertarPaciente(paciente); 
		
		redirectAttrs.addFlashAttribute("mensaje","Paciente guardado");
		
		return "redirect:todos";
	}
	
}
