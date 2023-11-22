package oo1.ejercicioAD2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAgenciaRecaudacion {
	private AgenciaRecaudacion a;
	
	@BeforeEach
	void setUp() {
		a = new AgenciaRecaudacion();
	}
	
	@Test
	void testCalcularImpuesto() {
		Contribuyente c = new Contribuyente("Juan",444,"Pepe@gmai.com","La Plata");
		Automotor auto = new Automotor(7555,LocalDate.of(2009, 9, 10),"Ford","Fiesta",10000);
		Inmueble in = new Inmueble(666,1000,9000);
		c.cargarPropiedad(in);
		c.cargarPropiedad(auto);
		assertEquals(100,a.calcularImpuesto(c));
	}

}
