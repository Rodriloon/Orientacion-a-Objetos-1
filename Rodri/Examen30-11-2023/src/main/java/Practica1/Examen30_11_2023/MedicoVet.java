package Practica1.Examen30_11_2023;
import java.time.LocalDate;

public class MedicoVet {
	
	private String nombre;
	private LocalDate fechaIngreso;
	private double honorarios;
	
	public MedicoVet(String nombre, LocalDate fechaIngreso, double honorarios) {
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.honorarios = honorarios;
	}
	
	public LocalDate getFechaIngreso() {
		return this.fechaIngreso;
	}
	
	public double getHonorarios() {
		return this.honorarios;
	}
	
}
