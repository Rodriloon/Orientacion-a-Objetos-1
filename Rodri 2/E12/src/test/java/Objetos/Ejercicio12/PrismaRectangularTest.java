package Objetos.Ejercicio12;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrismaRectangularTest {

private PrismaRectangular prisma;
	
	@BeforeEach
	public void setUp() {
		prisma = new PrismaRectangular(4, 3, 2, "CELESTE", "METAL");
	}
	
	@Test
	public void testSuperficie() {
		assertEquals(52, prisma.getSuperficie());
	}
	
	@Test
	public void testVolumen() {
		assertEquals(24, prisma.getVolumen());
	}

}
