package com.empresa.projeto.projeto_gerenciamento;

import org.springframework.boot.SpringApplication;

public class TestProjetoGerenciamentoApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProjetoGerenciamentoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
