package com.cursojava.curso.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.curso.models.Usuario;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario")
    public Usuario getUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Alejandro");
        usuario.setApellido("Reyes");
        usuario.setEmail("alejo@gmail.com");
        usuario.setTelefono("1234");
        usuario.setPassword("4321");
        return usuario;
    }
}
