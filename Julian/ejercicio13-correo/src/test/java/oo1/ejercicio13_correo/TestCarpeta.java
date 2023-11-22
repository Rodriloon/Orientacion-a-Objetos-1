package oo1.ejercicio13_correo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCarpeta {
	private Carpeta carpetaA;
	private Email emailA,emailB;
	
	@BeforeEach
	public void setUp() {
		carpetaA = new Carpeta("Carpeta A");
		emailA = new Email("Autoevaluacion","Se me paso la autoevaluacion del viernes");
		emailB = new Email("Presentacion","Hola que tal");
	}
	
	@Test
	public void testAgregarCorreos() {
		assertTrue(carpetaA.getEmails().isEmpty());
		carpetaA.agregarCorreo(emailA);
		carpetaA.agregarCorreo(emailB);
		assertFalse(carpetaA.getEmails().isEmpty());
	}
	
	public void testEliminarCorreos() {
		carpetaA.agregarCorreo(emailA);
		carpetaA.agregarCorreo(emailB);
		assertFalse(carpetaA.getEmails().isEmpty());
		carpetaA.eliminarCorreo(emailA);
		carpetaA.eliminarCorreo(emailB);
		assertTrue(carpetaA.getEmails().isEmpty());
	}
	
	@Test
	public void testBuscarSinCoincidencias() {
		assertNotEquals(emailA,carpetaA.buscar("Hola"));
	}

	@Test
	public void testBuscarConCoincidencias() {
		carpetaA.agregarCorreo(emailA);
		assertEquals(emailA,carpetaA.buscar("Autoevaluacion"));
	}
	

}
