package br.com.acrf.pontonline.controller;

import br.com.acrf.pontonline.model.CategoriaUsuario;
import br.com.acrf.pontonline.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaUsuarioController {
    @Autowired
    CategoriaService categoriaService;

    @PostMapping
    public CategoriaUsuario createCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaService.save(categoriaUsuario);
    }

    @PutMapping
    public CategoriaUsuario updateCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaService.update(categoriaUsuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCategoriaUsuario(@PathVariable("id") long id) throws Exception{
        categoriaService.delete(id);
        return (ResponseEntity<CategoriaUsuario>) ResponseEntity.ok();
    }

    @GetMapping
    public List<CategoriaUsuario> getCategoriaUsuarioList(){
        return categoriaService.findAll();
    }

    @GetMapping("/{id}")
    public CategoriaUsuario getCategoriaUsuarioById(@PathVariable("id") long id) throws Exception {
        return categoriaService.getById(id).orElseThrow(() -> new Exception("Categoria Usuário não encontrada."));
    }
}
