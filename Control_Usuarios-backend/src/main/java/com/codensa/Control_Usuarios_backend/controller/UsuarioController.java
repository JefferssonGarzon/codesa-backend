package com.codensa.Control_Usuarios_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.codensa.Control_Usuarios_backend.domain.Usuario;
import com.codensa.Control_Usuarios_backend.services.UsuarioServices;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/usuarios/")
public class UsuarioController {
	
	@Autowired
	private UsuarioServices usuarioService;
	
	@PostMapping("/crear")
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return usuarioService.crear(usuario);
	}
	
	@PutMapping("/actualizar/{idUsuario}")
	public Usuario actualizarUsuario(@RequestBody Usuario usuario) {
		return usuarioService.actualizar(usuario);
	}
	
	@GetMapping("/listar")
	public List<Usuario> listarUsuarios() {
		return usuarioService.listar();
	}
	
	@GetMapping("/encontrar/{idUsuario}")
	public Usuario encontrarUsuario(Usuario usuario) {
		return usuarioService.encontrarUsuario(usuario);
	}
	
	@DeleteMapping("/eliminar/{idUsuario}")
	@ResponseStatus(value = HttpStatus.OK, reason = "El Usuario ha sido eliminado con exito")
	public void eliminarUsuario(Usuario usuario) {
		usuarioService.eliminar(usuario);
	}
	
}
