package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.VueloSencillo;

@Repository
@Transactional
public class VueloRepositoryImpl implements IVueloRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<VueloSencillo> buscarVuelos(String origen, String destino, LocalDateTime fechaVuelo) {
		// TODO Auto-generated method stub
		TypedQuery<VueloSencillo> myQuery = this.entityManager.createQuery("SELECT NEW com.example.demo.repository.modelo.VueloSencillo (v.numeroVuelo, v.origen, v.destino, v.nombreAvion, v.valorAsiento) FROM Vuelo v WHERE v.origen = :datoOrigen AND v.destino = :datoDestino AND v.fechaVuelo = :datoFechaVuelo", VueloSencillo.class);
		myQuery.setParameter("datoOrigen", origen);
		myQuery.setParameter("datoDestino", destino);
		myQuery.setParameter("datoFechaVuelo", fechaVuelo);
		return myQuery.getResultList();
	}
	
	

}
