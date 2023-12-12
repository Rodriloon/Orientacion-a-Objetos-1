package Practica1.E18;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SistemaDeGestion {
	
	private List<Empleado> empleados;
	
	public SistemaDeGestion() {
		empleados = new ArrayList<>();
	}
	
	public void altaEmpleado(String nom, String ape, int cu, LocalDate nac, boolean con, boolean h, LocalDate i) {
		Empleado e = new Empleado(nom, ape, cu, nac,con, h, i);
		empleados.add(e);
	}
	
	public Empleado buscarEmpleado(int cu) {
		return empleados.stream()
								 .filter(E -> E.coincideCuil(cu))
								 .findFirst()
								 .orElse(null);
	}
	
	public void bajaEmpleado(Empleado E) {
		empleados.remove(E);
	}
	
	public Empleado queEmpleado(Empleado E) {
		return empleados.stream()
				 				 .filter(e -> e.equals(E))
				 				 .findFirst()
				 				 .orElse(null);
	}
	
	public void cargarContratoEmpleadoHoras(Empleado E, LocalDate i, LocalDate f, double valHor, int num) {
		Hora CH = new Hora(f, valHor, num, i);
		Empleado persona = queEmpleado(E);
		persona.agregarContratoHoras(CH);
	}
	
	public void cargarContratoEmpleadoPlanta(Empleado E, LocalDate i, double sueldo, double con, double hij) {
		Planta CP = new Planta(sueldo, con, hij, i);
		Empleado persona = queEmpleado(E);
		persona.agregarContratoPlanta(CP);
	}
	
	public List<Empleado> contratosVencidos() {
		return empleados.stream()
								 .filter(e -> e.contraActivo().getEstado() == false)
								 .collect(Collectors.toList());
	}
	
	public List<Recibo> genRecibos() {
		return empleados.stream()
								 .filter(e -> e.contraActivo().getEstado() == true)
								 .map(e -> e.generarRecibo())
								 .collect(Collectors.toList());
	}
	
}
