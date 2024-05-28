package com.ejemplos.restapirepository.service;

import com.ejemplos.restapirepository.models.Usuario;

public interface IUsuarioService {
	
	Usuario getOne(int id);
	Usuario save(Usuario nuevo);
}
