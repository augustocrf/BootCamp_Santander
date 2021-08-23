package br.com.acrf.pontonline.controller;

import br.com.acrf.pontonline.model.BancoHoras;
import br.com.acrf.pontonline.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bancohoras")
public class BancoHorasController {
    @Autowired
    BancoHorasService bancoHorasService;

    @PostMapping()
    public ResponseEntity<BancoHoras> create(@RequestBody BancoHoras bancoHoras) {
        return ResponseEntity.ok(bancoHorasService.save(bancoHoras));
    }

    @PutMapping
    public ResponseEntity<BancoHoras> update(@RequestBody BancoHoras bancoHoras){
        return ResponseEntity.ok(bancoHorasService.update(bancoHoras));
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
    public ResponseEntity<List<BancoHoras>> getList() {
        return ResponseEntity.ok(bancoHorasService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BancoHoras> getbyID(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(bancoHorasService.findByID(id).orElseThrow(() -> new Exception("Banco horas não encontrada")));
    }
}