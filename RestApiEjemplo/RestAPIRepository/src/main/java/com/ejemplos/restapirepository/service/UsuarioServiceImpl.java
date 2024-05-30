package com.ejemplos.restapirepository.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ejemplos.restapirepository.models.Usuario;
import com.ejemplos.restapirepository.respository.UsuarioRepository;

//https://docs.spring.io/spring-data/jpa/docs/2.5.12/reference/html/

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	public Usuario getOne(int id) {
		Optional<Usuario> usr = usuarioRepository.findById(id);

		if (usr.isEmpty() == false)
			return usr.get();
		else
			return null;
	}

	@Override
	public List<Usuario> getAll() 
	{
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarioRepository.findAll().forEach(usuarios::add);
		return usuarios;
	}

	@Override
	public Usuario save(Usuario nuevo) {
		return usuarioRepository.save(nuevo);
	}

	@Override
	public void delete(int id) 
	{
		usuarioRepository.deleteById(id);
	}
}
