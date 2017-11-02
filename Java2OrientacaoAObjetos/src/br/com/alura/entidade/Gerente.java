package br.com.alura.entidade;

public class Gerente extends Funcionario {

	public Gerente(String nome, String CPF, double salario) {
		super(nome, CPF, salario);
	}

	@Override
	public double obterBonificacao() {
		return (super.salario * 1.4) + 1000;
	}
}
