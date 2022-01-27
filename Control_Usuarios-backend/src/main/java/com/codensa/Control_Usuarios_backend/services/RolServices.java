package com.codensa.Control_Usuarios_backend.services;

import java.util.List;

import com.codensa.Control_Usuarios_backend.domain.Rol;

public interface RolServices {

	public Rol crear(Rol rol);
	
	public Rol actualizar(Rol rol);

	public List<Rol> listar();

	public void eliminar(Rol rol);

	public Rol encontrarRol(Rol rol);
}
