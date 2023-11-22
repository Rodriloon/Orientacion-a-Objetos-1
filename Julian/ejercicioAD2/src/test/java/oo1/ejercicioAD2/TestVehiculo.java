package oo1.ejercicioAD2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestVehiculo {
	private Automotor a;
	private Embarcacion e;
	
	@BeforeEach
	void setUp() {
		a = new Automotor(7555,LocalDate.of(2009, 9, 10),"Ford","Fiesta",10000);
		e = new Embarcacion(8999,LocalDate.of(2010, 10, 12),100000,"El viejo");
	}
	
	@Test
	void testValorAutomotor() {
		assertEquals(0,a.valor());
		Automotor a2 = new Automotor(700,LocalDate.of(2022, 9, 10),"Ford","Fiesta",1000);
		assertEquals(50,a2.valor());
	}
	
	@Test
	void testValorEmbarcacion() {
		assertEquals(0,e.valor());
		Embarcacion e2 = new Embarcacion(8500,LocalDate.of(2020, 10, 12),1000,"El viejo");
		Embarcacion e3 = new Embarcacion(7000,LocalDate.of(2021, 10, 12),5000000,"El viejo");
		assertEquals(100,e2.valor());
		assertEquals(750000,e3.valor());
	}

}
