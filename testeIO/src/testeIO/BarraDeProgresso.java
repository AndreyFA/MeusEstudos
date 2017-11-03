package testeIO;

public class BarraDeProgresso implements Runnable {

	private int id;

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.print("|");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
