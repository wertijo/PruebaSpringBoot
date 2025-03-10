package com.cursojava.curso.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.curso.models.Usuario;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Alejandro");
        usuario.setApellido("Reyes");
        usuario.setEmail("alejo@gmail.com");
        usuario.setTelefono("1234");
        usuario.setPassword("4321");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List <Usuario> usuarios = new ArrayList<>();

        Usuario usuario1 = new Usuario();
        usuario1.setId(1L);
        usuario1.setNombre("Alejandro");
        usuario1.setApellido("Reyes");
        usuario1.setEmail("alejo@gmail.com");
        usuario1.setTelefono("1234");
        usuario1.setPassword("4321");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNombre("Angel");
        usuario2.setApellido("Lol");
        usuario2.setEmail("angel@gmail.com");
        usuario2.setTelefono("5678");
        usuario2.setPassword("8765");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3L);
        usuario3.setNombre("Jairo");
        usuario3.setApellido("Muñoz");
        usuario3.setEmail("jairo@gmail.com");
        usuario3.setTelefono("1011");
        usuario3.setPassword("1110");

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }

    @RequestMapping(value = "usuario1")
    public Usuario editarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Alejandro");
        usuario.setApellido("Reyes");
        usuario.setEmail("alejo@gmail.com");
        usuario.setTelefono("1234");
        usuario.setPassword("4321");
        return usuario;
    }

    @RequestMapping(value = "usuario2")
    public Usuario eliminarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Alejandro");
        usuario.setApellido("Reyes");
        usuario.setEmail("alejo@gmail.com");
        usuario.setTelefono("1234");
        usuario.setPassword("4321");
        return usuario;
    }

    @RequestMapping(value = "usuario3")
    public Usuario buscarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Alejandro");
        usuario.setApellido("Reyes");
        usuario.setEmail("alejo@gmail.com");
        usuario.setTelefono("1234");
        usuario.setPassword("4321");
        return usuario;
    }
}
