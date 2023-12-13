package Practica1.Examen30_11_2023;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Mascota {
	
	private String nombre;
	private LocalDate fecha;
	private String especie;
	private List<Servicio> historial;
	
	public Mascota(String nombre, LocalDate fecha, String especie) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.especie = especie;
		this.historial = new ArrayList<>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public Consulta agregarConsulta(MedicoVet med) {
		Consulta cons = new Consulta(med.getHonorarios(), med.getFechaIngreso().getDayOfYear(), 300, LocalDate.now().getDayOfWeek().equals(DayOfWeek.SUNDAY));
		historial.add(cons);
		return cons;
	}
	
	public Vacunacion agregarVac(MedicoVet med, String nombre, double costo) {
		Vacunacion vac = new Vacunacion(med.getHonorarios(), 500, LocalDate.now().getDayOfWeek().equals(DayOfWeek.SUNDAY), nombre, costo);
		historial.add(vac);
		return vac;
	}
	
	public Guarderia agregarGuard(int cant) {
		Guarderia guard = new Guarderia(500, cant, false);
		historial.add(guard);
		return guard;
	}
	
	public double RecaudacionPorFecha(LocalDate diaX) {
		return historial.stream().filter(h -> h.getDia() == diaX)
								 .mapToDouble(h -> h.Costo())
								 .sum();
	}
	
	public boolean esCachorro(LocalDate diaC) {
		if (Period.between(this.getFecha(), diaC).getYears() <= 2)
			return true;
		return false;
	}
	
}
