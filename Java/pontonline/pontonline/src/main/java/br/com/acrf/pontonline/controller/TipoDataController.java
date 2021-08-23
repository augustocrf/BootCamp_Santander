package br.com.acrf.pontonline.controller;

import br.com.acrf.pontonline.model.TipoData;
import br.com.acrf.pontonline.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipodata")
public class TipoDataController {
    @Autowired
    TipoDataService tipoDataService;

    @PostMapping
    public TipoData create(@RequestBody TipoData tipoData){
        return tipoDataService.save(tipoData);
    }

    @PutMapping
    public TipoData update(@RequestBody TipoData tipoData){
        return tipoDataService.update(tipoData);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") long id) throws Exception{
        tipoDataService.delete(id);
        return (ResponseEntity<TipoData>) ResponseEntity.ok();
    }

    @GetMapping
    public List<TipoData> getList(){
        return tipoDataService.findAll();
    }

    @GetMapping("/{id}")
    public TipoData getById(@PathVariable("id") long id) throws Exception {
        return tipoDataService.getById(id).orElseThrow(() -> new Exception("Tipo Data não encontrada."));
    }
}
