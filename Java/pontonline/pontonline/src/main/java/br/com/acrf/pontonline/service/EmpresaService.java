package br.com.acrf.pontonline.service;

import br.com.acrf.pontonline.model.Empresa;
import br.com.acrf.pontonline.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    EmpresaRepository empresaRepository;

    @Autowired
    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public Empresa save(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public Empresa update(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public void delete(Long id) throws Exception {
        empresaRepository.deleteById(id);
    }

    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    public Optional<Empresa> findByID(Long id) {
        return empresaRepository.findById(id);
    }
}