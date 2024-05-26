package com.ejemplos.restapiauthtokenjwt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplos.restapiauthtokenjwt.dto.LoginRequestDTO;
import com.ejemplos.restapiauthtokenjwt.utils.JwtUtil;

@RestController
public class AuthController 
{
    @PostMapping("/login")
    public String login(@RequestBody LoginRequestDTO request) {
        // Authenticate the user (e.g., using Spring Security's authentication manager)
        // If authentication is successful, generate a JWT
        String token = JwtUtil.generateToken(request.getUsername());
        return token;
    }
}
