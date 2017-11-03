package testeIO;

import java.util.Collection;
import java.util.HashSet;

public class TesteDuplicadosNaLista {
	public static void main(String[] args) {
		Collection<Conta> contas = new HashSet<>();
		
		Conta contaA = new Conta(135, 150.0F, "Andrey F. Alves");
		Conta contaB = new Conta(135, 150.0F, "Andrey Frazatti");
		
		contas.add(contaA);
		contas.add(contaB);
		
		for (Conta conta : contas) {
			System.out.println(conta);
		}
	}
}
