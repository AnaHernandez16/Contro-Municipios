package com.example.demo.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/app")
public class IndexController {
	

	@GetMapping({"/","","/home"})
	public String index(Model model) {
		
		model.addAttribute("titulo", "Control municipios");
		
		return "home";
	}
	

	@GetMapping({"/formulario_consulta"})
	public String Menu(Model model) {
		
		model.addAttribute("titulo", "Control municipios");
		
		return "formulario_consulta";
	}
	
	@GetMapping({"/formulario_consulta2"})
	public String Menu2(Model model) {
		
		model.addAttribute("titulo", "Control municipios");
		
		return "formulario_consulta2";
	}
	
}
