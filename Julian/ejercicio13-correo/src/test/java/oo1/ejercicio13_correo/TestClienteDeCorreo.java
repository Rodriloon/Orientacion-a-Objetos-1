package oo1.ejercicio13_correo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestClienteDeCorreo {
	private Email emailA,emailB,emailC;
	private Carpeta carpetaA,carpetaB,inbox;
	private ClienteDeCorreo cliente;
	private Archivo adA,adB;
	
	
	@BeforeEach
	public void setUp() {
		inbox = new Carpeta("Inbox");
		cliente = new ClienteDeCorreo();
		carpetaA = new Carpeta("Carpeta A");
		carpetaB = new Carpeta("Carpeta A");
		emailA = new Email("Autoevaluacion","Se me paso la autoevaluacion del viernes");
		emailB = new Email("Presentacion","Hola que tal");
		emailC = new Email("Cursada","Que dias tengo que cursar");
		adA = new Archivo("Objetos 1 es lo mas!");
		adB = new Archivo("Objetos 2 vamo a ver");
	}
	
	
	@Test
	public void testMover() {
		assertTrue(carpetaB.getEmails().isEmpty());
		carpetaA.agregarCorreo(emailA);
		cliente.mover(emailA, carpetaA, carpetaB);
		assertTrue(carpetaA.getEmails().isEmpty());
		assertFalse(carpetaB.getEmails().isEmpty());	
	}
	
	@Test
	public void testBuscar() {
		assertNull(cliente.buscar("Mamadera"));
		carpetaA.agregarCorreo(emailA);
		carpetaB.agregarCorreo(emailB);
		carpetaB.agregarCorreo(emailC);
		cliente.agregarCarpeta(carpetaA);
		cliente.agregarCarpeta(carpetaB);
		assertEquals(emailC,cliente.buscar("Cursada"));
	}
	
	@Test
	public void testEspacioOcupado() {
		assertEquals(0,cliente.espacioOcupado());
		emailA.agregarArchivoAdjunto(adA); //20 
		emailB.agregarArchivoAdjunto(adB); //20
		carpetaA.agregarCorreo(emailA); //54
		carpetaB.agregarCorreo(emailB); //24
		cliente.agregarCarpeta(carpetaA);
		cliente.agregarCarpeta(carpetaB);
		assertEquals(118,cliente.espacioOcupado());
		
		
	}
}
