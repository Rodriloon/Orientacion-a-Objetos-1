package oo1.ejercicio17Version2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Internacional extends Llamada {
	private String origen;
	private String destino;
	
	public Internacional(LocalDate fecha, LocalTime hora, int duracion, Integer emisor, Integer receptor, String origen,
			String destino) {
		super(fecha, hora, duracion, emisor, receptor);
		this.origen = origen;
		this.destino = destino;
	}

	@Override
	public double calcularCosto() { 
		if (this.getHora() >= 8 && this.getHora() <= 20) return this.getDuracion() * 4;
		else return this.getDuracion() * 3;
		//(this.getHora() < 8 && this.getHora() > 20) 
	}
		
				
				
				
				
				
	
	

}
