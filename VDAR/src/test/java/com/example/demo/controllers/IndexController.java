package com.example.demo.controllers;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Casa;

import com.example.demo.service.CasasService;





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
	
	@Autowired
	@Qualifier("casasservice")
	private CasasService casasService;
	
	@GetMapping("/formulario_casas")
	public ModelAndView formCasas(Model model) {
		
		model.addAttribute("titulo", "Formulario casas");
		ModelAndView mav = new ModelAndView("formulario_casas");
		mav.addObject("casa", new Casa());
		return mav;
	}
	
	@PostMapping("/agregarCasa")
	public String addUsers(@ModelAttribute(name="casa") Casa casa) {
		casasService.addCasa(casa);
		return "redirect:/app/formulario_casas";
	}
	
	
}
