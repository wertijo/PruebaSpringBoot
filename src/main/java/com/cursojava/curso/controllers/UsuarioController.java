package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import com.cursojava.curso.models.Usuario;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void postUsuario(@RequestBody Usuario usuario){
       usuarioDao.registrarUsuario(usuario);
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void borrarUsuario(@PathVariable Long id){
        usuarioDao.eliminarUsuario(id);
    }
}
