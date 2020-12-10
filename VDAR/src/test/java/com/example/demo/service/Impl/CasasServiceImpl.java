package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Casa;
import com.example.demo.repository.CasasRepository;
import com.example.demo.service.CasasService;

@Service("casasservice")
public class CasasServiceImpl implements CasasService{

	@Autowired
	@Qualifier("casasrepository")
	private CasasRepository casasRepository;
	
	@Override
	public Casa addCasa(Casa casa) {
		
		return casasRepository.save(casa);
	}

}
