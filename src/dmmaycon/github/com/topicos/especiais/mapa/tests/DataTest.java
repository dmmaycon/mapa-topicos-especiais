package dmmaycon.github.com.topicos.especiais.mapa.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dmmaycon.github.com.topicos.especiais.mapa.Data;

class DataTest {

	@Test
	void testaDataDiaInvalido() {
		try {
			new Data(32, 01, 2021);
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
		assertEquals(new Data(14, 06, 2021), true);	
	}

}
