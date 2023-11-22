package oo1.ejercicioAD2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestInmueble {
	private Inmueble i;
	
	@BeforeEach
	void setUp() {
		i = new Inmueble(777,1000,9000);
	}
	
	@Test
	void testValor() {
		assertEquals(100,i.valor());
	}
	

}
