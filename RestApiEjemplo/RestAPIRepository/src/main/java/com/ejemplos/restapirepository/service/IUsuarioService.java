package com.ejemplos.restapirepository.service;

import java.util.List;

import com.ejemplos.restapirepository.models.Usuario;

public interface IUsuarioService {
	
	Usuario getOne(int id);
	List<Usuario> getAll();
	Usuario save(Usuario nuevo);
	void delete(int id);
}
