package br.com.acrf.pontonline.repository;

import br.com.acrf.pontonline.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}