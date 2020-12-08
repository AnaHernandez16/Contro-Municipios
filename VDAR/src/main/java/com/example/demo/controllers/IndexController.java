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
	public String segundex(Model model) {
		
		model.addAttribute("titulo", "Control municipios");
		
		return "formulario_consulta";
	}
	
}
