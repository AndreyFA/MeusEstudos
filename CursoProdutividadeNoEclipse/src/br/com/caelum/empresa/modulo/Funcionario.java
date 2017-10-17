package br.com.caelum.empresa.modulo;

import java.util.Calendar;

public class Funcionario {
	private String nome;
	private int matricula;
	private Calendar dataNascimento;
	
	public Funcionario(String nome, int matricula, Calendar dataNascimento) {
		setNome(nome);
		setMatricula(matricula);
		setDataNascimento(dataNascimento);
	}
	
	@Override
	public String toString() {
		return "Funcionário: " + this.getNome();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
