package oo1.ejercicio19_MercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSistema {
	private Sistema sistema;
	
	@BeforeEach
	public void setUp() {
		sistema = new Sistema();
	}
	
	@Test
	public void testRegistrarVendedor() {
		assertEquals("Pepe",sistema.registrarVendedor("Pepe", "Lejos").getNombre());
	}
	
	@Test
	public void testRegistrarCliente() {
		assertEquals("Carlos",sistema.registrarVendedor("Carlos", "Lejos").getNombre());
	}
	
	@Test
	public void testBuscarVendedor() {
		sistema.registrarVendedor("Pepe", "Lejos");
		sistema.registrarVendedor("Carlos", "Cerca");
		sistema.registrarVendedor("Juan", "Ahi nomas");
		assertEquals("Carlos",sistema.buscarVendedor("Carlos").getNombre());
	}
	
	@Test
	public void testBuscarCliente() {
		sistema.registrarCliente("Pepe", "Lejos");
		sistema.registrarCliente("Carlos", "Cerca");
		sistema.registrarCliente("Juan", "Ahi nomas");
		assertEquals("Carlos",sistema.buscarCliente("Carlos").getNombre());
	}
	
	@Test
	public void testPonerProductoEnVenta() {
		Persona vendedor = new Persona("Juan","Lejos");
		assertEquals("Papitas",sistema.ponerProductoALaVenta("Papitas","Unas papitas", 10, 5, vendedor).getNombre());
	}
	
	@Test
	public void testBuscarProducto() {
		Persona vendedor = new Persona("Juan","Lejos");
		sistema.ponerProductoALaVenta("Papitas","Unas papitas", 10, 5, vendedor);
		sistema.ponerProductoALaVenta("CocaCola","Gaseosa", 10, 5, vendedor);
		sistema.ponerProductoALaVenta("CocaCola","Gaseosa", 12, 1, vendedor);
		assertEquals(2,sistema.buscarProducto("CocaCola").size());
		assertEquals(1,sistema.buscarProducto("Papitas").size());
		assertEquals(0,sistema.buscarProducto("Marroc").size());
	}
	
	@Test
	public void testCrearPedido() {
		Cliente cli = new Cliente("Pepe","Cerca");
		Persona vendedor = new Persona("Juan","Lejos");
		AlContado pago = new AlContado();
		RetirarEnSucursal envio = new RetirarEnSucursal();
		sistema.registrarCliente("Pepe","Cerca");
		Producto p1 = new Producto("Papitas","Unas papitas", 5, 10, vendedor);
		Producto p2 = new Producto("CocaCola","Gaseosa", 10, 10, vendedor);
		assertTrue(sistema.crearPedido(cli, p1, 7, pago, envio));
		assertFalse(sistema.crearPedido(cli, p2, 11, pago, envio));
	}

	@Test
	public void testCalcularCostoTotal() {
		Persona vendedor = new Persona("Juan","Lejos");
		AlContado pago = new AlContado();
		RetirarEnSucursal envio = new RetirarEnSucursal();
		Producto p1 = new Producto("Papitas","Unas papitas", 10, 10, vendedor);
		Pedido p = new Pedido(p1, 5, pago, envio);
		assertEquals(100,sistema.calcularCostoTotal(p));
	}
}
