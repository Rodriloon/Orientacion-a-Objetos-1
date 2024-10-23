package Objetos.Ejercicio12;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CilindroTest {
	
	private Cilindro cilindro;
	
	@BeforeEach
	public void setUp() {
		cilindro = new Cilindro(2, 2, "CELESTE", "METAL");
	}
	
	@Test
	public void testSuperficie() {
		assertEquals(50.26548245743669, cilindro.getSuperficie());
	}
	
	@Test
	public void testVolumen() {
		assertEquals(25.132741228718345, cilindro.getVolumen());
	}

}
