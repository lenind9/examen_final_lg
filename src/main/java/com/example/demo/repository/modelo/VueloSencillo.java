package com.example.demo.repository.modelo;

import java.math.BigDecimal;

public class VueloSencillo {
	
	private String numeroVuelo;
	private String origen;
	private String destino;
	private String nombreAvion;
	private BigDecimal valorAsiento;
	
	public VueloSencillo() {
		// TODO Auto-generated constructor stub
	}

	public VueloSencillo(String numeroVuelo, String origen, String destino, String nombreAvion,
			BigDecimal valorAsiento) {
		super();
		this.numeroVuelo = numeroVuelo;
		this.origen = origen;
		this.destino = destino;
		this.nombreAvion = nombreAvion;
		this.valorAsiento = valorAsiento;
	}
	
	//SET y GET
	public String getNumeroVuelo() {
		return numeroVuelo;
	}

	public void setNumeroVuelo(String numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getNombreAvion() {
		return nombreAvion;
	}

	public void setNombreAvion(String nombreAvion) {
		this.nombreAvion = nombreAvion;
	}

	public BigDecimal getValorAsiento() {
		return valorAsiento;
	}

	public void setValorAsiento(BigDecimal valorAsiento) {
		this.valorAsiento = valorAsiento;
	}
	
}
