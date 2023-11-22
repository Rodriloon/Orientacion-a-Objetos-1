package oo1.ejercicioAD1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMedicion {
	private Medicion m;
	
	@BeforeEach
	void setUp() {
		m = new Medicion(100,10,2023);
	}
	
	@Test
	void testCoincideFecha() {
		assertTrue(m.coincideFecha(10, 2023));
		assertFalse(m.coincideFecha(11, 2023));
		assertFalse(m.coincideFecha(7, 2023));
	}
	
	@Test
	void testInferiorActual() {
		Medicion m2 = new Medicion(70,10,2023);
		assertFalse(m.inferiorActual(m2.getUnidades()));
		assertTrue(m2.inferiorActual(m.getUnidades()));
	}

}
