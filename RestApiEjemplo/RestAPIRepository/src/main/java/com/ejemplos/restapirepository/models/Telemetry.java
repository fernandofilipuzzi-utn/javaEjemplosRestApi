package com.ejemplos.restapirepository.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Telemetry {

	public int id;
	public Date fecha;
	public double distancia;
	
	@javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int valor) 
	{
		this.id=valor;
	}
		
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double valor) 
	{
		this.distancia=valor;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date valor) 
	{
		this.fecha=valor;
	}
}
