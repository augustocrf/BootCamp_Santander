package br.com.acrf.pontonline.controller;

import br.com.acrf.pontonline.service.JornadaService;
import br.com.acrf.pontonline.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.save(jornadaTrabalho);
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.update(jornadaTrabalho);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteJornada(@PathVariable("id") long id) throws Exception{
        jornadaService.delete(id);
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findAll();
    }

    @GetMapping("/{id}")
    public JornadaTrabalho getJornadaById(@PathVariable("id") long id) throws Exception {
        return jornadaService.getById(id).orElseThrow(() -> new Exception("Jornada não encontrada."));
    }

}
