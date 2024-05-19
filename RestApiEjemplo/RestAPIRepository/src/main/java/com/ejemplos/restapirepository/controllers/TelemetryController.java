package com.ejemplos.restapirepository.controllers;


import java.util.Date;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplos.restapirepository.dto.TelemetryDTO;

//https://docs.spring.io/spring-data/jpa/reference/repositories/custom-implementations.html
@RestController()
@RequestMapping(value = "/telemetry")
public class TelemetryController 
{
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<TelemetryDTO> getStatus() 
	{
		Random rand = new Random(); 
		 
		TelemetryDTO prueba=new TelemetryDTO();
		
		prueba.distancia= rand.nextDouble()*100;
		prueba.fecha=new Date();
		
        return new ResponseEntity<TelemetryDTO>(prueba, HttpStatus.OK);
	}
	
}
