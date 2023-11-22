package oo1.ejercicio19_MercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTipoEnvio {
	private RetirarEnSucursal rs;
	private RetirarEnComercio rc;
	private ExpresDomicilio ex;
	
	@BeforeEach
	public void setUp() {
		rs = new RetirarEnSucursal();
		rc = new RetirarEnComercio();
		ex = new ExpresDomicilio();
	}
	
	@Test
	public void testCosto() {
		assertEquals(50,rs.costo());
		assertEquals(0,rc.costo());
		assertEquals(100,ex.costo());
	}

}
