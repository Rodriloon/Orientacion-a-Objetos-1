package oo1.ejercicioAD1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSistemaFacturacion {
	private SistemaFacturacion s;
	
	@BeforeEach 
	void setUp() {
		s = new SistemaFacturacion();
	}
	
	@Test
	void testAltaClienteResidencial() {
		assertEquals("Serio",s.altaClienteResidencial("Julian", "Serio","17 y 35").getApellido());
	}
	
	@Test
	void testAltaIndustrial() {
		assertEquals("ESA",s.altaClienteIndustrial("ESA", "17 y 35").getNombre());
	}
	
	@Test
	void testRegistrarMedicion() {
		Residencial c = new Residencial("Juan","Perez","7 y 70");
		assertEquals(100,s.registrarMedicion(c, 100, 10, 2023).getUnidades());
	}
	
	@Test
	void testActualizarTarifario() {
		s.actualizarTarifas(10, 100);
		assertEquals(10,s.getPrecioClientes());
		assertEquals(100,s.getPrecioIndustrial());
	}
	
	@Test
	void testMontoAFacturar() {
		Residencial c = new Residencial("Juan","Perez","7y60");
		s.registrarMedicion(c, 100, 10, 2023);
		s.actualizarTarifas(10, 100);
		assertEquals(900,s.calcularMontoAFacturar(c, 10, 2023));
	}
}
