package br.com.acrf.pontonline.service;

import br.com.acrf.pontonline.model.Localidade;
import br.com.acrf.pontonline.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {

    LocalidadeRepository localidadeRepository;

    @Autowired
    public LocalidadeService(LocalidadeRepository localidadeRepository) {
        this.localidadeRepository = localidadeRepository;
    }

    public Localidade save(Localidade localidade) {
        return localidadeRepository.save(localidade);
    }

    public Localidade update(Localidade localidade) {
        return localidadeRepository.save(localidade);
    }

    public void delete(Long id) throws Exception {
        localidadeRepository.deleteById(id);
    }

    public List<Localidade> findAll() {
        return localidadeRepository.findAll();
    }

    public Optional<Localidade> findByID(Long id) {
        return localidadeRepository.findById(id);
    }
}
