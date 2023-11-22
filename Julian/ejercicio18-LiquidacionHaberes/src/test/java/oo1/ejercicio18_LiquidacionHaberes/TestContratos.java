package oo1.ejercicio18_LiquidacionHaberes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestContratos {
	private ContratoDePlanta cp;
	private ContratoPorHoras ch;
	private Empleado emp;
	
	@BeforeEach
	public void inicializar() {
		cp = new ContratoDePlanta(emp,LocalDate.now(),4000,500,100);
		ch = new ContratoPorHoras(emp,LocalDate.now(),LocalDate.of(2023, 11, 20),500,5);
	}
	
	@Test
	public void testContratoDePlanta() {
		assertFalse(cp.isVencido());
		assertEquals(4600,cp.montoACobrar());
	}
	
	@Test
	public void testContratoPorHoras() {
		assertTrue(ch.isVencido());
		assertEquals(2500,ch.montoACobrar());
	}
}
