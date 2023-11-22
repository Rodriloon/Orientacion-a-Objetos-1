package oo1.ejercicio18_LiquidacionHaberes;

import java.time.LocalDate;

public class Recibo {
	private String nombre;
	private String apellido;
	private int CUIL;
	private int antiguedad;
	private LocalDate fechaRecibo;
	private double montoTotal;
	
	public Recibo(String nombre, String apellido, int CUIL, int antiguedad,LocalDate fechaRecibo, double montoEn) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.CUIL = CUIL;
		this.antiguedad = antiguedad;
		this.fechaRecibo = fechaRecibo;
		this.montoTotal = (montoEn + this.plusAntiguedad());
	}
	
	private double porcentaje() {
		if(this.antiguedad > 5) {
			if(this.antiguedad > 10) {
				if(this.antiguedad > 15) {
					if(this.antiguedad > 20) {
						return 1;
					}
					return 0.7;
				}
				return 0.5;
			}
			return 0.3;
		}
		return 0;
	}

	
	private double plusAntiguedad() {
		return this.montoTotal * this.porcentaje();
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getCUIL() {
		return CUIL;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public LocalDate getFechaRecibo() {
		return fechaRecibo;
	}

	public double getMontoTotal() {
		return montoTotal;
	}
	
	
	
	

}
