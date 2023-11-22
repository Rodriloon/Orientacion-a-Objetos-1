package oo1.ejercicio17_FacturacionDeLlamadas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LlamadaTest {
	private LlamadaLocal local;
	private LlamadaInternacional inter;
	private LlamadaInterurbana urbana;
	
	
	@BeforeEach
	public void inicializar() {
		local = new LlamadaLocal(LocalDate.of(2023, 7, 10),800,10,221001,221002);
		inter = new LlamadaInternacional(LocalDate.of(2023, 7, 22),900, 10, 221000001, 221000002,"Argentina","Belgica");
		urbana = new LlamadaInterurbana(LocalDate.of(2023, 7, 15),800,20,221001,221003,20);
	}
	

	@Test
	public void testLlamadaLocal() {
		assertEquals(10,local.costoPorLlamada());
		assertEquals(45,urbana.costoPorLlamada());;
		assertEquals(40,inter.costoPorLlamada());

	}
}
