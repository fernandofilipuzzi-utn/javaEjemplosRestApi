package com.ejemplos.restapiauthtokenjwt.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProtectedResourceController {

    @GetMapping("/protected")
    @Secured("ROLE_USER") // Role-based authorization
    public String protectedResource() {
        return "This is a protected resource.";
    }
    
    @GetMapping("/noprotected")
   // @Secured("ROLE_USER") // Role-based authorization
    public String noProtectedResource() {
        return "This is not a protected resource.";
    }
}