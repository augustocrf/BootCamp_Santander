package br.com.acrf.pontonline.controller;

import br.com.acrf.pontonline.model.Usuario;
import br.com.acrf.pontonline.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @PostMapping()
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioService.save(usuario));
    }

    @PutMapping
    public ResponseEntity<Usuario> update(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.update(usuario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteByID(@PathVariable("id") Long id) throws Exception {
        try {
            usuarioService.delete(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.ok().build();
    }
    @GetMapping()
    public ResponseEntity<List<Usuario>> getList() {
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getByID(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(usuarioService.findByID(id).orElseThrow(() -> new Exception("Usuário não encontrado")));
    }
}