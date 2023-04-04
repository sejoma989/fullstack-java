package com.cursojava.gestionusuarios.dao;

import com.cursojava.gestionusuarios.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void deleteUsuario(Long id);

    void registrarUsuario(Usuario usuario);


    Usuario obtenerUsuarioPorCredenciales(Usuario usuario);
}
