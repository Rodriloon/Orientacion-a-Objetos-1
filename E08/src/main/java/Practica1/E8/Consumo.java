package Practica1.E8;
import java.time.LocalDate;

public class Consumo {
	
	private LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public Consumo(LocalDate f, double ca, double cr) {
		fecha = f;
		consumoEnergiaActiva = ca;
		consumoEnergiaReactiva = cr;
	}
	
	double costoEnBaseA (double precioKWh) {
		return this.consumoEnergiaActiva * precioKWh;
	}
	
	double factorDePotencia () {
		return (this.consumoEnergiaActiva) / Math.sqrt((this.consumoEnergiaActiva * this.consumoEnergiaActiva) + (this.consumoEnergiaReactiva * this.consumoEnergiaReactiva));
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
