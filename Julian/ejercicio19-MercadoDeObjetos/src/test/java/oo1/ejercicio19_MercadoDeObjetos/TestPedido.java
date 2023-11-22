package oo1.ejercicio19_MercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPedido {
	private Pedido p;
	private Cuotas pago;
	private Producto prod;
	private Persona vendedor;
	private RetirarEnComercio envio;
	
	@BeforeEach 
	public void setUp() {
		vendedor = new Persona("Juan","una calle");
		prod = new Producto("CocaCola","Gaseosa",100,5,vendedor);
		pago = new Cuotas();
		envio = new RetirarEnComercio();
		p = new Pedido(prod,2,pago,envio);
	}
	
	@Test
	public void testPrecioDelPedido() {
		assertEquals(240,p.precioDelPedido());
	}
	
}
