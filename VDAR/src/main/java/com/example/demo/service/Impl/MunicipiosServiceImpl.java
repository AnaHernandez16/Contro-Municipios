package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Municipio;
import com.example.demo.repository.MunicipiosRepository;
import com.example.demo.service.MunicipiosService;



@Service("municipiosservice")
public class MunicipiosServiceImpl implements MunicipiosService{

	@Autowired
	@Qualifier("municipiosrepository")
	private MunicipiosRepository municipiosRepository;
	
	@Override
	public Municipio addMunicipio(Municipio municipio) {
		
		return municipiosRepository.save(municipio);
	}


}
