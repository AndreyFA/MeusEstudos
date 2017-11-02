package br.com.alura.negocio;

import org.junit.jupiter.api.Test;

import br.com.alura.entidade.Diretor;
import br.com.alura.entidade.Funcionario;
import br.com.alura.entidade.Gerente;

public class ControleDeBonificacoesTest {
	
	@Test
	public void deveSerPossivelRegistrarABonificacaoDeUmGerente() {
		Funcionario gerente = new Gerente("Gerente 1", "CPF 123", 6500F);
		ControleDeBonificacoes controleDeBonificacoes = new ControleDeBonificacoes();
		
		controleDeBonificacoes.registrar(gerente);
	}
	
	@Test
	public void deveSerPossivelRegistrarABonificacaoDeUmDiretor() {
		Funcionario diretor = new Diretor("Diretor 1", "CPF 456", 9000F);
		ControleDeBonificacoes controleDeBonificacoes = new ControleDeBonificacoes();
		
		controleDeBonificacoes.registrar(diretor);
	}
}
