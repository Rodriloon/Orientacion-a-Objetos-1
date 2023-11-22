package oo1.ejercicio15_AlquilerDePropiedades;

import java.time.LocalDate;

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

	public double getMontoIngresos(double precioPorNoche) {
		return this.diasReserva() * precioPorNoche;
	}

	public boolean comparoPeriodo(DataLapse periodo) {
		return this.periodo.overlaps(periodo);
	}

	
	public boolean esPosterior(LocalDate fechaActual) {
		if (this.periodo.getFrom().isAfter(fechaActual)) return true;
		else return false;
	}
	

	
}
