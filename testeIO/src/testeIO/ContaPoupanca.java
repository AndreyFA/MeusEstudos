package testeIO;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	public ContaPoupanca(int numero, float saldo) {
		super.setNumero(numero);
		super.setSaldo(saldo);
	}
	
	@Override
	public String toString() {
		return "Conta número: " + super.getNumero() + " Saldo: R$ " + super.getSaldo();
	}
	
	@Override
	public int compareTo(ContaPoupanca outraContaPoupanca) {

		if (this.getNumero() > outraContaPoupanca.getNumero())
			return 1;

		if (this.getNumero() < outraContaPoupanca.getNumero())
			return -1;

		return 0;
	}
}
