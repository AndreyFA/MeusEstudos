package testeIO;

public class Conta {

	private int numero;
	private float saldo;
	
	public Conta() {
	}
	
	public Conta(int numero, float saldo) {
		this.setNumero(numero);
		this.setSaldo(saldo);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}
