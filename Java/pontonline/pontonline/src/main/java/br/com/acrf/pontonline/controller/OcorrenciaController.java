package br.com.acrf.pontonline.controller;

import br.com.acrf.pontonline.model.Ocorrencia;
import br.com.acrf.pontonline.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {
    @Autowired
    OcorrenciaService ocorrenciaService;

    @PostMapping
    public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.save(ocorrencia);
    }

    @PutMapping
    public Ocorrencia updateOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.update(ocorrencia);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteOcorrencia(@PathVariable("id") long id) throws Exception{
        ocorrenciaService.delete(id);
        return (ResponseEntity<Ocorrencia>) ResponseEntity.ok();
    }

    @GetMapping
    public List<Ocorrencia> getOcorrenciaList(){
        return ocorrenciaService.findAll();
    }

    @GetMapping("/{id}")
    public Ocorrencia getOcorrenciaById(@PathVariable("id") long id) throws Exception {
        return ocorrenciaService.getById(id).orElseThrow(() -> new Exception("Ocorrência não encontrada."));
    }
}
