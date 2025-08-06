package com.empresa.projeto.projeto_gerenciamento.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Projeto {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
<<<<<<< Updated upstream
=======
    private double preco;
>>>>>>> Stashed changes
    private String nome;
    private String descricao;

    public Projeto() {

    }
<<<<<<< Updated upstream
=======
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
>>>>>>> Stashed changes

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




}