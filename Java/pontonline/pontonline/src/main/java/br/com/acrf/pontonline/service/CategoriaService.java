package br.com.acrf.pontonline.service;

import br.com.acrf.pontonline.model.CategoriaUsuario;
import br.com.acrf.pontonline.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository)
    {
        this.categoriaRepository = categoriaRepository;
    }

    public CategoriaUsuario save(CategoriaUsuario categoriaUsuario){

        return categoriaRepository.save(categoriaUsuario);
    }

    public CategoriaUsuario update(CategoriaUsuario categoriaUsuario){
        return categoriaRepository.save(categoriaUsuario);
    }

    public void delete(long id){
        categoriaRepository.deleteById(id);
    }

    public List<CategoriaUsuario> findAll() {
        return categoriaRepository.findAll();
    }

    public Optional<CategoriaUsuario> getById(long id) {
        return categoriaRepository.findById(id);
    }
}
