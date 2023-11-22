package ar.edu.unlp.info.oo1.ejercicio2_balanzaelectronica;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private List<Producto> productos;
	private int cantidadProductos;

	
	public Balanza() {
		this.ponerEnCero();
	}

	public void agregarProducto(Producto p) {
		this.productos.add(p);
		this.cantidadProductos++;
	}
	
	public void ponerEnCero() {
		this.productos = new ArrayList<>();
		this.cantidadProductos = 0;
	}

	public int getCantidadDeProductos() {
		return this.cantidadProductos;
	}
	
	public List getProductos() {
		return productos;
	}

	public double getPrecioTotal() {
		double precioT = 0;
		for (Producto p:productos) {
			precioT = precioT + p.getPrecio();
		}
		return precioT;
	}


	public double getPesoTotal() {
		double pesoT = 0;
		for (Producto p:productos) {
			pesoT = pesoT + p.getPeso();
		}
		return pesoT;
	}
	
	
	public Ticket emitirTicket() {
		Ticket t = new Ticket(this.getProductos(),this.getPesoTotal(),this.getPrecioTotal(),this.getCantidadDeProductos());
		this.ponerEnCero();
		return t;
	}
	
	
	
	
	
	
	
	

}
