package testeIO;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestaOrdenacao {
	public static void main(String[] args) {
		List<ContaPoupanca> contas = new LinkedList<>();
		
		Random rdSaldo = new Random();
		
		contas.add(new ContaPoupanca(3, rdSaldo.nextFloat(), "A"));
		contas.add(new ContaPoupanca(2, rdSaldo.nextFloat(), "E"));
		contas.add(new ContaPoupanca(1, rdSaldo.nextFloat(), "C"));
		
		Collections.sort(contas);
		
		for (ContaPoupanca contaPoupanca : contas) {
			System.out.println(contaPoupanca);
		}
	}
}
