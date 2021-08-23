package br.com.acrf.pontonline.repository;

import br.com.acrf.pontonline.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
}