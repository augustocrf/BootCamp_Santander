package br.com.acrf.pontonline.controller;

import br.com.acrf.pontonline.model.Calendario;
import br.com.acrf.pontonline.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calendario")
public class CalendarioController {
    @Autowired
    CalendarioService bancoHorasService;

    @PostMapping()
    public ResponseEntity<Calendario> create(@RequestBody Calendario calendario) {
        return ResponseEntity.ok(bancoHorasService.save(calendario));
    }

    @PutMapping
    public ResponseEntity<Calendario> update(@RequestBody Calendario calendario){
        return ResponseEntity.ok(bancoHorasService.update(calendario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteByID(@PathVariable("id") Long id) throws Exception {
        try {
            bancoHorasService.delete(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping()
    public ResponseEntity<List<Calendario>> getList() {
        return ResponseEntity.ok(bancoHorasService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Calendario> getByID(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(bancoHorasService.findByID(id).orElseThrow(() -> new Exception("Calendário não encontrada")));
    }
}

