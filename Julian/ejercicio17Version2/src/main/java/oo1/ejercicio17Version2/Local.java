package oo1.ejercicio17Version2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Local extends Llamada{

	public Local(LocalDate fecha, LocalTime hora, int duracion, Integer emisor, Integer receptor) {
		super(fecha, hora, duracion, emisor, receptor);
	}

	@Override
	public double calcularCosto() {
		return this.getDuracion() * 1;
	}
	
	
	
	
	

}
