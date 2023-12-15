package com.voya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voya.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	
}
