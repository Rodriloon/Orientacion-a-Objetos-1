package OO1.E24;
import java.time.LocalDate;

public class Vehiculo {
	
	private Conductor dueño;
	private String descripcion;
	private int capacidad;
	private int fechaFabricacion;
	private double valor;
	
	
	public Vehiculo(Conductor dueño, String descripcion, int capacidad, int fechaFabricacion, double valor) {
		this.dueño = dueño;
		this.descripcion = descripcion;
		this.capacidad = capacidad;
		this.fechaFabricacion = fechaFabricacion;
		this.valor = valor;
	}

	public Conductor getDueño() {
		return dueño;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getFechaFabricacion() {
		return fechaFabricacion;
	}

	public double getValor() {
		return valor;
	}
	
	public boolean calcularAntiguedad() {
		if ((LocalDate.now().getYear() - fechaFabricacion) < 5)
			return true;
		return false;
	}
}
