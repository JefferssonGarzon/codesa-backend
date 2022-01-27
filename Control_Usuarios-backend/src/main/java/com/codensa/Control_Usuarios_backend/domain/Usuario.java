package com.codensa.Control_Usuarios_backend.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	@NotEmpty
	private String nombre;
	
	@NotEmpty
	private String activo;
	
	@OneToOne
	@JoinColumn(name = "id_rol_FK")
	private Rol rol;
	
}
