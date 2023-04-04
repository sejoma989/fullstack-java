package com.cursojava.gestionusuarios.controllers;

import com.cursojava.gestionusuarios.dao.UsuarioDao;
import com.cursojava.gestionusuarios.models.Usuario;
import com.cursojava.gestionusuarios.utils.JWTUtil;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Joselo");
        usuario.setApellido("Valencia");
        usuario.setEmail("joselo@gmail.com");
        usuario.setTelefono("354435");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(@RequestHeader(value = "Autorization") String token ) {
        if (!validarToken(token)) { return null; }
        return usuarioDao.getUsuarios();
    }

    private boolean validarToken(String token) {
        String usuarioId = jwtUtil.getKey(token);
        return usuarioId != null;
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario) {

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1, 1024, 1,usuario.getPassword());
        usuario.setPassword(hash);

        usuarioDao.registrarUsuario(usuario);
    }

    @RequestMapping(value = "usuariomod")
    public Usuario modifyUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Joselo");
        usuario.setApellido("Valencia");
        usuario.setEmail("joselo@gmail.com");
        usuario.setTelefono("354435");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void deleteUsuario(
                            @RequestHeader(value = "Autorization") String token,
                            @PathVariable Long id ) {
        if (!validarToken(token)) { return; }
        usuarioDao.deleteUsuario(id);
    }

    @RequestMapping(value = "usuariosea")
    public Usuario searchUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Joselo");
        usuario.setApellido("Valencia");
        usuario.setEmail("joselo@gmail.com");
        usuario.setTelefono("354435");
        return usuario;
    }

}
