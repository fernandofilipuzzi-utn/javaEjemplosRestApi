package com.ejemplos.restapirepository.controllers;

import java.util.List;
import java.util.stream.Collectors;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplos.restapirepository.dto.UsuarioDTO;
import com.ejemplos.restapirepository.models.Usuario;
import com.ejemplos.restapirepository.service.IUsuarioService;

//https://docs.spring.io/spring-data/jpa/reference/repositories/custom-implementations.html
@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    @Autowired
    IUsuarioService usuarioService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<UsuarioDTO> get(@PathVariable("id") Integer id) 
    {
        Usuario usuario = usuarioService.getOne(id);
        if (usuario != null) 
        {
            UsuarioDTO usr = new UsuarioDTO(usuario.getNombre(), usuario.getClave());
            return new ResponseEntity<>(usr, HttpStatus.OK);
        } 
        else 
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> getAll() {
        List<Usuario> usuarios = usuarioService.getAll();
        List<UsuarioDTO> usuariosDTO = usuarios.stream()
                .map(u -> new UsuarioDTO(u.getNombre(), u.getClave()))
                .collect(Collectors.toList());
        return new ResponseEntity<>(usuariosDTO, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> post(@RequestBody UsuarioDTO nuevo) {
        Usuario usr = new Usuario(nuevo.getNombre(), nuevo.getClave());
        Usuario savedUser = usuarioService.save(usr);
        UsuarioDTO savedUserDTO = new UsuarioDTO(savedUser.getNombre(), savedUser.getClave());
        return new ResponseEntity<>(savedUserDTO, HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<UsuarioDTO> put(@PathVariable("id") Integer id, @RequestBody UsuarioDTO nuevo) {
        Usuario usuarioExistente = usuarioService.getOne(id);
        if (usuarioExistente != null) {
            usuarioExistente.setNombre(nuevo.getNombre());
            usuarioExistente.setClave(nuevo.getClave());
            Usuario updatedUser = usuarioService.save(usuarioExistente);
            UsuarioDTO updatedUserDTO = new UsuarioDTO(updatedUser.getNombre(), updatedUser.getClave());
            return new ResponseEntity<>(updatedUserDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        Usuario usuario = usuarioService.getOne(id);
        if (usuario != null) {
            usuarioService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
  
}
