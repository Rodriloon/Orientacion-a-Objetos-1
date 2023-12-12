package Practica1.E18;
import java.time.LocalDate;

public class Recibo {
	
	private String nombre;
	private String apellido;
	private int cuil;
	private int antiguedad;
	private LocalDate fecha;
	private double monto;
	
	public Recibo(String nombre, String apellido, int cuil, int antiguedad, LocalDate fecha, double monto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.antiguedad = antiguedad;
		this.fecha = fecha;
		this.monto = (monto + this.plusAntiguedad());
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
		return this.monto * this.porcentaje();
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public int getCUIL() {
		return this.cuil;
	}

	public int getAntiguedad() {
		return this.antiguedad;
	}

	public LocalDate getFechaRecibo() {
		return this.fecha;
	}

	public double getMontoTotal() {
		return this.monto;
	}
	
}
