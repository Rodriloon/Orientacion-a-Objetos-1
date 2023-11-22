package ar.edu.unlp.info.oo1.ejercicio2_balanzaelectronica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	private List<Producto> productos;
	private double pesoTotal;
	private double precioTotal;
	private int cantidadDeProductos;
	
	public Ticket(List productos, double pesoTotal, double precioTotal, int cantidadProductos) {
		fecha = LocalDate.now();
		this.productos = productos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
		this.cantidadDeProductos = cantidadProductos;
	}
	
	public double impuesto() {
		Double totalImp = precioTotal * 0.21;
		return totalImp;
	}
	

	public LocalDate getFecha() {
		return fecha;
	}

	public int getCantidadDeProductos() {

		return cantidadDeProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}
	
	
	
}
