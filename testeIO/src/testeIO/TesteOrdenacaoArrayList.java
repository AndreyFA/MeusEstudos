package testeIO;

import java.util.ArrayList;
import java.util.Collections;

public class TesteOrdenacaoArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for (int i = 1; i <= 1000; i++) {
			lista.add(i);
		}
		
		Collections.reverse(lista);
		
		for (Integer integer : lista) {
			System.out.println(integer);
		}
	}
}
