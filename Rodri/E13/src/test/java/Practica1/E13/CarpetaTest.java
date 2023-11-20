package Practica1.E13;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {
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
		carpetaA.agregarEmail(emailA);
		carpetaA.agregarEmail(emailB);
		assertFalse(carpetaA.getEmails().isEmpty());
	}
	
	public void testEliminarCorreos() {
		carpetaA.agregarEmail(emailA);
		carpetaA.agregarEmail(emailB);
		assertFalse(carpetaA.getEmails().isEmpty());
		carpetaA.eliminarEmail(emailA);
		carpetaA.eliminarEmail(emailB);
		assertTrue(carpetaA.getEmails().isEmpty());
	}
	
	@Test
	public void testBuscarSinCoincidencias() {
		assertNotEquals(emailA,carpetaA.buscar("Hola"));
	}

	@Test
	public void testBuscarConCoincidencias() {
		carpetaA.agregarEmail(emailA);
		assertEquals(emailA,carpetaA.buscar("Autoevaluacion"));
	}
	

}