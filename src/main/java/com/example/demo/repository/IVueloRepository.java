package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.repository.modelo.VueloSencillo;

public interface IVueloRepository {
	public List<VueloSencillo> buscarVuelos(String origen, String destino, LocalDateTime fechaVuelo);
}
