package oo1.ejercicio17Version2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Interurbana extends Llamada {
	private int distancia;

	public Interurbana(LocalDate fecha, LocalTime hora, int duracion, Integer emisor, Integer receptor, int distancia) {
		super(fecha, hora, duracion, emisor, receptor);
		this.distancia = distancia;
	}

	@Override
	public double calcularCosto() {	
		double total = 5;
		if (this.distancia < 100) {
			total = total + this.getDuracion() * 2;
		}
		else 
			if (this.distancia >= 100 && this.distancia <= 500) {
				total = total + this.getDuracion() * 2.5;
			}
			else
				if (this.distancia > 500) {
					total = total + this.getDuracion() * 3;
				}
		return total;
		
	}
	
	
	

}
