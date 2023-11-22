package oo1.ejercicio15_AlquilerDePropiedades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import oo1.ejercicio14_dataLapse.DataLapse;

public class Propiedad {
	private String nombre;
	private String descripcion;
	private String direccion;
	private double precioPorNoche;
	private Usuario propietario;
	private List<Reserva> reservas;
	
	public Propiedad(String nombre, String descripcion, String direccion, double precioPorNoche, Usuario propietario) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.precioPorNoche = precioPorNoche;
		this.propietario = propietario;
		this.reservas = new ArrayList<>();
	}

	public boolean estaLibre(DataLapse periodo) {
		int count = (int) reservas.stream()
				.filter(r -> r.comparoPeriodo(periodo))
				.count(); //contabilizo si hay solapamiento
		if (count == 0) return true;
		else return false;
	}
	
	public void agregarReserva(Reserva reserva) {
		reservas.add(reserva);
	}
	
	//Obtener las reservas de un usuario
	public List<Reserva> obtenerReservas(Usuario user){
		return reservas.stream()
				.filter(r -> r.getInquilino() == user)
				.collect(Collectors.toList());
	}
	
	//Calcular el precio de una reserva
	public double calcularPresioDeReserva(Reserva reserva) {
		return reserva.getMontoIngresos(this.precioPorNoche);
	}
	
	//Eliminar reserva
	public void eliminarReserva (Reserva reserva) {
		if (reserva.esPosterior(LocalDate.now())) { 
			reservas.remove(reserva); 
		}
	}
	
	//obtengo monto total de reservas por propiedad del usuario propietario
	public double obtenerMontoReservas(DataLapse periodo){
		return  reservas.stream()
				.filter(r -> r.comparoPeriodo(periodo))
				.mapToDouble(r -> r.getMontoIngresos(this.precioPorNoche))
				.sum();
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

	public List<Reserva> getReservas() {
		return reservas;
	}
	
	
	
	
	
	
	
		
	
}