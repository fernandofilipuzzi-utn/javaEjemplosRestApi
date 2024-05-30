package com.ejemplos.restapi.controller;

import java.util.Date;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplos.restapi.dto.TelemetryDTO;

//https://docs.spring.io/spring-security/reference/servlet/oauth2/client/authorized-clients.html

//https://github.com/angeloimm/springbasicauth/blob/master/src/main/java/it/olegna/test/basic/config/WebSecConfig.java


@RestController()
@RequestMapping(value = "/telemetry")
public class TelemetryController 
{
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<TelemetryDTO> status() 
	{
		Random rand = new Random(); 
		 
		TelemetryDTO prueba=new TelemetryDTO();
		
		prueba.distancia= rand.nextDouble()*100;
		prueba.fecha=new Date();
		
        return new ResponseEntity<TelemetryDTO>(prueba, HttpStatus.OK);
	}
	
}
