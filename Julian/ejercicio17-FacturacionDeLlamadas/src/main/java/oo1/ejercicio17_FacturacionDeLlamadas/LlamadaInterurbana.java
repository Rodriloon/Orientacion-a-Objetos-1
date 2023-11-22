package oo1.ejercicio17_FacturacionDeLlamadas;

import java.sql.Time;
import java.time.LocalDate;

public class LlamadaInterurbana extends Llamada {
	private double distancia;

	public LlamadaInterurbana(LocalDate fecha, double hora, double duracion, int numeroLlama, int numeroRecibe,double distancia) {
		super(fecha, hora, duracion, numeroLlama, numeroRecibe);
		this.distancia = distancia;
	}


	public double costoPorLlamada() {
		double costo = 5;
		if (distancia < 100) {
			costo = costo + this.montoDuracion(2);
		}
		else 
			if ((distancia > 100) && (distancia < 500)) {
				costo = costo + this.montoDuracion(2.5);
			}
			else 
				if (distancia > 500) {
					costo = costo + this.montoDuracion(3);
				}
		return costo;
	}
	
	private double montoDuracion(double valor) {
		return super.getDuracion() * valor;
	}
}