package com.empresa.projeto.projeto_gerenciamento.controller;

import com.empresa.projeto.projeto_gerenciamento.entity.Projeto;
import com.empresa.projeto.projeto_gerenciamento.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/projeto")
public class ProjetoController {

    @Autowired
    private ProjetoService service;

    @PostMapping(value = "/save")
    public ResponseEntity<Projeto> saveproduct(@RequestBody Projeto projeto) {
        projeto = service.save(projeto);
        return ResponseEntity.ok().body(projeto);
    }
}
