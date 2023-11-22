package MisEjercicios.ejercicio11_Inversor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {
	private Inversor inv;
	private PlazoFijo pf;
	private InversionEnAcciones ia;

	@BeforeEach 
	public void inicializar() {
		inv = new Inversor("Juan Carlos");
		pf = new PlazoFijo(LocalDate.of(2023, 9, 27),500,0.10);
		ia = new InversionEnAcciones("Pepe",5,10);
	}
	
	@Test
	public void valorActual() {
		inv.agregarInversion(pf);
		inv.agregarInversion(ia);
		assertEquals(650, inv.valorActual());
		inv.quitarInversion(ia);
		assertEquals(600, inv.valorActual());
		inv.quitarInversion(pf);
		assertEquals(0,inv.valorActual());
		
		
	}
	
	public void cargarInversiones() {
		assertTrue(inv.listaDeInversiones().isEmpty());
		inv.agregarInversion(ia);
		assertFalse(inv.listaDeInversiones().isEmpty());
	}

}
