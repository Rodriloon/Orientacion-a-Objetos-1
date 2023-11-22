package oo1.ejercicioAD2;

import java.time.LocalDate;

public class Automotor extends Vehiculo {
	private String marca;
	private String modelo;
	
	public Automotor(int patente,LocalDate fabricacion,String marca,String modelo,double valor) {
		super(patente, fabricacion, valor);
		this.marca = marca;
		this.modelo = modelo;
	}
	
	protected double porcentaje() {
		return this.getValor()/100*5;
	}
}
