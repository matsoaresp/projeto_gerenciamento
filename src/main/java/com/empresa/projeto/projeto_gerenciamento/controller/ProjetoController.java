package com.empresa.projeto.projeto_gerenciamento.controller;

import com.empresa.projeto.projeto_gerenciamento.entity.Projeto;
import com.empresa.projeto.projeto_gerenciamento.exception.ProductNullException;
import com.empresa.projeto.projeto_gerenciamento.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/projeto")
public class ProjetoController {

    @Autowired
    private ProjetoService service;

    @PostMapping(value = "/save")
    public ResponseEntity<Projeto> create(@RequestBody Projeto projeto){
        projeto = service.save(projeto);
        return ResponseEntity.ok(service.save(projeto));
    }

    @GetMapping(value = "search")
    public ResponseEntity<List<Projeto>> findAll(){
        List<Projeto> projetos = service.findAll();
        return ResponseEntity.ok().body(projetos);
    }

    @GetMapping(value="{id}")
    public ResponseEntity<Projeto> findById(@PathVariable Long id){
        Projeto projeto = service.findById(id);
        return ResponseEntity.ok().body(projeto);
    }


}
