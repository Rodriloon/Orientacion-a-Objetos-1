package Practica1.E9;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {
	CajaDeAhorro caja1;
	CajaDeAhorro caja2;
	
	@BeforeEach
	public void setUp() {
		caja1 = new CajaDeAhorro();
		caja2 = new CajaDeAhorro();
	
		caja1.depositar(1000);
	}
	
	
	@Test
	public void testExtraer() {
		assertEquals(false,caja1.extraer(1000));
		caja1.depositar(500);
		assertEquals(true,caja1.extraer(1000));
	}
	
	@Test
	public void testTransferirACuenta() {
		assertEquals(true, caja1.transferirACuenta(500, caja2));
		assertEquals(false, caja1.transferirACuenta(500, caja2));
		
	}
	
}
