package oo1.ejercicio17Version2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre;
	private String direccion;
	private Integer numero;
	private List<Llamada> llamadas;
	
	public Cliente(String nombre, String direccion,Integer numero) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.llamadas = new ArrayList<Llamada>();
	}
	
	public void agregarLlamada(Llamada call) {
		this.llamadas.add(call);
	}
	
	public Factura facturar(LocalDate inicio, LocalDate fin) {
		double monto = this.montoLlamadas(inicio,fin);
		Factura fact = new Factura(this,inicio,fin,LocalDate.now(),monto);
		return fact;
	}

	protected double montoLlamadas(LocalDate inicio, LocalDate fin) {
		return this.llamadas.stream()
				.filter(call -> call.enFecha(inicio,fin))
				.mapToDouble(call -> call.calcularCosto())
				.sum();
	}

	public boolean coincidenNumeros(Integer numero) {
		return this.numero.equals(numero);
	}
	
	
	
	

}
