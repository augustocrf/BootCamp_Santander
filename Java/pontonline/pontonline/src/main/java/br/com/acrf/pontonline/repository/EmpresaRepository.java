package br.com.acrf.pontonline.repository;

import br.com.acrf.pontonline.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}