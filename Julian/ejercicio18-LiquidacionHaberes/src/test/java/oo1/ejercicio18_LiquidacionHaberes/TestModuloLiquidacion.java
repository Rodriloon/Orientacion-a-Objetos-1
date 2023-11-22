package oo1.ejercicio18_LiquidacionHaberes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestModuloLiquidacion {
	private ModuloLiquidacion modulo;
	private Empleado emp1,emp2;
	
	@BeforeEach
	public void inicializar() {
		modulo = new ModuloLiquidacion();
		emp1 = new Empleado("Julian","Serio",2041,"4 de marzo",true,false,LocalDate.now());
		emp2 = new Empleado("Jose","Carlos",2044,"7 de marzo",true,false,LocalDate.of(2002, 1, 1));
	}
	
	@Test
	public void testBuscarEmpleado() {
		modulo.darAltaEmpleado("Julian","Serio",2041,"4 de marzo",false,false);
		modulo.darAltaEmpleado("Jose","Carlos",2044,"7 de marzo",true,false);
		Empleado buscado = modulo.buscarEmpleado(2044);
		assertEquals(2044,buscado.getCUIL());
	}

	
	//Esta lista siempre va a estar vacia ya que no se va van a poder cargar contratos (como contratoActual) 
	//que esten vencidos 
	@Test
	public void testObtenerContratosVencido() {
		modulo.agregarEmpleado(emp1);
		modulo.agregarEmpleado(emp2);
		modulo.cargarContratoPorHoras(emp1,LocalDate.of(2000 ,1 ,9),5,500,LocalDate.of(2024 ,1 ,9));
		modulo.cargarContratoPorHoras(emp2,LocalDate.of(2000 ,1 ,9),5,500,LocalDate.of(2024 ,1 ,9));
		assertEquals(0,modulo.obtenerContratosVencidos().size());
	}
	
	//Como se pretende que probemos este metodo? 
	@Test
	public void testGenerarRecibos() {
		modulo.agregarEmpleado(emp1);
		modulo.agregarEmpleado(emp2);
		modulo.cargarContratoPorHoras(emp1,LocalDate.of(2000 ,1 ,9),5,500,LocalDate.of(2026 ,1 ,9));
		modulo.cargarContratoPorHoras(emp2,LocalDate.of(2000 ,1 ,9),5,500,LocalDate.of(2024 ,1 ,9));
		modulo.cargarContratoPorHoras(emp2,LocalDate.of(2000 ,1 ,9),5,500,LocalDate.now());
		assertEquals(2,modulo.generarRecibos().size());
		
	}
	

}
