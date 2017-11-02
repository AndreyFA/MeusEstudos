package br.com.alura.entidade;

public abstract class Funcionario {

	protected String nome;
	protected String CPF;
	protected double salario;

	public Funcionario(String nome, String CPF, double salario) {
		this.nome = nome;
		this.CPF = CPF;
		this.salario = salario;
	}

	public abstract double obterBonificacao();

	@Override
	public String toString() {
		return this.nome;
	}

}
