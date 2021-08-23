package br.com.acrf.pontonline.controller;

import br.com.acrf.pontonline.model.Movimentacao;
import br.com.acrf.pontonline.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {
    @Autowired
    MovimentacaoService movimentantacaoService;

    @PostMapping()
    public ResponseEntity<Movimentacao> create(@RequestBody Movimentacao movimentantacao) {
        return ResponseEntity.ok(movimentantacaoService.save(movimentantacao));
    }

    @PutMapping
    public ResponseEntity<Movimentacao> update(@RequestBody Movimentacao movimentantacao){
        return ResponseEntity.ok(movimentantacaoService.update(movimentantacao));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteByID(@PathVariable("id") Long id) throws Exception {
        try {
            movimentantacaoService.delete(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping()
    public ResponseEntity<List<Movimentacao>> getList() {
        return ResponseEntity.ok(movimentantacaoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movimentacao> getByID(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(movimentantacaoService.findByID(id).orElseThrow(() -> new Exception("Movimentação não encontrada")));
    }
}