package com.ejemplos.all.controller;

import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplos.restapiauthtokenjwt.dto.AutorizacionDTO;
import com.ejemplos.restapiauthtokenjwt.dto.LoginRequestDTO;
import com.ejemplos.restapiauthtokenjwt.utils.JwtUtil;

@RestController
public class AuthController 
{
	
    @PostMapping("/login")
    @ResponseBody
    public ResponseEntity<AutorizacionDTO> login(@RequestBody LoginRequestDTO request) {
        // Authenticate the user (e.g., using Spring Security's authentication manager)
        // If authentication is successful, generate a JWT
    	
    	boolean granted=true;//usuario.consulta(request.getUsername(),request.getUserPasword() );
    	
    	if(granted)
    	{
	        String token = JwtUtil.generateToken(request.getUsername());
	        AutorizacionDTO auth=new AutorizacionDTO();
	        auth.setToken(token);
	        return new ResponseEntity<AutorizacionDTO>(auth, HttpStatus.OK);
    	}
    	return null; 
    }
   
}
