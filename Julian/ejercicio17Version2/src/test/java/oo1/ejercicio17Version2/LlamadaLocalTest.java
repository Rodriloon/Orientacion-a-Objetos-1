package oo1.ejercicio17Version2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LlamadaLocalTest {
	private Local call;
	
	@BeforeEach 
	void setUp() {
		call = new Local(LocalDate.of(2023, 10, 7),LocalTime.of(9, 0),100,001,002);
	}
	
	@Test
	void testCalcularCosto() {
		assertEquals(100,call.calcularCosto());
	}

}
