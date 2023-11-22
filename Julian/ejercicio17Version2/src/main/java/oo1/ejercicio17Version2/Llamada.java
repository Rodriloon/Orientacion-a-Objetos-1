package oo1.ejercicio17Version2;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Llamada {
	private LocalDate fecha;
	private LocalTime hora;
	private int duracion;
	private Integer emisor;
	private Integer receptor;
	
	
	public Llamada(LocalDate fecha, LocalTime hora, int duracion, Integer emisor, Integer receptor) {
		this.fecha = fecha;
		this.hora = hora;
		this.duracion = duracion;
		this.emisor = emisor;
		this.receptor = receptor;
	}
	
	public abstract double calcularCosto();
	
	
	public boolean enFecha(LocalDate inicio,LocalDate fin) {
		return	fecha.isAfter(inicio) && fecha.isBefore(fin) || 
				fecha.isEqual(inicio) && fecha.isBefore(fin) || 
				fecha.isAfter(inicio) && fecha.isEqual(fin)	 || 
				fecha.isEqual(inicio) && fecha.isEqual(fin);
	}

	public int getDuracion() {
		return duracion;
	}

	public int getHora() {
		return hora.getHour();
	}

	
	
	
	
	
	
	
}
