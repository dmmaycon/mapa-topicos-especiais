package dmmaycon.github.com.topicos.especiais.mapa.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dmmaycon.github.com.topicos.especiais.mapa.Data;

class DataTest {

	@Test
	void testaDataDiaInvalido() {
		try {
			new Data(0, 01, 2021);
			fail("Dia invalido aceito");
		} catch (Exception e) {
			assertEquals(e.getMessage(),"Valores para dia, mês ou ano são inválidos.");
		}		
	}
	
	@Test
	void testaDataMesInvalido() {
		try {
			new Data(12, 15, 2021);
			fail("Mês invalido aceito");
		} catch (Exception e) {
			assertEquals(e.getMessage(),"Valores para dia, mês ou ano são inválidos.");
		}	
	}
	
	@Test
	void testaDataAnoInvalido() {
		try {
			new Data(6, 07, -100);
			fail("Ano invalido aceito");
		} catch (Exception e) {
			assertEquals(e.getMessage(),"Valores para dia, mês ou ano são inválidos.");
		}	
	}
	
	@Test
	void testaDataValida() throws Exception {
		Data data = new Data(14, 06, 2021);
		assertEquals(data.isValid(), true);	
	}
	
	@Test
	void testaDiaAnteriorMeioMes() throws Exception {
		Data data = new Data(14, 6, 2021);
		assertEquals(data.diaAnterior().toString(), "13/6/2021");	
	}

	
	@Test
	void testaDiaAnteriorInicioMesTrintaEUmDias() throws Exception {
		Data data = new Data(1, 6, 2021);
		assertEquals(data.diaAnterior().toString(), "31/5/2021");	
	}
	
	@Test
	void testaDiaAnteriorInicioMesTrintaDias() throws Exception {
		Data data = new Data(1, 5, 2021);
		assertEquals(data.diaAnterior().toString(), "30/4/2021");	
	}
	
	@Test
	void testaDiaAnteriorFevereiro() throws Exception {
		Data data = new Data(1, 3, 2021);
		assertEquals(data.diaAnterior().toString(), "28/2/2021");	
	}
	
	@Test
	void testaDiaAnteriorFevereiroVinteOito() throws Exception {
		Data data = new Data(1, 3, 2020);
		assertEquals(data.diaAnterior().toString(), "29/2/2021");	
	}
	
	@Test
	void testaDiaAnteriorViradaAno() throws Exception {
		Data data = new Data(1, 1, 2020);
		assertEquals(data.diaAnterior().toString(), "31/12/2019");	
	}

}
