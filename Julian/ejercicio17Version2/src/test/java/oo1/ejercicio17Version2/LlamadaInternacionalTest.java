package oo1.ejercicio17Version2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LlamadaInternacionalTest {
	private Internacional call1,call2,call3,call4;
	
	@BeforeEach
	void setUp() {
		call1 = new Internacional(LocalDate.of(2023, 10, 10),LocalTime.of(0, 0),100,001,002,"Suiza","Argentina");
		call2 = new Internacional(LocalDate.of(2023, 10, 10),LocalTime.of(10, 0),100,001,002,"Suiza","Argentina");
		call3 = new Internacional(LocalDate.of(2023, 10, 10),LocalTime.of(8, 0),100,001,002,"Suiza","Argentina");
		call4 = new Internacional(LocalDate.of(2023, 10, 10),LocalTime.of(20, 0),100,001,002,"Suiza","Argentina");	
	
	}
	
	@Test
	void testCalcularCosto() {
		assertEquals(300,call1.calcularCosto());
		assertEquals(400,call2.calcularCosto());
		assertEquals(400,call3.calcularCosto());
		assertEquals(400,call4.calcularCosto());

	}

}
