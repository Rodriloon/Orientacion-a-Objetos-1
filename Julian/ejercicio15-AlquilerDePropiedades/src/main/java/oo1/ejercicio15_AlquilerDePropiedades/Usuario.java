package oo1.ejercicio15_AlquilerDePropiedades;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import oo1.ejercicio14_dataLapse.DataLapse;

public class Usuario {
	private String nombre;
	private String direccion;
	private int dni;
	private List<Propiedad> propiedadesEnAlquiler;
	private List<Reserva> reservas;
	
	public Usuario(String nombre, String direccion, int dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		this.propiedadesEnAlquiler = new ArrayList<>();
		this.reservas = new ArrayList<>();
	}
	
	public void agregarReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public void agregarPropiedadEnAlquiler(Propiedad propiedad) {
		this.propiedadesEnAlquiler.add(propiedad);
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getDni() {
		return dni;
	}

	public List<Reserva> getPropiedadesEnAlquiler() {
		return reservas;
	}
	

	//recorro lista de propiedades obteniendo los precios totales de las reservas 
	public double ingresosPropitario(Usuario user, DataLapse fecha) {
		return this.propiedadesEnAlquiler.stream()
				.mapToDouble(p -> p.obtenerMontoReservas(fecha))
				.sum();
		
	}
	
	
	

}
