package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.VueloSencillo;
import com.example.demo.service.IVueloService;

@Controller
@RequestMapping("/vuelo")
public class ClienteController {
	
	@Autowired
	private IVueloService vueloService;
	
	@GetMapping("/buscar")
	public String buscarVuelos(String origen, String destino, String fechaVuelo, Model modelo) {
		LocalDateTime fecha = LocalDateTime.parse(fechaVuelo);
		List<VueloSencillo> listaVuelos = this.vueloService.buscarVuelos(origen, destino, fecha);
		modelo.addAttribute(listaVuelos);
		return "vistaVuelos";
	}
}
