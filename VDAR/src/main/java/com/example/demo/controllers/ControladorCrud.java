package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.repository.MunicipioCrud;

@Controller
@RequestMapping("/crud")
public class ControladorCrud {
	
	@Autowired
	private MunicipioCrud uc;
	
	@RequestMapping(value="/consulta_municipios", method = RequestMethod.GET)
    public String listaMunicipios(ModelMap mp){
        mp.put("municipios",uc.findAll());
        return "/crud/consulta_municipios";
    }

}
