package com.empresa.projeto.projeto_gerenciamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.empresa.projeto.projeto_gerenciamento.entity.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}

