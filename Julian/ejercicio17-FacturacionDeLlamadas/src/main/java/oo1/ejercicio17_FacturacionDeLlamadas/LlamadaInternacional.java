package oo1.ejercicio17_FacturacionDeLlamadas;

import java.sql.Time;
import java.time.LocalDate;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LlamadaInternacional extends Llamada{
	private String paisOrigen;
	private String paisDestino;
	private LocalTime hour2;
	
	public LlamadaInternacional(LocalDate fecha, double hora, double duracion, int numeroLlama, int numeroRecibe,
			String paisOrigen, String paisDestino) {
		super(fecha, hora, duracion, numeroLlama, numeroRecibe);
		this.paisOrigen = paisOrigen;
		this.paisDestino = paisDestino;
	}

	@Override
	public double costoPorLlamada() {
		double valor = -1;
		if ((super.getHora() >= 800) && (super.getHora() <= 2000)) valor = 4;
		else if (((super.getHora() >= 2000) && (super.getHora() <= 2000))) valor = 3;
		return valor * this.getDuracion();
	}
	
	

}