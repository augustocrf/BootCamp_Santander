package br.com.acrf.pontonline.controller;

import br.com.acrf.pontonline.model.Empresa;
import br.com.acrf.pontonline.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;

    @PostMapping()
    public ResponseEntity<Empresa> create(@RequestBody Empresa empresa) {
        return ResponseEntity.ok(empresaService.save(empresa));
    }

    @PutMapping
    public ResponseEntity<Empresa> update(@RequestBody Empresa empresa){
        return ResponseEntity.ok(empresaService.update(empresa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteByID(@PathVariable("id") Long id) throws Exception {
        try {
            empresaService.delete(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping()
    public ResponseEntity<List<Empresa>> getList() {
        return ResponseEntity.ok(empresaService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Empresa> getByID(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(empresaService.findByID(id).orElseThrow(() -> new Exception("Empresa não encontrada")));
    }
}
