package testeIO;

public class TestaThreads {
	public static void main(String[] args) {

		Integer valor = 10;

		ManipuladorA manipuladorA = new ManipuladorA(valor);
		ManipuladorB manipuladorB = new ManipuladorB(valor);

		manipuladorA.run();
		manipuladorB.run();
	}
}
