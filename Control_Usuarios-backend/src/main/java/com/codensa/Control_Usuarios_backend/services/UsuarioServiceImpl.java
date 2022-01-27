package com.codensa.Control_Usuarios_backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codensa.Control_Usuarios_backend.dao.UsuarioDAO;
import com.codensa.Control_Usuarios_backend.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioServices{

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Override
	@Transactional
	public Usuario crear(Usuario usuario) {
		return usuarioDAO.save(usuario);
	}

	@Override
	public List<Usuario> listar() {
		return usuarioDAO.findAll();
	}
	@Override
	public void eliminar(Usuario usuario) {
		usuarioDAO.delete(usuario);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario encontrarUsuario(Usuario usuario) {
		return usuarioDAO.findById(usuario.getIdUsuario()).orElse(null);
	}

	@Override
	public Usuario actualizar(Usuario usuario) {
		return usuarioDAO.save(usuario);
	}
	
}
