package br.com.acrf.pontonline.repository;

import br.com.acrf.pontonline.model.CategoriaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaUsuario, Long>  {
}
