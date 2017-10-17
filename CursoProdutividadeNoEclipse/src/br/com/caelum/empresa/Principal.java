package br.com.caelum.empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.caelum.empresa.modulo.Funcionario;

/***
 * Classes
 * @author andrey.alves
 *
 */
public class Principal {
	public static void main(String[] args) {
		Funcionario funcionario = criarFuncionario();

		System.out.println(funcionario);
	}

	private static Funcionario criarFuncionario() {
		int dia = 12;
		int mes = 11;
		int ano = 91;

		Calendar dataNascimento = criarData(dia, mes, ano);
		Funcionario funcionario = new Funcionario("Andrey Frazatti Alves", 1, dataNascimento);
		return funcionario;
	}

	/**
	 * Método responsável por devolver uma data de nascimento no padrão {@link GregorianCalendar}.
	 * @param dia Representa o dia do nascimento.
	 * @param mes Representa o mês do nascimento.
	 * @param ano Representa o ano do nascimento.
	 * @return Retorna um {@link GregorianCalendar} representado a data de nascimento.
	 */
	public static Calendar criarData(int dia, int mes, int ano) {
		Calendar dataNascimento = new GregorianCalendar(ano, mes, dia);
		return dataNascimento;
	}
}
