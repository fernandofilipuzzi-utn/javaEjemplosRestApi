package com.ejemplos.resttestunit;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#getting-started.first-application
//https://spring.io/guides/gs/spring-boot

/*
 * en el navegador poner http://localhost:8080/api/ 
 * no olvidar la barra ultima
 * */


@RestController()
@RequestMapping(value = "/api")
@SpringBootApplication
public class RestTestUnitApplication {

	@GetMapping("/")
	public String index() {
		return "Hola mundo!";
	}
	
    public static void main(String[] args) 
    {	
        SpringApplication.run(RestTestUnitApplication.class, args);
    }

}
