package com.example.Javier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Javier.model.Usuario;
import com.example.Javier.repository.UsuarioRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
     
    public Usuario registrar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

}
