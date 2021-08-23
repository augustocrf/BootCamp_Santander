package br.com.acrf.pontonline.controller;

import br.com.acrf.pontonline.model.Localidade;
import br.com.acrf.pontonline.service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localidade")
public class LocalidadeController {
    @Autowired
    LocalidadeService localidadeService;

    @PostMapping()
    public ResponseEntity<Localidade> create(@RequestBody Localidade localidade) {
        return ResponseEntity.ok(localidadeService.save(localidade));
    }

    @PutMapping
    public ResponseEntity<Localidade> update(@RequestBody Localidade localidade){
        return ResponseEntity.ok(localidadeService.update(localidade));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteByID(@PathVariable("id") Long id) throws Exception {
        try {
            localidadeService.delete(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping()
    public ResponseEntity<List<Localidade>> getList() {
        return ResponseEntity.ok(localidadeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Localidade> getByID(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(localidadeService.findByID(id).orElseThrow(() -> new Exception("Localidade não encontrada")));
    }
}
