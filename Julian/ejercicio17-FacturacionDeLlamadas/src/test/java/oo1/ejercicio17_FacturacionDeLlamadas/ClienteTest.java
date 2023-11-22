package oo1.ejercicio17_FacturacionDeLlamadas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {
	private PersonaFisica cliF;
	private PersonaJuridica cliJ;
	private LlamadaLocal local1,local2;
	
	@BeforeEach
	public void inicializar() {
		cliF = new PersonaFisica("Julian","51 y 2",44045065,2211);
		cliJ = new PersonaJuridica("Pepe","32 Y 2",123,"Banco",2212);

		local1 = new LlamadaLocal(LocalDate.of(2023, 7, 8),800,10,221001,221002);
		local2 = new LlamadaLocal(LocalDate.of(2023, 7, 9),800,10,221001,221002);
		
	}
	
	@Test
	public void testMontoTotalClienteFisico() {
		cliF.agregarLlamada(local1);
		cliF.agregarLlamada(local2);
		assertEquals(18,cliF.montoConDescuento(LocalDate.of(2023, 7, 7),LocalDate.of(2023, 7, 10))); //ENTRE 
		assertEquals(18,cliF.montoConDescuento(LocalDate.of(2023, 7, 8),LocalDate.of(2023, 7, 9))); //IGUALES 
		assertEquals(0,cliF.montoConDescuento(LocalDate.of(2023, 7, 1),LocalDate.of(2023, 7, 2))); //DISTINTOS 		
	}
	
	@Test
	public void testMontoTotalClienteJuridico() {
		cliJ.agregarLlamada(local1);
		cliJ.agregarLlamada(local2);
		assertEquals(20,cliJ.montoConDescuento(LocalDate.of(2023, 7, 7),LocalDate.of(2023, 7, 10))); //ENTRE 
		assertEquals(20,cliJ.montoConDescuento(LocalDate.of(2023, 7, 8),LocalDate.of(2023, 7, 9))); //IGUALES 
		assertEquals(0,cliJ.montoConDescuento(LocalDate.of(2023, 7, 1),LocalDate.of(2023, 7, 2))); //DISTINTOS 		

	}
	
}
