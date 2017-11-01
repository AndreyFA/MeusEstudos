package testeIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Prinicipal {
	public static void main(String[] args) throws IOException {
		desafioEscreverOutroArquivoPeloTeclado();
	}

	public static void testeScanner() {
		InputStream is = System.in;
		Scanner scan = new Scanner(is);

		System.out.println("Digite sua mensagem:");
		while (scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
		scan.close();
	}

	public static void desafioEscreverOutroArquivo() throws FileNotFoundException {

		try (PrintStream printStream = new PrintStream("C:\\\\Users\\\\andrey.alves\\\\Documents\\\\Meu repositório\\\\MeusEstudos\\\\testeIO\\\\src\\\\testeIO\\\\arquivo2.txt")) {
			InputStream is = new FileInputStream("C:\\Users\\andrey.alves\\Documents\\Meu repositório\\MeusEstudos\\testeIO\\src\\testeIO\\arquivo.txt");
			Scanner sc = new Scanner(is);

			while (sc.hasNextLine()) {
				printStream.println(sc.nextLine());
			}

			sc.close();
		}
	}
	
	public static void desafioEscreverOutroArquivoPeloTeclado() throws FileNotFoundException {

		try (PrintStream printStream = new PrintStream("C:\\\\Users\\\\andrey.alves\\\\Documents\\\\Meu repositório\\\\MeusEstudos\\\\testeIO\\\\src\\\\testeIO\\\\arquivo2.txt")) {
			InputStream is = System.in;
			Scanner sc = new Scanner(is);

			while (sc.hasNextLine()) {
				printStream.println(sc.nextLine());
			}

			sc.close();
		}
	}

	public static void outros() throws IOException {
		// InputStream is = System.in;
		InputStream is = new FileInputStream(
				"C:\\Users\\andrey.alves\\Documents\\Meu repositório\\MeusEstudos\\testeIO\\src\\testeIO\\arquivo.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(is);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		// BufferedReader br = new BufferedReader(new InputStreamReader(new
		// FileInputStream("C:\\Users\\andrey.alves\\Documents\\Meu
		// repositório\\MeusEstudos\\testeIO\\src\\testeIO\\arquivo.txt")));

		String s = bufferedReader.readLine();

		while (s != null) {
			System.out.println(s);
			s = bufferedReader.readLine();
		}

		bufferedReader.close();

	}
}
