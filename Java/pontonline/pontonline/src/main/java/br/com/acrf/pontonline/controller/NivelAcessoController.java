package br.com.acrf.pontonline.controller;

import br.com.acrf.pontonline.model.NivelAcesso;
import br.com.acrf.pontonline.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nivelacesso")
public class NivelAcessoController {
    @Autowired
    NivelAcessoService nivelAcessoService;

    @PostMapping
    public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.save(nivelAcesso);
    }

    @PutMapping
    public NivelAcesso updateNivelAcesso(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.update(nivelAcesso);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteNivelAcesso(@PathVariable("id") long id) throws Exception{
        nivelAcessoService.delete(id);
        return (ResponseEntity<NivelAcesso>) ResponseEntity.ok();
    }

    @GetMapping
    public List<NivelAcesso> getNivelAcessoList(){
        return nivelAcessoService.findAll();
    }

    @GetMapping("/{id}")
    public NivelAcesso getNivelAcessoById(@PathVariable("id") long id) throws Exception {
        return nivelAcessoService.getById(id).orElseThrow(() -> new Exception("Nivel Acesso não encontrada."));
    }
}
