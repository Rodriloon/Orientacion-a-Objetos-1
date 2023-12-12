package Practica1.E18;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	
	private Empleado em1;
	private Empleado em2;
	
	@BeforeEach
	public void iniciar() {
		em1 = new Empleado("Rodri", "Martinez", 209, LocalDate.of(2002, 04, 25), false, false, LocalDate.now());
		em2 = new Empleado("Licho", "Piva", 206, LocalDate.of(2002,10,29), true, false, LocalDate.of(2010, 12, 20));
	}
	
	@Test
	public void testCoincideCuil() {
		assertEquals(209, em1.getCuil());
		assertNotEquals(208, em1.getCuil());
		assertNotEquals(210, em1.getCuil());
		assertNotEquals(-10, em1.getCuil());
	}
	
	@Test
	public void testGenerarRecibo() {
		Planta cp1 = new Planta(4000, 500, 100, LocalDate.now());
		em1.agregarContratoPlanta(cp1);
		Recibo r1 = em1.generarRecibo();
		assertEquals(4500,r1.getMontoTotal());
		assertEquals(0,r1.getAntiguedad());
		
		Planta cp2 = new Planta(4000, 500, 100, LocalDate.now());
		em2.agregarContratoPlanta(cp2);
		Recibo r2 = em2.generarRecibo();
		assertEquals(8000,r2.getMontoTotal());
		assertEquals(21,r2.getAntiguedad());
	}
	
}
