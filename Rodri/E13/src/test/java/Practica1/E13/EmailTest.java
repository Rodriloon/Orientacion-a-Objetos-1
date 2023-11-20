package Practica1.E13;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailTest {
	
	private Email emailA, emailB;
	private Archivo arcA, arcB;
	
	@BeforeEach
	public void setUp() {
		arcA = new Archivo("Objetos 1 es lo mas!");
		arcB = new Archivo("Objetos 2 vamo a ver");
		emailA = new Email("Autoevaluacion","Se me paso la autoevaluacion del viernes");
		emailB = new Email("","");
	}
	
	@Test
	public void testAgregarArchivo() {
		assertTrue(emailA.adjuntos().isEmpty());
		emailA.agregarArchivo(arcA);
		emailB.agregarArchivo(arcB);
		assertFalse(emailB.adjuntos().isEmpty());
	}
	
	@Test
	public void testTamaño() {
		assertEquals(0,emailB.espacioOcupado());
		assertEquals(54,emailA.espacioOcupado());
		emailA.agregarArchivo(arcA); //20 
		emailA.agregarArchivo(arcB); //20
		assertEquals(94,emailA.espacioOcupado());
	}
	
}
