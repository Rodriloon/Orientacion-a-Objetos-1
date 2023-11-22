package oo1.ejercicio8_distribuidoraElectrica;

import java.time.LocalDate;


public class Consumo {
	private LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public Consumo(LocalDate fecha, double consumoEnergiaActiva, double consumoEnergiaReactiva) {
		this.fecha = fecha;
		this.consumoEnergiaActiva = consumoEnergiaActiva;
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}

	public double factorDePotencia() {
		return this.consumoEnergiaActiva / 
				Math.sqrt((consumoEnergiaActiva * consumoEnergiaActiva) + 
				(consumoEnergiaReactiva * consumoEnergiaReactiva ));
	}
	
	public double costoEnBaseA(double precioKW) {
		return this.consumoEnergiaActiva * precioKW;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public double getConsumoEnergiaActiva() {
		return consumoEnergiaActiva;
	}

	public double getConsumoEnergiaReactiva() {
		return consumoEnergiaReactiva;
	}
	
	
}
