package br.com.alura.negocio;

import br.com.alura.entidade.Funcionario;

public class ControleDeBonificacoes {

	private double totalDeBonificacoes = 0;

	public void registrar(Funcionario funcionario) {
		System.out.println("Adicionando bonifica��o do funcion�rio: " + funcionario);
		this.totalDeBonificacoes += funcionario.obterBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}

}
