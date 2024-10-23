package Objetos.Ejercicio12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EsferaTest {

	private Esfera esfera;
	
	@BeforeEach
	public void setUp() {
		esfera = new Esfera(2, "CELESTE", "METAL");
	}
	
	@Test
	public void testSuperficie() {
		assertEquals(50.26548245743669, esfera.getSuperficie());
	}
	
	@Test
	public void testVolumen() {
		assertEquals(33.4265458341954, esfera.getVolumen());
	}

}
