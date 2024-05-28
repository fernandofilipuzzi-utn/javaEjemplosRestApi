package com.ejemplos.restapirepository.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity(name = "usuarios")
public class Usuario {

	public int id;
	private String nombre;
	private String clave;
	
	public Usuario(String usuario, String password) {
		super();
		this.nombre = usuario;
		this.clave = password;
	}
	
	@javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int valor) 
	{
		this.id=valor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
		
	
}
