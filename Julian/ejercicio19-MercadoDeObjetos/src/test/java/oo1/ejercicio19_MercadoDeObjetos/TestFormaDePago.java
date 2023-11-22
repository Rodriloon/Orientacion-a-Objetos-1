package oo1.ejercicio19_MercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFormaDePago {
	private AlContado al;
	private Cuotas cu;
	
	@BeforeEach
	public void setUp() {
		al = new AlContado();
		cu = new Cuotas();
	}
	
	@Test
	public void testPrecioFinal() {
		assertEquals(10,al.precioFinal(10));
		assertEquals(12,cu.precioFinal(10));
		
	}

}
