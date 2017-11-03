package testeIO;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {
	public static void main(String[] args) {
		Conta c1 = new ContaPoupanca(100, 1, "Andrey1");
		Conta c2 = new ContaPoupanca(200, 2, "Andrey2");
		Conta c3 = new ContaPoupanca(300, 3, "Andrey3");
		
		Map mapaDeContas = new HashMap();
		
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		mapaDeContas.put("analista", c3);
	}
}
