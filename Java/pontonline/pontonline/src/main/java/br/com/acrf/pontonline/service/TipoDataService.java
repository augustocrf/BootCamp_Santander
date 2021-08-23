package br.com.acrf.pontonline.service;

import br.com.acrf.pontonline.model.TipoData;
import br.com.acrf.pontonline.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {
    TipoDataRepository tipoDataRepository;

    @Autowired
    public TipoDataService(TipoDataRepository tipoDataRepository)
    {
        this.tipoDataRepository = tipoDataRepository;
    }

    public TipoData save(TipoData tipoData){

        return tipoDataRepository.save(tipoData);
    }

    public TipoData update(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }

    public void delete(long id){
        tipoDataRepository.deleteById(id);
    }

    public List<TipoData> findAll() {
        return tipoDataRepository.findAll();
    }

    public Optional<TipoData> getById(long id) {
        return tipoDataRepository.findById(id);
    }
}
