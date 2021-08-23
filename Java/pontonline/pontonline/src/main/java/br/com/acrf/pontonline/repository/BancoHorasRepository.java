package br.com.acrf.pontonline.repository;


import br.com.acrf.pontonline.model.BancoHoras;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancoHorasRepository extends JpaRepository<BancoHoras, Long> {
}
