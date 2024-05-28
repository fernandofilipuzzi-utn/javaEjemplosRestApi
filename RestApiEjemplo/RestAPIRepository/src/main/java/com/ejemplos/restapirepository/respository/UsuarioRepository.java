package com.ejemplos.restapirepository.respository;

import org.springframework.data.repository.CrudRepository;

import com.ejemplos.restapirepository.models.Usuario;


//https://docs.spring.io/spring-data/jpa/reference/repositories/custom-implementations.html

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}
