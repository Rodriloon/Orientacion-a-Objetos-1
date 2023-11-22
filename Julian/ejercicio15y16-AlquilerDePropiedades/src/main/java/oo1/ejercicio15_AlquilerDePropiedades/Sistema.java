package oo1.ejercicio15_AlquilerDePropiedades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import oo1.ejercicio14_dataLapse.DataLapse;



public class Sistema {
	private List<Propiedad> propiedades;
	private List<Usuario> usuarios;
	private List<Reserva> reservas;
	
	public Sistema() {
		this.propiedades = new ArrayList<Propiedad>();
		this.usuarios = new ArrayList<Usuario>();
		this.reservas = new ArrayList<Reserva>();
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
	public Reserva hacerReserva(Propiedad propiedad, DataLapse periodo, Usuario inquilino) { 
		Reserva reserva = null;
		if (propiedad.estaLibre(periodo) && (propiedades.contains(propiedad))) {
			reserva = new Reserva(propiedad,periodo,inquilino);
			this.agregarReserva(reserva);
			propiedad.agregarReserva(reserva);
			inquilino.agregarReserva(reserva);
			
		}
		return reserva;
		
	}
	
	//Calcular el precio de una reserva
	public double calcularPresioDeReserva(Reserva reserva) {
		return reserva.getMontoIngresos();
	}	
	
	
	//Eliminar reserva
	public boolean eliminarReserva (Reserva reserva) {
		boolean eliminado = false;
		if (reserva.esPosterior(LocalDate.now())) { 
			reservas.remove(reserva); 
			reserva.desvincular();
			eliminado = true;
		}
		return eliminado;
	}
	
	
	//Obtener las reservas de un usuario
	public List<Reserva> obtenerReservas(Usuario user){
		return reservas.stream()
				.filter(r -> r.getInquilino() == user) //r.compararUsuario
				.collect(Collectors.toList());
	}
	
	//Calcular los ingresos de un propietario
	public double calcularIngresos(Usuario user, DataLapse periodo) {
		return user.ingresosPropitario(periodo);
		
		/**prop = user.getPropiedades()
		filtrar reservas para ver cuales son de esas propiedades
		calcular para las reservas**/
		
	}

	
	//obtengo monto total de reservas por propiedad del usuario propietario
	public double obtenerMontoReservas(DataLapse periodo){
		return  reservas.stream()
				.filter(r -> r.comparoPeriodo(periodo))
				.mapToDouble(r -> r.getMontoIngresos())
				.sum();
	}

	
	public void agregarReserva(Reserva reserva) {
		reservas.add(reserva);
	}
	
	public List<Propiedad> getPropiedades() {
		return propiedades;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	 
	public List<Reserva> getReservas() {
		return reservas;
	}
	
}