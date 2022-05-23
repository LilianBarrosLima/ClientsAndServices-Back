package com.cliente.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cliente.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
	Optional<Usuario> findByUsername(String username);
	
    boolean existsByUsername(String username); //the same as select count(*) > 0 from usuario where username = :login
}
