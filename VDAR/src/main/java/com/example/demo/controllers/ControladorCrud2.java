package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.repository.CasasCrud;
import com.example.demo.repository.MunicipioCrud;

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

}

