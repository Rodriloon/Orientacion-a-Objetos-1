package oo1.ejercicio17Version2;

import java.time.LocalDate;

public class Fisico extends Cliente{
	private int dni;

	public Fisico(String nombre, String direccion, Integer numero, int dni) {
		super(nombre, direccion, numero);
		this.dni = dni;
	}
	
	@Override
	public double montoLlamadas(LocalDate inicio,LocalDate fin) {
		return super.montoLlamadas(inicio, fin)-super.montoLlamadas(inicio, fin)/100 * 10;
	}

}
