package Practica1.E18;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContratoTest {
	
	private Planta cp;
	private Hora ch;
	
	@BeforeEach
	public void iniciar() {
		cp = new Planta(2000, 500, 250, LocalDate.now());
		ch = new Hora(LocalDate.of(2023, 11, 20), 500, 5, LocalDate.now());
	}
	
	@Test
	public void testContratoPlanta() {
		assertTrue(cp.getEstado());
		assertEquals(2750,cp.montoACobrar());
	}
	
	@Test
	public void testContratoHora() {
		assertFalse(ch.getEstado());
		assertEquals(2500,ch.montoACobrar());
	}
	
}
