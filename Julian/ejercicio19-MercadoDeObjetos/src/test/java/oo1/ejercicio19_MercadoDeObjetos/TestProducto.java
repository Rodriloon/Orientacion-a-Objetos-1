package oo1.ejercicio19_MercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestProducto {
	private Producto prod;
	private Persona vendedor;
	
	@BeforeEach
	public void setUp() {
		vendedor = new Persona("Juan","una calle");
		prod = new Producto("Papitas","Hola que tal",10,15,vendedor);
	}
	
	@Test
	public void testCoincide() {
		assertTrue(prod.coincide("Papitas"));
		assertFalse(prod.coincide("Pepsi"));
	}
	
	@Test
	public void testVerificarStock() {
		assertTrue(prod.verificarStock(5));
		assertTrue(prod.verificarStock(10));
		assertFalse(prod.verificarStock(5));
	}

}
