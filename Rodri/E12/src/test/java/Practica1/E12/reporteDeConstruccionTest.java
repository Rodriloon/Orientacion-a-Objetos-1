package Practica1.E12;
import org.junit.jupiter.api.BeforeEach;

public class reporteDeConstruccionTest {
	
	reporteDeConstruccion rp;
	cilindro c;
	esfera e;
	prismaRectangular pr;
	
	@BeforeEach
	public void inicializar() {
		rp = new reporteDeConstruccion();
		c = new cilindro("Hierro","Azul",10, 4);
	}
	
}
