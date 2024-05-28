package com.ejemplos.restapirepository.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ejemplos.restapirepository.models.Usuario;
import com.ejemplos.restapirepository.respository.UsuarioRepository;

@Component
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	UsuarioRepository usuario;
	
	public Usuario getOne(int id)
	{
		Optional<Usuario> usr=usuario.findById(id);
		
		if(usr.isEmpty()==false)
			return usr.get();
		else
			return null; 
	}
	
	public Usuario save(Usuario nuevo)
	{
		return usuario.save(nuevo);
	}
}
