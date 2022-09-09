package com.example.demo.repository.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "avion")
public class Avion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "avio_seq_id")
	@SequenceGenerator(name = "avio_seq_id", sequenceName = "avio_seq_id", allocationSize = 1)
	@Column(name = "avio_id")
	private Integer id;
	
	@Column(name = "avio_nombre_avion")
	private String nombreAvion;
	
	@Column(name = "avio_numero")
	private String numero;
	
	@Column(name = "avio_capacidad_asientos")
	private Integer capacidadAsientos;
	
	@OneToMany(mappedBy = "avion")
	private List<Vuelo> vuelos;

	//SET y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreAvion() {
		return nombreAvion;
	}

	public void setNombreAvion(String nombreAvion) {
		this.nombreAvion = nombreAvion;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Integer getCapacidadAsientos() {
		return capacidadAsientos;
	}

	public void setCapacidadAsientos(Integer capacidadAsientos) {
		this.capacidadAsientos = capacidadAsientos;
	}

	public List<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}
	
}
