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

import com.codensa.Control_Usuarios_backend.domain.Rol;
import com.codensa.Control_Usuarios_backend.services.RolServices;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/rol/")
public class RolController {

	@Autowired
	private RolServices rolServices;
	
	@PostMapping("/crear")
	public Rol crearRol(@RequestBody Rol rol) {
		return rolServices.crear(rol);
	}
	
	@PutMapping("/actualizar/{idRol}")
	public Rol actualizarRol(@RequestBody Rol rol) {
		return rolServices.actualizar(rol);
	}
	
	@GetMapping("/listar")
	public List<Rol> listar() {
		return rolServices.listar();
	}
	
	@GetMapping("/encontrar/{idRol}")
	public Rol obtenerRol(Rol rol) {
		return rolServices.encontrarRol(rol);
	}
	
	@DeleteMapping("/eliminar/{idRol}")
	@ResponseStatus(value = HttpStatus.OK, reason = "El Rol ha sido eliminado con exito")
	public void eliminarRol(Rol rol) {
		rolServices.eliminar(rol);
	}
}
