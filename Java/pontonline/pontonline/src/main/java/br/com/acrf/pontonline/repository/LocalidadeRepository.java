package br.com.acrf.pontonline.repository;

import br.com.acrf.pontonline.model.Localidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalidadeRepository extends JpaRepository<Localidade, Long> {
}