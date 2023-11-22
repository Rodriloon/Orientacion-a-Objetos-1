package oo1.ejercicio15_AlquilerDePropiedades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import oo1.ejercicio14_dataLapse.DataLapse;




public class Propiedad {
	private String nombre;
	private String descripcion;
	private String direccion;
	private double precioPorNoche;
	private Usuario propietario;
	private PoliticaDeRemplazo politica;
	private List<Reserva> reservas;
	
	public Propiedad(String nombre, String descripcion, String direccion, double precioPorNoche, Usuario propietario, PoliticaDeRemplazo politica) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.precioPorNoche = precioPorNoche;
		this.propietario = propietario;
		this.reservas = new ArrayList<Reserva>();
		this.politica = politica;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public Usuario getPropietario() {
		return propietario;
	}
	
	public double obtenerMontoReservas(DataLapse periodo){
		return  reservas.stream()
				.filter(r -> r.comparoPeriodo(periodo))
				.mapToDouble(r -> r.diasReserva() * this.precioPorNoche)
				.sum();
	}

	public boolean estaLibre(DataLapse periodo) {
		int count = (int) reservas.stream()
				.filter(r -> r.comparoPeriodo(periodo))
				.count(); //contabilizo si hay solapamiento
		if (count == 0) return true;
		else return false;
	}
	
	public double cancelarReserva(Reserva res, LocalDate fecha){
		return politica.devolver(res, fecha);
	}
	
	public void agregarReserva(Reserva reserva) {
		reservas.add(reserva);
	}
	
	public void eliminarReserva (Reserva reserva) {
		reservas.remove(reserva); 		
	}
		

	public List<Reserva> getReservas() {
		return reservas;
	}	
	
	
}