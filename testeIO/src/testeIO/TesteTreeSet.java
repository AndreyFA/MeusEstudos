package testeIO;

import java.util.TreeSet;

public class TesteTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> lista = new TreeSet<Integer>();
		
		for (int i = 1; i <= 1000; i++) {
			lista.add(i);
		}
		
		for (Integer integer : lista.descendingSet()) {
			System.out.println(integer);
		}
	}
}
