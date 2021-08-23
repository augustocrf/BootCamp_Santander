package br.com.acrf.pontonline.service;

import br.com.acrf.pontonline.model.Movimentacao;
import br.com.acrf.pontonline.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {

    MovimentacaoRepository movimentacaoRepository;

    @Autowired
    public MovimentacaoService(MovimentacaoRepository movimentacaoRepository) {
        this.movimentacaoRepository = movimentacaoRepository;
    }

    public Movimentacao save(Movimentacao movimentacao) {
        return movimentacaoRepository.save(movimentacao);
    }

    public Movimentacao update(Movimentacao movimentacao) {
        return movimentacaoRepository.save(movimentacao);
    }

    public void delete(Long id) throws Exception {
        movimentacaoRepository.deleteById(id);
    }

    public List<Movimentacao> findAll() {
        return movimentacaoRepository.findAll();
    }

    public Optional<Movimentacao> findByID(Long id) {
        return movimentacaoRepository.findById(id);
    }
}
