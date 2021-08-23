package br.com.acrf.pontonline.service;

import br.com.acrf.pontonline.model.Ocorrencia;
import br.com.acrf.pontonline.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {
    OcorrenciaRepository ocorrenciaRepository;

    @Autowired
    public OcorrenciaService(OcorrenciaRepository ocorrenciaRepository)
    {
        this.ocorrenciaRepository = ocorrenciaRepository;
    }

    public Ocorrencia save(Ocorrencia ocorrencia){

        return ocorrenciaRepository.save(ocorrencia);
    }

    public Ocorrencia update(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }

    public void delete(long id){
        ocorrenciaRepository.deleteById(id);
    }

    public List<Ocorrencia> findAll() {
        return ocorrenciaRepository.findAll();
    }

    public Optional<Ocorrencia> getById(long id) {
        return ocorrenciaRepository.findById(id);
    }
}
