package testeIO;

public class Conta {

	private int numero;
	private float saldo;
	private String nomeDoCliente;

	public Conta() {
	}

	public Conta(int numero, float saldo, String nomeDoCliente) {
		this.setNumero(numero);
		this.setSaldo(saldo);
		this.setNomeDoCliente(nomeDoCliente);
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

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Conta nº: " + this.getNumero() + " - Saldo: R$ " + this.getSaldo();
	}
}
