package oo1.ejercicio18_LiquidacionHaberes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEmpleado {
	private ContratoPorHoras ch1,ch2;
	private Empleado emp1,emp2;
	
	@BeforeEach
	public void inicializar() {
		emp1 = new Empleado("Julian","Serio",2041,"4 de marzo",true,false,LocalDate.now());
		emp2 = new Empleado("Julian","Serio",2044,"4 de marzo",false,false,LocalDate.of(2002, 1, 1));
	}
	
	
	//NO hago los test de la carga, ya que los resultados de la carga los voy a ver reflejados 
	//en el recibo de sueldo
	
	//Tampoco testeo que el contrato actual este vencido ya que se supone que no se puede
	//agregar como contrato actual uno que este vencido
	@Test
	public void testGenerarRecibo() {
		emp1.cargarContratoDePlanta(LocalDate.now(), 4000, 500, 100);
		Recibo r1 = emp1.generarRecibo();
		assertEquals(4500,r1.getMontoTotal());
		assertEquals(0,r1.getAntiguedad());
		
		emp2.cargarContratoDePlanta(LocalDate.now(), 4000, 500, 100);
		Recibo r2 = emp2.generarRecibo();
		assertEquals(8000,r2.getMontoTotal());
		assertEquals(21,r2.getAntiguedad());
	}
	
	@Test
	public void testCoincideCuil() {
		emp1.cargarContratoHoras(LocalDate.of(2023, 5, 20),LocalDate.now(),500,5);
		assertTrue(emp1.contratoActualVencido());
		emp1.cargarContratoHoras(LocalDate.of(2023, 9, 20),LocalDate.of(2023, 11, 20),500,5);
		assertFalse(emp1.contratoActualVencido());
	}
	
}
