package oo1.ejercicioAD2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Vehiculo implements Propiedad{
	private int patente;
	private LocalDate fabricacion;
	private double valor;
	
	public Vehiculo(int patente, LocalDate fabricacion, double valor) {
		this.patente = patente;
		this.fabricacion = fabricacion;
		this.valor = valor;
	}
	
	protected abstract double porcentaje();
	
	public double valor() {
		int diff = (int) ChronoUnit.YEARS.between(this.fabricacion,LocalDate.now());
		System.out.println(diff);
		if (diff > 10) return 0;
		else return this.porcentaje();
	}

	public double getValor() {
		return valor;
	}
	
	

}
