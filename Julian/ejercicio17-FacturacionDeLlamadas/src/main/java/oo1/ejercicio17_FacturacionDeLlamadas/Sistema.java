package oo1.ejercicio17_FacturacionDeLlamadas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {
	private List<Integer> numerosDisponibles;
	private List<Cliente> clientes;
	
	public Sistema() {
		numerosDisponibles = new ArrayList<Integer>();
		clientes = new ArrayList<Cliente>();
	}
	
	//Agregar un número a la lista de números disponibles
	public void agregarNumero(Integer numero) {
		this.numerosDisponibles.add(numero);
	}
	
	//Dar de alta como cliente a una persona física (un individuo)
	public Cliente agregarPersonaFisica(String nombre,String direccion,int DNI) {		
		Integer numero = this.numerosDisponibles.remove(0); 
		PersonaFisica persona = new PersonaFisica(nombre, direccion,DNI,numero);
		clientes.add(persona);
		return persona;
	}
	
	//Dar de alta como cliente a una persona jurídica (empresa, organismo, asociación,etc,)
	public Cliente agregarPersonaJuridica(String nombre,String direccion,int CUIL, String tipo) {
		Integer numero = this.numerosDisponibles.remove(0);		
		PersonaJuridica persona = new PersonaJuridica(nombre, direccion,CUIL,tipo,numero);
		clientes.add(persona);
		return persona;
	}
	
	//Registrar una llamada local.
	public Llamada registrarLlamadaLocal (LocalDate fecha, double hora, double duracion, int numeroLlama, int numeroRecibe) {
		LlamadaLocal llamada = new LlamadaLocal(fecha,hora,duracion,numeroLlama,numeroRecibe); //asi? o seria Llamada call = new LlamadaLocal..?
		Cliente cliente = this.quienLlama(numeroLlama);
		cliente.agregarLlamada(llamada);
		return llamada;
	}
	
	//Registrar una llamada interurbana
	public Llamada registrarLlamadaInterurbana (LocalDate fecha, double hora, double duracion, int numeroLlama, int numeroRecibe,double distancia) {
		LlamadaInterurbana llamada = new LlamadaInterurbana(fecha,hora,duracion,numeroLlama,numeroRecibe,distancia);
		Cliente cliente = this.quienLlama(numeroLlama);
		cliente.agregarLlamada(llamada);
		return llamada;
	}
	
	//Registrar una llamada internacional.
	public Llamada registrarLlamadaInternacional (LocalDate fecha, double hora, double duracion, int numeroLlama, int numeroRecibe,String origen, String destino) {
		LlamadaInternacional llamada = new LlamadaInternacional(fecha,hora,duracion,numeroLlama,numeroRecibe,origen,destino);
		Cliente cliente = this.quienLlama(numeroLlama);
		cliente.agregarLlamada(llamada);
		return llamada;
	}
	
	//Facturar las llamadas de un cliente.
	public Factura facturarLlamadasCliente(Cliente cliente, LocalDate desde, LocalDate hasta) {
		double monto = cliente.montoConDescuento(desde,hasta);
		Factura factura = new Factura(cliente,LocalDate.now(),desde,hasta,monto);
		return factura;
	}
	
	
	private Cliente quienLlama(Integer numero) {
		return clientes.stream()
				.filter(c -> c.comparo(numero))
				.findFirst()
				.orElse(null);
	}

	public List<Integer> getNumerosDisponibles() {
		return numerosDisponibles;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}
	
	
	
}
	

