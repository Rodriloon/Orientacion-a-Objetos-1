package Practica1.E18;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaDeGestionTest {
	
	private SistemaDeGestion modulo;
	private Empleado em1;
	private Empleado em2;
	
	@BeforeEach
	public void inicializar() {
		modulo = new SistemaDeGestion();
		em1 = new Empleado("Rodri", "Martinez", 209, LocalDate.of(2002, 04, 25), false, false, LocalDate.now());
		em2 = new Empleado("Licho", "Piva", 206, LocalDate.of(2002,10,29), true, false, LocalDate.of(2010, 12, 20));
	}
	
	@Test
	public void testBuscarEmpleado() {
		modulo.altaEmpleado("Rodri", "Martinez", 209, LocalDate.of(2002, 04, 25), false, false, LocalDate.now());
		modulo.altaEmpleado("Licho", "Piva", 206, LocalDate.of(2002,10,29), true, false, LocalDate.of(2010, 12, 20));
		Empleado buscar = modulo.buscarEmpleado(209);
		assertEquals(209, buscar.getCuil());
	}
	
	@Test
	public void testContratosVencidos() {
		modulo.altaEmpleado("Rodri", "Martinez", 209, LocalDate.of(2002, 04, 25), false, false, LocalDate.now());
		modulo.altaEmpleado("Licho", "Piva", 206, LocalDate.of(2002,10,29), true, false, LocalDate.of(2010, 12, 20));
		modulo.cargarContratoEmpleadoHoras(em1,LocalDate.of(2000 ,1 ,9), LocalDate.of(2026 ,1 ,9), 5, 500);
		modulo.cargarContratoEmpleadoHoras(em2,LocalDate.of(2000 ,1 ,9), LocalDate.of(2024 ,1 ,9), 5, 500);
		modulo.cargarContratoEmpleadoHoras(em2,LocalDate.of(2000 ,1 ,9), LocalDate.now(), 5, 500);
		assertEquals(2,modulo.genRecibos().size());
	}
	
}
