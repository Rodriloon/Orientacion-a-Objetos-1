package OO1.E11;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversorTest {

	private Inversor inv;
	private PlazoFijo pf;
	private InversionEnAcciones ia;
	
	@BeforeEach
	public void setUp() {
		inv = new Inversor("Rodri");
		pf = new PlazoFijo(LocalDate.of(2024, 9, 30), 500, 0.10);		// Tengo que probarlo con 2 dias antes de la fecha actual
		ia = new InversionEnAcciones("Pepe", 5, 10);
	}
	@Test
	public void cargarInversiones() {
		assertTrue(inv.listaDeInversiones().isEmpty());
		inv.agregarInversion(ia);
		assertFalse(inv.listaDeInversiones().isEmpty());
	}
	
	@Test
	public void valorActualTest() {
		inv.agregarInversion(pf);
		inv.agregarInversion(ia);
		assertEquals(650, inv.valorActual());
		inv.quitarInversion(ia);
		assertEquals(600, inv.valorActual());
		inv.quitarInversion(pf);
		assertEquals(0,inv.valorActual());
	}
}
