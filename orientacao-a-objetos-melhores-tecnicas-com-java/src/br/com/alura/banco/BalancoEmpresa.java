package br.com.alura.banco;

import java.util.HashMap;
import java.util.Map;

public class BalancoEmpresa {
	private Map<String, Divida> dividas = new HashMap<>();

	public void registraDivida(String nomeCredor, String numeroCnpj, double valorDaDivida) {
		Divida divida = new Divida();
		divida.setNomeCredor(nomeCredor);
		divida.setNumeroCnpj(numeroCnpj);
		divida.setValorTotal(valorDaDivida);

		dividas.put(divida.getNomeCredor(), divida);
	}

	public void pagarParteDivida(String numeroCnpj, double valor) {
		Divida divida = this.dividas.get(numeroCnpj);

		if (divida != null) {
			divida.paga(valor);
		}
	}
}
