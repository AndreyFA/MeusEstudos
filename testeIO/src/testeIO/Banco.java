package testeIO;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Banco {
	private Collection<Conta> contas;
	private Map<String, Conta> indexadoPorNome;

	public void adiciona(Conta conta) {
		if (this.contas == null) {
			this.contas = new HashSet<Conta>();
			this.indexadoPorNome = new HashMap<String, Conta>();
		}

		this.contas.add(conta);
		this.indexadoPorNome.put(conta.getNomeDoCliente(), conta);
	}
	
	public Conta buscaPorNome(String nome) {
		return this.indexadoPorNome.get(nome);
	}

	public Conta pega(int i) {
		return ((List<Conta>) this.contas).get(i);
	}
	
	public int pegaQuantidadeDeContas() {
		return this.contas.size();
	}
}
