package com.ejemplos.restapirepository.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//https://spring.io/guides/gs/spring-boot

//https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#getting-started.first-application
//https://spring.io/guides/gs/spring-boot

/*
* en el navegador poner http://localhost:8080/api/ 
* no olvidar la barra ultima
* */


@RestController()
@RequestMapping(value = "/api")
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
