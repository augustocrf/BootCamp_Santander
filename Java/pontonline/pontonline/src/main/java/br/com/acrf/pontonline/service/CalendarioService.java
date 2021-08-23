package br.com.acrf.pontonline.service;

import br.com.acrf.pontonline.model.Calendario;
import br.com.acrf.pontonline.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {

    CalendarioRepository calendarioRepository;

    @Autowired
    public CalendarioService(CalendarioRepository calendarioRepository) {
        this.calendarioRepository = calendarioRepository;
    }

    public Calendario save(Calendario calendario) {
        return calendarioRepository.save(calendario);
    }

    public Calendario update(Calendario calendario) {
        return calendarioRepository.save(calendario);
    }

    public void delete(Long id) throws Exception {
        calendarioRepository.deleteById(id);
    }

    public List<Calendario> findAll() {
        return calendarioRepository.findAll();
    }

    public Optional<Calendario> findByID(Long id) {
        return calendarioRepository.findById(id);
    }
}