package br.com.acrf.pontonline.service;

import br.com.acrf.pontonline.model.CategoriaUsuario;
import br.com.acrf.pontonline.model.NivelAcesso;
import br.com.acrf.pontonline.repository.CategoriaRepository;
import br.com.acrf.pontonline.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {
    NivelAcessoRepository nivelAcessoRepository;

    @Autowired
    public NivelAcessoService(NivelAcessoRepository nivelAcessoRepository)
    {
        this.nivelAcessoRepository = nivelAcessoRepository;
    }

    public NivelAcesso save(NivelAcesso nivelAcesso){

        return nivelAcessoRepository.save(nivelAcesso);
    }

    public NivelAcesso update(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public void delete(long id){
        nivelAcessoRepository.deleteById(id);
    }

    public List<NivelAcesso> findAll() {
        return nivelAcessoRepository.findAll();
    }

    public Optional<NivelAcesso> getById(long id) {
        return nivelAcessoRepository.findById(id);
    }
}
