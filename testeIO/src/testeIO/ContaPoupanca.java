package testeIO;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	public ContaPoupanca(int numero, float saldo, String nomeDoCliente) {
		super.setNumero(numero);
		super.setSaldo(saldo);
		super.setNomeDoCliente(nomeDoCliente);
	}

	@Override
	public String toString() {
		return "Conta número: " + super.getNumero() + " Saldo: R$ " + super.getSaldo();
	}

	@Override
	public int compareTo(ContaPoupanca outraContaPoupanca) {

		return this.getNomeDoCliente().compareTo(outraContaPoupanca.getNomeDoCliente());
	}
}
