package oo1.ejercicio17_FacturacionDeLlamadas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private String nombre;
	private String direccion;
	private Integer numero;
	private char id;
	private List<Llamada> llamadas;
	
	public Cliente(String nombre, String direccion,char id,Integer numero) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.id = id;
		this.numero = numero;
		llamadas = new ArrayList<Llamada>();
	}
	
	public void agregarLlamada(Llamada call) {
		llamadas.add(call);
	}

	public boolean comparo(Integer num) {
		return num == this.numero;
	}


	
	private double montoTotal(LocalDate desde, LocalDate hasta) {
		return llamadas.stream()
				.filter(l -> l.comparoFecha(desde, hasta))
				.mapToDouble(l -> l.costoPorLlamada())
				.sum();
	}
	
	public abstract double descuento (double monto);

	
	public double montoConDescuento(LocalDate desde, LocalDate hasta) {
		double monto = this.montoTotal(desde, hasta);
		return monto - this.descuento(monto);
	}

	public List<Llamada> getLlamadas() {
		return llamadas;
	}

	public Integer getNumero() {
		return numero;
	}
	
	

}
