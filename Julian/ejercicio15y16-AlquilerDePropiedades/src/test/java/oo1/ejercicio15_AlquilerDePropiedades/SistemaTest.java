package oo1.ejercicio15_AlquilerDePropiedades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import oo1.ejercicio14_dataLapse.DataLapse;


public class SistemaTest {
	private	Usuario user1,user2;
	private Usuario userProp1;
	private Propiedad prop1,prop2;
	private Reserva reserva1,reserva2,reservaHoy;
	private Sistema sistema;
	private DataLapse dateA,dateB,dateC;
	private LocalDate fromA,toA,fromB,toB;
	private PoliticaDeRemplazo flexible,moderada,estricta;
	
	
	@BeforeEach
	public void inicializar() {
		fromA = LocalDate.of(2023, 9, 1);
		toA = LocalDate.of(2023, 10, 10);
		
		fromB = LocalDate.of(2023, 10, 21);
		toB = LocalDate.of(2023, 10, 30);

		
		dateA = new DataLapse(fromA,toA);
		dateB = new DataLapse(fromB,toB);
		dateC = new DataLapse(LocalDate.now(),LocalDate.of(2023, 10, 21));
		
		user1 = new Usuario("Juan","71 1 y 2",442431);
		user2 = new Usuario("Jose","72 1 y 2",453123);
		userProp1 = new Usuario("Nicolas","41 13 y 14",300000);
		
		prop1 = new Propiedad("Estancia","Casa campo","554",10,userProp1,flexible);
		prop2 = new Propiedad("La casa","Casa","600",20,userProp1,moderada);
		
		reserva1 = new Reserva(prop1,dateA,user1);
		reserva2 = new Reserva(prop1,dateB,user2);
		reservaHoy = new Reserva(prop2,dateC,user1);
		sistema = new Sistema();
	}
	
	@Test
	public void testRegistrarUsuarios() {
		assertTrue(sistema.getUsuarios().isEmpty());
		sistema.registrarUsuario(user1);
		assertFalse(sistema.getUsuarios().isEmpty());
	}
	@Test
	public void testRegistrarPropiedades() {
		assertTrue(sistema.getPropiedades().isEmpty());
		sistema.registrarPropiedad(prop1);
		assertFalse(sistema.getPropiedades().isEmpty());
	}
	
	@Test
	public void testBuscarPropiedadesDisponibles() {
		assertTrue(sistema.buscarPropiedadesDisponibles(dateA).isEmpty());
		sistema.registrarPropiedad(prop1);
		sistema.registrarPropiedad(prop2);
		assertNotNull(sistema.buscarPropiedadesDisponibles(dateA));	
	}
	
	@Test 
	public void testHacerReserva() {
		assertNull(sistema.hacerReserva(prop1, dateA, user1)); 
		sistema.hacerReserva(prop1, dateB, user1);
		assertNotNull(prop1.getReservas());
	}
	
	
	@Test
	public void testCalcularPrecioReserva() {
		assertEquals(90, sistema.calcularPresioDeReserva(reserva2));
		assertEquals(20, sistema.calcularPresioDeReserva(reservaHoy));
	}
	

	@Test
	public void testEliminarReserva() {
		assertTrue(sistema.getReservas().isEmpty());
		sistema.registrarPropiedad(prop1);
		sistema.agregarReserva(reserva1);
		sistema.agregarReserva(reserva2);
		sistema.agregarReserva(reservaHoy);
		assertTrue(sistema.eliminarReserva(reserva1));
		assertFalse(sistema.eliminarReserva(reserva2));
		assertFalse(sistema.eliminarReserva(reservaHoy));
		assertFalse(sistema.getReservas().isEmpty());
	}
	
	@Test
	public void testObtenerReservas() {
		sistema.registrarPropiedad(prop1);
		sistema.registrarPropiedad(prop2);
		assertTrue(sistema.obtenerReservas(user1).isEmpty());
		sistema.registrarUsuario(user1);
		sistema.hacerReserva(prop1, dateA, user1);
		sistema.hacerReserva(prop2, dateB, user1);
		assertFalse(sistema.obtenerReservas(user1).isEmpty());
	}
	
	
	@Test 
	public void testCalcularIngresosPropietario() {
		sistema.registrarUsuario(userProp1);
		userProp1.agregarPropiedadEnAlquiler(prop1);
		assertEquals(0,sistema.calcularIngresos(user1, dateA));
		prop1.agregarReserva(reserva1);
		prop1.agregarReserva(reserva2);
		assertEquals(90,sistema.calcularIngresos(userProp1, dateB));
	}

}