package Practica1.E9;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	
	CuentaCorriente caja1;
	CuentaCorriente caja2;
	CajaDeAhorro caja10;
	
	@BeforeEach
	public void setUp() {
		caja1 = new CuentaCorriente();
		caja2 = new CuentaCorriente();
		caja10 = new CajaDeAhorro();
	
		caja1.depositar(1000);
	}
	
	@Test
	public void testExtraer() {		
		assertEquals(true,caja1.extraer(1000));
		assertEquals(false,caja1.extraer(1000));	
	}
	
	@Test
	public void testTransferirACuenta() {
		
		assertEquals(true, caja1.transferirACuenta(1000, caja2));
		assertEquals(false, caja1.transferirACuenta(10, caja2));
		caja1.setDescubierto(10);
		assertTrue(caja1.transferirACuenta(10, caja2));
	}
	
	@Test
	public void testTranferencias() {
		
		assertEquals(true, caja1.transferirACuenta(1000, caja10));
		assertEquals(false, caja1.transferirACuenta(10, caja10));
		caja1.setDescubierto(10);
		assertEquals(980,caja10.getSaldo());
		assertTrue(caja1.transferirACuenta(10, caja2));
	}
	
}
