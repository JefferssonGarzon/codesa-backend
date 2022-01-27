package com.codensa.Control_Usuarios_backend.services;

import java.util.List;

import com.codensa.Control_Usuarios_backend.domain.Usuario;

public interface UsuarioServices {

	public Usuario crear(Usuario usuario);
	
	public Usuario actualizar(Usuario usuario);

	public List<Usuario> listar();

	public void eliminar(Usuario usuario);

	public Usuario encontrarUsuario(Usuario usuario);
}
