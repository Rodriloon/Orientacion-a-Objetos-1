package oo1.ejercicio17Version2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LlamadaInterurbanaTest {
	private Interurbana call1,call2,call3,call4;
	
	@BeforeEach
	void setUp() {
		call1 = new Interurbana(LocalDate.of(2023, 7, 10),LocalTime.of(9, 0),100,001,002,90);
		call2 = new Interurbana(LocalDate.of(2023, 7, 10),LocalTime.of(9, 0),100,001,002,100);
		call3 = new Interurbana(LocalDate.of(2023, 7, 10),LocalTime.of(9, 0),100,001,002,500);
		call4 = new Interurbana(LocalDate.of(2023, 7, 10),LocalTime.of(9, 0),100,001,002,510);
	}
	
	@Test
	void testCalcularCosto() {
		assertEquals(205,call1.calcularCosto());
		assertEquals(255,call2.calcularCosto());
		assertEquals(255,call3.calcularCosto());
		assertEquals(305,call4.calcularCosto());
	}

}
