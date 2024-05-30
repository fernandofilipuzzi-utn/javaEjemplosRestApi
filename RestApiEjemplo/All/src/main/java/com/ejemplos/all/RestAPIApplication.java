package com.ejemplos.all;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#getting-started.first-application
//https://spring.io/guides/gs/spring-boot

/*
 * en el navegador poner http://localhost:8080/api/ 
 * no olvidar la barra ultima
 * */

@RestController
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) //resuelve el error: Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
public class RestAPIApplication {
	 @RequestMapping("/")
	    String home() {
	        return "Hello World!";
	    }

	    public static void main(String[] args) 
	    {
	        SpringApplication.run(RestAPIApplication.class, args);
	    }

}
