package oo1.ejercicio15_AlquilerDePropiedades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import oo1.ejercicio14_dataLapse.DataLapse;

public class Sistema {
	private List<Propiedad> propiedades;
	private List<Usuario> usuarios;
	
	public Sistema() {
		this.propiedades = new ArrayList<>();
		this.usuarios = new ArrayList<>();
	}
	
	//Registrar usuarios
	public Usuario registrarUsuario(Usuario user) {
		usuarios.add(user);
		return user;
	}
	
	//Registrar una propiedad en alquiler
	public Propiedad registrarPropiedad(Propiedad propiedad) {
		propiedades.add(propiedad);
		return propiedad;
	}
	
	//Buscar propiedades disponibles en un período
	public List<Propiedad> buscarPropiedadesDisponibles(DataLapse periodo){
		return propiedades.stream()
				.filter(p -> p.estaLibre(periodo))
				.collect(Collectors.toList());
	}
	
	//Hacer una reserva
	public void hacerReserva(Propiedad propiedad, DataLapse periodo, Usuario inquilino) { 
		Reserva reserva = new Reserva(propiedad,periodo,inquilino);
		if (propiedad.estaLibre(periodo)) {
			inquilino.agregarReserva(reserva);
			propiedad.agregarReserva(reserva);
		}
		
	}
	
	//Calcular los ingresos de un propietario
	public double calcularIngresos(Usuario user, DataLapse periodo) {
		return user.ingresosPropitario(user, periodo);
	}

	public List<Propiedad> getPropiedades() {
		return propiedades;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	 
	
}
