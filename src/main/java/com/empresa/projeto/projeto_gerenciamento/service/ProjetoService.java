package com.empresa.projeto.projeto_gerenciamento.service;

import com.empresa.projeto.projeto_gerenciamento.entity.Projeto;
import com.empresa.projeto.projeto_gerenciamento.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository repository;

    public Projeto save(Projeto projeto) {
        return repository.save(projeto);
    }
    public List<Projeto> findAll() {
        return repository.findAll();
    }
    public Projeto findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}