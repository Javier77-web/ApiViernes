package com.example.Javier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Javier.model.Usuario;
import com.example.Javier.service.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    
    @PostMapping
    public ResponseEntity<Usuario> add(@RequestBody Usuario usuario) {
        Usuario nuevo = usuarioService.registrar(usuario);
        
        return ResponseEntity.status(201).body(nuevo);
    }
    
}
