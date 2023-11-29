package Practica1.E17;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	
	private List<Integer> numerosDisponibles;
	private List<Cliente> clientes;
	
	public Sistema() {
		numerosDisponibles = new ArrayList<>();
		clientes = new ArrayList<>();
	}
	
	public void agregarNumeroDisponible(int numero) {
		numerosDisponibles.add(numero);
	}
	
	public void bajaNumeroDisponible(int numero) {
		numerosDisponibles.remove(numero);
	}
	
	public Cliente altaClienteFisico(String nombre, String direccion, int dni) {
		int numero = numerosDisponibles.get((numerosDisponibles.size() - 1));
		PersonaFisica pF = new PersonaFisica(nombre, direccion, numero, dni);
		clientes.add(pF);
		numerosDisponibles.remove((numerosDisponibles.size() - 1));
		return pF;
	}
	
	public Cliente altaClienteJuridico(String nombre, String direccion, int cuit, String tipo) {
		int numero = numerosDisponibles.get((numerosDisponibles.size() - 1));
		PersonaJuridica pJ = new PersonaJuridica(nombre, direccion, numero, cuit, tipo);
		clientes.add(pJ);
		numerosDisponibles.remove((numerosDisponibles.size() - 1));
		return pJ;
	}
	
	public Cliente quienLlama(int num) {
		return this.clientes.stream().filter(c -> c.getNumero() == num)
				   .findFirst()
				   .orElse(null);
	}
	
	public LlamadaLocal llamadaLocal(LocalDate fecha, double hora, double duracion, int x, int y) {
		LlamadaLocal LL = new LlamadaLocal(fecha, hora, duracion, x, y);
		Cliente persona = quienLlama(x);
		persona.agregarLlamada(LL);
		return LL;
	}
	
	public LlamadaInterurbana llamadaInterurbana(LocalDate fecha, double hora, double duracion, int x, int y, double dist) {
		LlamadaInterurbana LI = new LlamadaInterurbana(fecha, hora, duracion, x, y, dist);
		Cliente persona = quienLlama(x);
		persona.agregarLlamada(LI);
		return LI;
	}
	
	public LlamadaInternacional llamadaInternacional(LocalDate fecha, double hora, double duracion, int x, int y, String ori, String des) {
		LlamadaInternacional LInt = new LlamadaInternacional(fecha, hora, duracion, x, y, ori, des);
		Cliente persona = quienLlama(x);
		persona.agregarLlamada(LInt);
		return LInt;
	}
	
	public Factura facturar(Cliente cliente, LocalDate desde, LocalDate hasta) {
		double monto = cliente.montoConDescuento(desde, hasta);
		Factura factura = new Factura(cliente, LocalDate.now(), desde, hasta, monto);
		return factura;
	}
	
}






