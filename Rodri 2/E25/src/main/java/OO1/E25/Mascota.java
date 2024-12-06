package OO1.E25;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mascota {
	
	private String nombre;
	private LocalDate fechaNacimiento;
	private String especie;
	private List<Servicio> servicios;
	
	
	public Mascota(String nombre, LocalDate fechaNacimiento, String especie) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.especie = especie;
		this.servicios = new ArrayList<>();
	}
	
	
	public boolean bonificacionGuarderia() {
		if (servicios.size() >= 5)
			return true;
		return false;
	}
	
	public void agregarServicio(Servicio servicio) {
		servicios.add(servicio);
	}
	
	public Consulta altaConsulta(Medico medico) {
		Consulta cons = new Consulta(this, medico);
		this.agregarServicio(cons);
		return cons;
	}
	
	public Vacunacion altaVacunacion(Medico medico, String nombreVac, double valor) {
		Vacunacion vac = new Vacunacion(this, medico, nombreVac, valor);
		this.agregarServicio(vac);
		return vac;
	}
	
	public Guarderia altaGuarderia(int dias) {
		Guarderia guar = new Guarderia(this, dias);
		this.agregarServicio(guar);
		return guar;
	}
	
	public double recaudacionFecha(LocalDate fecha) {
		return servicios.stream().mapToDouble(s -> s.fechaParametro(fecha)).sum();
	}
}

