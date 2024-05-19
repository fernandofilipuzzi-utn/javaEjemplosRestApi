package com.ejemplos.restapi.models;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Telemetry {

	public Date fecha;
	public double distancia;
	
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
