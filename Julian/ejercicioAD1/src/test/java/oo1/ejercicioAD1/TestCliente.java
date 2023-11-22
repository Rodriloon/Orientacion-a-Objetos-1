package oo1.ejercicioAD1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCliente {
	private Residencial re;
	private Industrial in;
	
	@BeforeEach
	void setUp() {
		re = new Residencial("Juan","Perez","32 y 25");
		in = new Industrial("Pepe","7 y 70");
	}
	
	@Test
	void testAgregarMedicion() {
		Medicion m = new Medicion(70,10,2023);
		assertEquals(70,re.agregarMedicion(m).getUnidades());
	}
	
	@Test
	void testCalcularConsumo() {
		Medicion m = new Medicion(100,10,2023);
		re.agregarMedicion(m);
		assertEquals(450,re.calcularConsumo(5, 10, 10, 2023));
		
		in.agregarMedicion(m);
		assertEquals(1000,in.calcularConsumo(5, 10, 10, 2023));
		Medicion m2 = new Medicion(150,9,2023);
		in.agregarMedicion(m2);
		assertEquals(980,in.calcularConsumo(5, 10, 10, 2023));
	}
	
	@Test
	void testBuscar() {
		Medicion m1 = new Medicion(100,10,2023);
		Medicion m2 = new Medicion(200,9,2023);
		re.agregarMedicion(m1);
		re.agregarMedicion(m2);
		assertEquals(100,re.buscarMedicion(10, 2023).getUnidades());
	}	

}
