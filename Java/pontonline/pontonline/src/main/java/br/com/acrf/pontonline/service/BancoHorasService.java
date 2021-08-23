package br.com.acrf.pontonline.service;

import br.com.acrf.pontonline.model.BancoHoras;
import br.com.acrf.pontonline.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {

    BancoHorasRepository bancoHorasRepository;

    @Autowired
    public BancoHorasService(BancoHorasRepository bancoHorasRepository) {
        this.bancoHorasRepository = bancoHorasRepository;
    }

    public BancoHoras save(BancoHoras bancoHoras) {
        return bancoHorasRepository.save(bancoHoras);
    }

    public BancoHoras update(BancoHoras bancoHoras) {
        return bancoHorasRepository.save(bancoHoras);
    }

    public void delete(Long id) throws Exception {
        bancoHorasRepository.deleteById(id);
    }

    public List<BancoHoras> findAll() {
        return bancoHorasRepository.findAll();
    }

    public Optional<BancoHoras> findByID(Long id) {
        return bancoHorasRepository.findById(id);
    }
}
