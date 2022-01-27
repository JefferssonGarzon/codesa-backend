package com.codensa.Control_Usuarios_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codensa.Control_Usuarios_backend.domain.Rol;

public interface RolDAO extends JpaRepository<Rol, Long>{

}
