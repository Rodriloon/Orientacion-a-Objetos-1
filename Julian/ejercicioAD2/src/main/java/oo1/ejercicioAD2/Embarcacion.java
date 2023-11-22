package oo1.ejercicioAD2;

import java.time.LocalDate;

public class Embarcacion extends Vehiculo {
	private String nombre;

	public Embarcacion(int patente, LocalDate fabricacion, double valor, String nombre) {
		super(patente, fabricacion, valor);
		this.nombre = nombre;
	}
	
	protected double porcentaje() {
		if (this.getValor() < 1000000) return this.getValor() / 100 * 10;
		else return this.getValor() / 100 * 15;
	}
	
	

}
