package OO1.E17;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import OO1.E14b.DateLapse;

public class Usuario {
	
	private String nombre;
	private String direccion;
	private int DNI;
	private List<Propiedad> propiedadesEnAlquiler;
	private List<Reserva> reservas;
	
	public Usuario(String n, String d, int dni) {
		this.nombre = n;
		this.direccion = d;
		this.DNI = dni;
		this.propiedadesEnAlquiler = new ArrayList<>();
		this.reservas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getDni() {
		return DNI;
	}
	
	public void agregarPropiedadEnAlquiler(Propiedad propiedad) {
		this.propiedadesEnAlquiler.add(propiedad);
	}
	
	public boolean verificarDisponibilidad(Propiedad inmueble, LocalDate inicial, LocalDate fin) {
		
		return false;
	}
	
	public void crearReserva(Reserva res) {
		reservas.add(res);
	}
	
	public double calcularPrecio(Reserva res) {
		return res.calculo();
	}
	
	public void cancelarReserva(Reserva res) {
		if (res.esPosterior(LocalDate.now()))
			reservas.remove(res);
	}
	
	public double calcularIngresos(DateLapse lapso) {
		double aux = reservas.stream().filter(r -> r.comparoPeriodo(lapso)).mapToDouble(res -> res.calculo()).sum();
		return aux * 0.75;
	}
	
}
