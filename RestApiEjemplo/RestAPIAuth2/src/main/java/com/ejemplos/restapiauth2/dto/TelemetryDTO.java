package com.ejemplos.restapiauth2.dto;

import java.util.Date;

public class TelemetryDTO {
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
