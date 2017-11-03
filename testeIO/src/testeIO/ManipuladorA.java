package testeIO;

public class ManipuladorA implements Runnable {

	private Integer valor;

	public ManipuladorA(Integer valor) {
		this.valor = valor;
	}

	@Override
	public void run() {
		try {
			synchronized (this) {
				Thread.sleep(5 * 1000);
				multiplicaValorPor2();
				System.out.println("O Valor é: " + this.valor);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void multiplicaValorPor2() {
		this.valor *= 2;
	}
}
