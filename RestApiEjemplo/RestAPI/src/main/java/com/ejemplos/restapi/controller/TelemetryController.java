package com.ejemplos.restapi.controller;


import java.util.Date;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplos.restapi.dto.TelemetryDTO;

@RestController()
@RequestMapping(value = "/telemetry")
public class TelemetryController 
{
	//solicitud de datos
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
	
	//solicitud de ejecición de comando
	@PostMapping
	@ResponseBody
	public ResponseEntity<TelemetryDTO> postStatus(TelemetryDTO dto) 
	{
		Random rand = new Random(); 
		 
		TelemetryDTO prueba=new TelemetryDTO();
		
		prueba.distancia= rand.nextDouble()*100;
		prueba.fecha=new Date();
		
        return new ResponseEntity<TelemetryDTO>(prueba, HttpStatus.OK);
	}
	
}
