package com.br.dataspring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.br.dataspring.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
