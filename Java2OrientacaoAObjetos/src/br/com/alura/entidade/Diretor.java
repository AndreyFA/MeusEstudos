package br.com.alura.entidade;

public class Diretor extends Funcionario {

	public Diretor(String nome, String CPF, double salario) {
		super(nome, CPF, salario);
	}

	@Override
	public double obterBonificacao() {
		return super.salario * 0.05F;
	}
}
