package ejercicio12.ejercicio12_VolumenYSuperficie;

public class ReporteDeConstruccionTest {
	ReporteDeConstruccion rp;
	Cilindro c;
	Esfera e;
	PrismaRectangular pr;
	
	@BeforeEach
	public void inicializar() {
		rp = new ReporteDeConstruccion();
		c = new Cilindro("Hierro","Azul",10)
	}
	
	
}
