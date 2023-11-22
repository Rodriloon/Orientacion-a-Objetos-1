package oo1.ejercicio17_FacturacionDeLlamadas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaTest {
	private Sistema sistema;
	
	@BeforeEach
	public void inicializar() {
		sistema = new Sistema();
		sistema.agregarNumero(221000001); //primero
		sistema.agregarNumero(221000002); //segundo
		sistema.agregarNumero(221000003); //tercero
		sistema.agregarNumero(221000004); //cuarto

	}
	//Tengo que implementar los test de los registrar llamadas / agregar clientes? 
	
	@Test
	public void testFacturarLlamadasLocal() {
		PersonaFisica cliF = new PersonaFisica("Julian","51 y 2",44045065,221000001);
		
		assertEquals(cliF.getNumero(),sistema.agregarPersonaFisica("Julian","51 y 2",44045065).getNumero());
		sistema.registrarLlamadaLocal(LocalDate.of(2023, 7, 22), 1500, 10, 221000001, 221000004);
		sistema.registrarLlamadaLocal(LocalDate.of(2023, 7, 10), 900, 10, 221000002, 221000001);
		sistema.registrarLlamadaLocal(LocalDate.of(2023, 7, 30), 800, 10, 221000001, 221000007);
		assertEquals(18,sistema.facturarLlamadasCliente(cliF, LocalDate.of(2023, 3, 30), LocalDate.of(2023, 10, 24)));
				
	}
}
