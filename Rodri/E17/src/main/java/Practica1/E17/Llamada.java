package Practica1.E17;
import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Llamada {
	
	private LocalDate fecha;
	private double hora;
	private double duracion;
	private int llama;
	private int recibe;
	
	public Llamada(LocalDate fecha, double hora, double duracion, int llama, int recibe) {
		this.fecha = fecha;
		this.hora = hora;
		this.duracion = duracion;
		this.llama = llama;
		this.recibe = recibe;
	}
	
	public double getDuracion() {
		return this.duracion;
	}
	
	public double getHora() {
		return this.hora;
	}
	
	public abstract double costo();
	
	public boolean comparoFecha(LocalDate desde, LocalDate hasta) {
		return this.fecha.isEqual(desde) || this.fecha.isAfter(desde) && this.fecha.isBefore(hasta) || this.fecha.isEqual(hasta);
	}
	
}
