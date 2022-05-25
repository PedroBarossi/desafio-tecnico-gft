package com.barossi.controller;

import com.barossi.model.MetaHumano;
import com.barossi.service.MetaHumanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("metahumanos")
public class MetaHumanoRestController {

    @Autowired
    private MetaHumanoService metaHumanoService;

    @GetMapping
    public ResponseEntity<Iterable<MetaHumano>> buscarTodos() {
        return ResponseEntity.ok(metaHumanoService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MetaHumano> buscarPorId(@PathVariable Integer id) {
        return ResponseEntity.ok(metaHumanoService.buscarPorId(id));
    }

    @GetMapping("/buscar-criminosos")
    public ResponseEntity<Iterable<MetaHumano>> buscarCriminosos() {
        return ResponseEntity.ok(metaHumanoService.buscarCriminosos());
    }

    @GetMapping("/buscar-id-secreta-desconhecida")
    public ResponseEntity<Iterable<MetaHumano>> buscarIdSecretaDesconhecida() {
        return ResponseEntity.ok(metaHumanoService.buscarIdSecretaDesconhecida());
    }

    @PostMapping
    public ResponseEntity<MetaHumano> inserir(@RequestBody MetaHumano meta) {
        metaHumanoService.inserir(meta);
        return ResponseEntity.ok(meta);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MetaHumano> atualizar(@PathVariable Integer id, @RequestBody MetaHumano meta) {
        metaHumanoService.atualizar(id, meta);
        return ResponseEntity.ok(meta);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        metaHumanoService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
