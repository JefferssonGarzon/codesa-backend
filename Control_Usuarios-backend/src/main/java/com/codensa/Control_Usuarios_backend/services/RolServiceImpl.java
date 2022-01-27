package com.codensa.Control_Usuarios_backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codensa.Control_Usuarios_backend.dao.RolDAO;
import com.codensa.Control_Usuarios_backend.domain.Rol;

@Service
public class RolServiceImpl implements RolServices{

	@Autowired
	private RolDAO rolDAO;
	
	@Override
	@Transactional
	public Rol crear(Rol rol) {
		return rolDAO.save(rol);
	}

	@Override
	public List<Rol> listar() {
		return rolDAO.findAll();
	}

	@Override
	public void eliminar(Rol rol) {
		rolDAO.delete(rol);
	}

	@Override
	@Transactional(readOnly = true)
	public Rol encontrarRol(Rol rol) {
		return rolDAO.findById(rol.getIdRol()).orElse(null);
	}

	@Override
	public Rol actualizar(Rol rol) {
		return rolDAO.save(rol);
	}

}
