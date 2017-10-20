package br.com.caelum.empresa.modulo;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Importador {
	private SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");
	
	public Collection<Gasto> importa(InputStream entrada) throws ParseException {
		Scanner leitor = new Scanner(entrada);
		Set<Gasto> gastos = new LinkedHashSet<Gasto>();
		
		while (leitor.hasNextLine()) {
			String line = leitor.nextLine();
			String tipoGasto = line.substring(0, 6);
			String dt = line.substring(6, 14);
			String vl = line.substring(14, 23);
			String mat = line.substring(23, 26);
			String nome = line.substring(26, 56);
			String dataNascTxt = line.substring(56);
			
			double valor = Double.parseDouble(vl);
			int matricula = Integer.parseInt(mat);
			
			Calendar dataNascimento = converteDataTxtParaCalendar(dataNascTxt);
			
			Calendar dataDespesa = converteDataTxtParaCalendar(dt);
			
			Funcionario funcionario = new Funcionario(nome, matricula, dataNascimento);
			gastos.add(new Gasto(valor, tipoGasto, funcionario, dataDespesa));
		}
		
		leitor.close();
		return gastos;
	}

	/**
	 * @param dataTxt
	 * @return
	 * @throws ParseException
	 */
	private Calendar converteDataTxtParaCalendar(String dataTxt) throws ParseException {
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(df.parse(dataTxt));
		return dataNascimento;
	}
}
