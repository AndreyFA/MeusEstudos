package br.com.alura.entidade;

import br.com.alura.contrato.AreaCalculavel;

public class Circulo implements AreaCalculavel {

	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return (this.raio * this.raio) * Math.PI;
	}
}
