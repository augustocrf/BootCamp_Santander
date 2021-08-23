package br.com.acrf.pontonline.repository;

import br.com.acrf.pontonline.model.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarioRepository extends JpaRepository<Calendario, Long> {
}
