package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.repository.CasasCrud;

@Controller
@RequestMapping("/crud")
public class ControladorCrud2 {
	
	@Autowired
	private CasasCrud uc;
	
	@RequestMapping(value="/consulta_casas", method = RequestMethod.GET)
    public String listaCasas(ModelMap mp){
        mp.put("casas",uc.findAll());
        return "/crud/consulta_casas";
    }

	/*
	@RequestMapping(value="/borrar/{numero_casa}", method=RequestMethod.GET)
	private String borrar(@PathVariable("numero_casa") long numero_casaCasa, ModelMap mp){
		uc.deleteAll();
	    
	    mp.put("casas",uc.findAll());
	    return "redirect:/crud/consulta_casas";
	}*/
	
	
	
	
	
}

