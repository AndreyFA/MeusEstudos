package testeIO;

import java.util.Collection;

public class ProduzMensagens implements Runnable {

	private int comeco;
	private int fim;
	private Collection<String> mensagens;

	public ProduzMensagens(int comeco, int fim, Collection<String> mensagens) {
		this.comeco = comeco;
		this.fim = fim;
		this.mensagens = mensagens;
	}

	@Override
	public void run() {
		for (int i = this.comeco; i < this.fim; i++) {
//			synchronized (mensagens) {
				mensagens.add("Mensagem " + i);
//			}
		}
	}

}
