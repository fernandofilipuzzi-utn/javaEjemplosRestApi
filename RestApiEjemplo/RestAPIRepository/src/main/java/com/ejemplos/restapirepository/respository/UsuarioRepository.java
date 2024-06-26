package com.ejemplos.restapirepository.respository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ejemplos.restapirepository.models.Usuario;


//https://docs.spring.io/spring-data/jpa/reference/repositories/custom-implementations.html

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

	List<Usuario> findByNombreAndClave(String nombre, String clave);
	
	//@Query("select u from User u")
	//Stream<User> streamAllPaged(Pageable pageable);
}
