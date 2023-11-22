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
	private	Usuario user1,user2,user3;
	private Usuario userProp1, userProp2;
	private Propiedad prop1,prop2,prop3;
	private Reserva reserva1,reserva2,reserva3,reserva4;
	private Sistema sistema;
	private DataLapse dateA,dateB;
	private LocalDate fromA,toA,fromB,toB;
	
	
	@BeforeEach
	public void inicializar() {
		fromA = LocalDate.of(2023, 9, 1);
		toA = LocalDate.of(2023, 9, 10);
		fromB = LocalDate.of(2023, 9, 11);
		toB = LocalDate.of(2022, 9, 15);
		dateA = new DataLapse(fromA,toA);
		dateB = new DataLapse(fromB,toB);
		user1 = new Usuario("Juan","71 1 y 2",442431);
		user2 = new Usuario("Jose","72 1 y 2",453123);
		user3 = new Usuario("Carlos","73 1 y 2",532422);
		userProp1 = new Usuario("Nicolas","41 13 y 14",300000);
		userProp2 = new Usuario("Matias","42 13 y 14",423423);
		prop1 = new Propiedad("Estancia","Casa campo","554",10,userProp1);
		prop2 = new Propiedad("La casa","Casa","600",20,userProp1);
		prop3 = new Propiedad("Casona","Casa grande","600",30,userProp2);
		reserva1 = new Reserva(prop1,dateA,user1);
		reserva2 = new Reserva(prop1,dateB,user2);
		
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
		assertNull(sistema.buscarPropiedadesDisponibles(dateA));//que es este error: expected <null> but was: <[]>
		sistema.registrarPropiedad(prop1);
		sistema.registrarPropiedad(prop2);
		assertNotNull(sistema.buscarPropiedadesDisponibles(dateA));
		
	}
	
	@Test 
	public void testHacerReserva() {
		assertNull(prop1.getReservas()); //mismo error
		sistema.hacerReserva(prop1, dateA, user1);
		assertNotNull(prop1.getReservas());
	}
	
	@Test 
	public void testCalcularIngresos() {
		userProp1.agregarPropiedadEnAlquiler(prop1);
		prop1.agregarReserva(reserva1);
		prop1.agregarReserva(reserva2);
		assertEquals(100,sistema.calcularIngresos(user1, dateA));
		
	}

}
