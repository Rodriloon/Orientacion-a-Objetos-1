package oo1.ejercicio15_AlquilerDePropiedades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import oo1.ejercicio14_dataLapse.DataLapse;

public class PropiedadTest {
	private Propiedad prop;
	private Reserva res1,res2;
	private Usuario userProp,user1,user2;
	private DataLapse periodo1,periodo2,periodoAmbos;
	private LocalDate fromA,fromB,toA,toB;
	private PoliticaDeRemplazo flexible,moderada,estricta;
	
	
	@BeforeEach
	public void incializar() {
		fromA = LocalDate.of(2023, 9, 1);
		toA = LocalDate.of(2023, 9, 10);
		fromB = LocalDate.of(2023, 10, 21);
		toB = LocalDate.of(2023, 10, 30);
		
		flexible = new Flexible();
		moderada = new Moderada();
		estricta = new Estricta();
		
		periodo1 = new DataLapse(fromA,toA);
		periodo2 = new DataLapse(fromB,toB);
		periodoAmbos = new DataLapse(LocalDate.of(2023, 8, 30),LocalDate.of(2023, 10, 30));
		
		user1 = new Usuario("Julian","2 y 47", 44044);
		prop = new Propiedad("La casona","Una re casa","5 y 45",100,userProp,flexible);
		res1 = new Reserva(prop,periodo1,user1);
		res2 = new Reserva(prop,periodo2,user2);
		
	}
	
	@Test
	public void testObtenerMontoReservas() {
		assertEquals(0,prop.obtenerMontoReservas(periodo1));
		prop.agregarReserva(res1);
		prop.agregarReserva(res2);
		assertEquals(1800,prop.obtenerMontoReservas(periodoAmbos));
	}
	
	@Test
	public void testEstaLibre() {
		prop.agregarReserva(res1);
		assertTrue(prop.estaLibre(periodo2));
		assertFalse(prop.estaLibre(periodo1));
	}
	
	@Test
	public void testPoltica() {
		prop.agregarReserva(res1);
		assertEquals(900,prop.cancelarReserva(res1, LocalDate.of(2023, 8,20))); //falta mucho
		assertEquals(0,prop.cancelarReserva(res1, LocalDate.of(2023, 9, 1))); //mismo dia 
		assertEquals(0,prop.cancelarReserva(res1, LocalDate.of(2023, 9, 20))); //pasada por mucho
		assertEquals(900,prop.cancelarReserva(res1, LocalDate.of(2023, 8, 31))); //un dia antes 
		
		prop = new Propiedad("La casona","Una re casa","5 y 45",100,userProp,moderada);
		assertEquals(900,prop.cancelarReserva(res1, LocalDate.of(2023, 8,20))); //falta mucho
		assertEquals(0,prop.cancelarReserva(res1, LocalDate.of(2023, 9, 1))); //mismo dia
		assertEquals(0,prop.cancelarReserva(res1, LocalDate.of(2023, 9, 20))); //pasada por mucho
		assertEquals(0,prop.cancelarReserva(res1, LocalDate.of(2023, 8, 31))); //un dia antes
		assertEquals(450,prop.cancelarReserva(res1, LocalDate.of(2023, 8, 30))); //2 dias antes
		
		prop = new Propiedad("La casona","Una re casa","5 y 45",100,userProp,estricta);
		assertEquals(0,prop.cancelarReserva(res1, LocalDate.of(2023, 8,20))); //falta mucho
		
	}
	
	

}
