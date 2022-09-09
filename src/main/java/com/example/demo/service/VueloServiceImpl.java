package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IVueloRepository;
import com.example.demo.repository.modelo.VueloSencillo;

@Service
public class VueloServiceImpl implements IVueloService {
	
	@Autowired
	private IVueloRepository vueloRepository;

	@Override
	public List<VueloSencillo> buscarVuelos(String origen, String destino, LocalDateTime fechaVuelo) {
		// TODO Auto-generated method stub
		return this.vueloRepository.buscarVuelos(origen, destino, fechaVuelo);
	}
}
