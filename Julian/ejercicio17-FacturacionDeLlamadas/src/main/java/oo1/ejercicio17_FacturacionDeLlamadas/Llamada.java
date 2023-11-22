package oo1.ejercicio17_FacturacionDeLlamadas;

import java.sql.Time;
import java.time.LocalDate;

import java.sql.Time;
import java.time.LocalDate;

public abstract class Llamada {
	private LocalDate fecha;
	private double hora;
	private double duracion;
	private Integer numeroLlama;
	private int numeroRecibe;
	
	public Llamada(LocalDate fecha, double hora, double duracion, int numeroLlama, int numeroRecibe) {
		this.fecha = fecha;
		this.hora = hora;
		this.duracion = duracion;
		this.numeroLlama = numeroLlama;
		this.numeroRecibe = numeroRecibe;
	}
	
	public abstract double costoPorLlamada();


	public double getDuracion() {
		return duracion;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public double getHora() {
		return hora;
	}

	public int getNumeroLlama() {
		return numeroLlama.intValue();
	}

	public int getNumeroRecibe() {
		return numeroRecibe;
	}

	
	public boolean comparoFecha(LocalDate desde, LocalDate hasta) {
		return this.fecha.isEqual(desde) || this.fecha.isAfter(desde) && this.fecha.isBefore(hasta) || this.fecha.isEqual(hasta);
	}
	
	
	
	
	
}
