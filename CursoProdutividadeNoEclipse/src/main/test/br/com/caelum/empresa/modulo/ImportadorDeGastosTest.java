package br.com.caelum.empresa.modulo;

import java.io.ByteArrayInputStream;
import java.util.Collection;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ImportadorDeGastosTest {

	@Test
	void deveRetornarUmaListaVaziaSeOArquivoPassadoForVazio() throws Exception {
		ByteArrayInputStream input = new ByteArrayInputStream(new byte[0]);
		
		ImportadorDeGastos importadorDeGastos = new ImportadorDeGastos();
		Collection<Gasto> lista = importadorDeGastos.importa(input);
		
		Assert.assertTrue("a lista não está vazia", lista.isEmpty());
	}
	
	@Test
	void deveRetornarUmGastoDeUmArquivoNoFormatoCorreto() throws Exception {
		String conteudo = "CARTAOx1012011000010000123jbjasbd jbjbbb                22071983\\r\\n";
		ByteArrayInputStream input = new ByteArrayInputStream(conteudo.getBytes());
		
		ImportadorDeGastos importadorDeGastos = new ImportadorDeGastos();
		Collection<Gasto> lista = importadorDeGastos.importa(input);
		
		Assert.assertTrue("a lista não está vazia", lista.isEmpty());
	}
}
