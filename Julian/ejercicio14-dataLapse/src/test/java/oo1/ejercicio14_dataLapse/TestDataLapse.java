package oo1.ejercicio14_dataLapse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import oo1.ejercicio14_datalapse2.DataLapseInterface;

public class TestDataLapse {
	private DataLapseInterface dp;
	private LocalDate local1,local2,hoy,other,año1,año2;

	@BeforeEach
	public void setUp() {
		local1 = LocalDate.of(2023, 9, 24);
		local2 = LocalDate.of(2023, 10, 4);
		año2 = LocalDate.of(2023, 1, 1);
		año1 = LocalDate.of(2022, 1, 1);
		hoy = LocalDate.now();
	}
	
	@Test
	public void testSizeInDays() {
		dp = new DataLapse(hoy,hoy);
		assertEquals(0,dp.sizeInDays());	//mismo dia
		
		dp = new DataLapse(local1,local2);	
		assertEquals(10,dp.sizeInDays());	//fechas distintos
		
		dp = new DataLapse(año1,año2);	
		assertEquals(365,dp.sizeInDays());	//un año de diferencia 
	}
	
	@Test
	public void testIncludesDate() { 
		dp = new DataLapse(local1,local2);
		
		other = LocalDate.of(2022, 1, 4);
		assertFalse(dp.includesDate(other)); //fuera para atras
		
		other = LocalDate.of(2024, 1, 4);
		assertFalse(dp.includesDate(other)); //fuera para adelante
		
		other = LocalDate.of(2023, 9, 29);  //dentro 
		assertTrue(dp.includesDate(other));
		
		other = LocalDate.of(2023, 9, 24);  //igual a from
		assertTrue(dp.includesDate(other));
		
	}
}
