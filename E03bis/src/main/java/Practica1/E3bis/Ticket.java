package Practica1.E3bis;
import java.time.LocalDate;

public class Ticket {
	
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket (int c, double p, double pre) {
		fecha = LocalDate.now();
		this.cantidadDeProductos = c;
		this.pesoTotal = p;
		this.precioTotal = pre;
	}
	
	int getCantidadDeProductos () {
		return this.cantidadDeProductos;
	}
	
	double getPesoTotal () {
		return this.pesoTotal;
	}
	
	double getPrecioTotal () {
		return this.precioTotal;
	}
	
	LocalDate getFecha () {
		return this.fecha;
	}
	
	double impuesto () {
		return (this.precioTotal * 0.21);
	}
	
}
