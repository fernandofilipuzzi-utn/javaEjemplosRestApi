package com.ejemplos.restapirepository.dto;

public class UsuarioDTO {
	

	private String nombre;
	private String clave;
	
	public UsuarioDTO(String nombre, String clave) {
		super();
		this.nombre = nombre;
		this.clave = clave;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String usuario) {
		this.nombre = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
}
