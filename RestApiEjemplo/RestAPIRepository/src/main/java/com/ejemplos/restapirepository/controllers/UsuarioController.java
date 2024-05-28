package com.ejemplos.restapirepository.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplos.restapirepository.dto.UsuarioDTO;
import com.ejemplos.restapirepository.models.Usuario;
import com.ejemplos.restapirepository.service.IUsuarioService;

//https://docs.spring.io/spring-data/jpa/reference/repositories/custom-implementations.html
@RestController()
@RequestMapping(value = "/usuarios")
public class UsuarioController 
{
	@Autowired
	IUsuarioService usuarioService;
	
	@GetMapping(value = "/{id}")
	@ResponseBody
	public ResponseEntity<UsuarioDTO> get(@PathParam("id")Integer id) 
	{
		Usuario usuario=usuarioService.getOne(id);
		
		UsuarioDTO usr=new UsuarioDTO(usuario.getNombre(),usuario.getClave());
		
        return new ResponseEntity<UsuarioDTO>(usr, HttpStatus.OK);
	}
	
	
	@PutMapping
	@ResponseBody
	public ResponseEntity<UsuarioDTO> put(@RequestBody UsuarioDTO nuevo) 
	{
		
		Usuario usr=new Usuario(nuevo.getNombre(),nuevo.getClave());
				
		Usuario id=usuarioService.save(usr);
						
        return new ResponseEntity<UsuarioDTO>(nuevo, HttpStatus.OK);
	}
	
	
	/*
	@GetMapping(value = "status/{id}")
	@ResponseBody
	public ResponseEntity<TelemetryDTO> getStatus(int id) 
	{
	
		Optional<Telemetry> valor=telemetryService.getOne(id);
		
	
		
			TelemetryDTO neuvo=new TelemetryDTO();
			Telemetry tele=valor.get();				
		
		
		
		return new ResponseEntity<TelemetryDTO>(tele, HttpStatus.OK);
	}
	*/
}
