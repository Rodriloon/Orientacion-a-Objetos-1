package oo1.ejercicio17Version2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteJuridicoTest {
	private Juridico cliente;
	private Local call;

	@BeforeEach
	void setUp() {
		cliente = new Juridico("Pepe","51 y 10",4002,232,"SociedadAnoima");
		call = new Local(LocalDate.of(2023, 7, 8),LocalTime.of(9, 0),100,201,202);
	}
	
	@Test
	void testFacturar() {
		cliente.agregarLlamada(call);
		Factura fact1 = cliente.facturar(LocalDate.of(2023, 7, 7), LocalDate.of(2023, 7, 10));
		Factura fact2 = cliente.facturar(LocalDate.of(2023, 7, 8), LocalDate.of(2023, 7, 9));
		Factura fact3 = cliente.facturar(LocalDate.of(2023, 5,1), LocalDate.of(2023,5,9));
		assertEquals(0,fact3.getMonto());
		assertEquals(100,fact2.getMonto());
		assertEquals(100,fact1.getMonto());
	}
	
}
