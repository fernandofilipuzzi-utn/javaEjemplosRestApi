package com.ejemplos.webmvcthymeleafbasico.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//https://www.arquitecturajava.com/spring-boot-thymeleaf-y-su-configuracion/

@Controller
public class HelloController {
	
  @RequestMapping("/hola")
  public String hola(Model modelo) 
  {
    modelo.addAttribute("mensaje","hola desde thymeleaf");
    return "hola";
  }
}
