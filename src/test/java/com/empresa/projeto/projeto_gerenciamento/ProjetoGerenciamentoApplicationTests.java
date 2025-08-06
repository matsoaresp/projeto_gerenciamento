package com.empresa.projeto.projeto_gerenciamento;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.empresa.projeto.projeto_gerenciamento.entity.Projeto;
import com.empresa.projeto.projeto_gerenciamento.exception.ProductPriceException;
import com.empresa.projeto.projeto_gerenciamento.service.ProjetoService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class ProjetoGerenciamentoApplicationTests {

	@Autowired
	private ProjetoService service;


	@Test
	public void verifyNegativeNumber(){
		Projeto projeto = new Projeto();
		projeto.setNome("Projeto 1");
		projeto.setDescricao("Projeto 1");
		projeto.setPreco(-10.0);

		assertThrows(ProductPriceException.class, () -> {
			service.save(projeto);
		});
	}
	@Test
	void contextLoads() {
	}

}
