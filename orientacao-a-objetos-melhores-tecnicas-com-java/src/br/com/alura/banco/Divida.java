package br.com.alura.banco;

public class Divida {
	
	private double valorTotal;
	private double valorPago;
	private String nomeCredor;
	private String numeroCnpj;

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getNomeCredor() {
		return nomeCredor;
	}

	public void setNomeCredor(String nomeCredor) {
		this.nomeCredor = nomeCredor;
	}

	public String getNumeroCnpj() {
		return numeroCnpj;
	}

	public void setNumeroCnpj(String numeroCNPJ) {
		this.numeroCnpj = numeroCNPJ;
	}
	
	public void paga(double valor) {
		this.valorPago += valor;
	}
	
}
