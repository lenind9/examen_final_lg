package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.repository.modelo.VueloSencillo;

public interface IVueloService {
	public List<VueloSencillo> buscarVuelos(String origen, String destino, LocalDateTime fechaVuelo);
}
