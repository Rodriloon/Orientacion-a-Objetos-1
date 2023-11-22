package oo1.ejercicio15_AlquilerDePropiedades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import oo1.ejercicio14_dataLapse.DataLapse;

public class Reserva {
	private DataLapse periodo;
	private Usuario inquilino;
	private Propiedad propiedad;
	
	public Reserva(Propiedad propiedad, DataLapse periodo, Usuario user) {
		this.propiedad = propiedad;
		this.periodo = periodo;
		this.inquilino = user;
	}
	
		
	public DataLapse getPeriodo() {
		return periodo;
	}


	public Usuario getInquilino() {
		return inquilino;
	}
	
	public int diasReserva() {
		return periodo.sizeInDays();
	}

	public double getMontoIngresos() {
		return this.diasReserva() * this.propiedad.getPrecioPorNoche();
	}

	public boolean comparoPeriodo(DataLapse periodo) {
		return this.periodo.overlaps(periodo);
	}

	public void desvincular() {
		this.inquilino.eliminarReserva(this);
		this.propiedad.eliminarReserva(this);
	}
	
	public boolean esPosterior(LocalDate fechaActual) {
		if (this.periodo.startsAfter(fechaActual)) return true;
		else return false;
	}
	
	public int diferenciaDias (LocalDate fecha) {
		return (int) ChronoUnit.DAYS.between(fecha, periodo.getFrom());
	}
	
	public boolean esAnterior(LocalDate fecha) {
		if (fecha.isBefore(periodo.getFrom())) return true;
		else return false;
	}

	
}