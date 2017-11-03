package testeIO;

public class ManipuladorB implements Runnable {

	private Integer valor;

	public ManipuladorB(Integer valor) {
		this.valor = valor;
	}

	@Override
	public void run() {
		try {
			synchronized (this) {
				Thread.sleep(4 * 1000);
				multiplicaValorPor5();
				System.out.println("O Valor é: " + this.valor);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void multiplicaValorPor5() {
		this.valor *= 5;
	}

}
