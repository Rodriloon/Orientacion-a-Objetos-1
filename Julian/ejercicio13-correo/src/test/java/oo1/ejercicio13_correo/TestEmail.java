package oo1.ejercicio13_correo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEmail {
	private Email emailA,emailB;
	private Archivo adA,adB;
	
	@BeforeEach
	public void setUp() {
		emailA = new Email("Autoevaluacion","Se me paso la autoevaluacion del viernes");
		emailB = new Email("","");
		adA = new Archivo("Objetos 1 es lo mas!");
		adB = new Archivo("Objetos 2 vamo a ver");
	}
	
	@Test
	public void testAgregarArchivos() {
		assertTrue(emailA.adjuntos().isEmpty());
		emailA.agregarArchivoAdjunto(adA);
		emailA.agregarArchivoAdjunto(adB);
		assertFalse(emailA.adjuntos().isEmpty());
	}
	
	@Test
	public void testTamano() {
		assertEquals(0,emailB.espacioOcupado());
		assertEquals(54,emailA.espacioOcupado());
		emailA.agregarArchivoAdjunto(adA); //20 
		emailA.agregarArchivoAdjunto(adB); //20
		assertEquals(94,emailA.espacioOcupado());
	}

}
