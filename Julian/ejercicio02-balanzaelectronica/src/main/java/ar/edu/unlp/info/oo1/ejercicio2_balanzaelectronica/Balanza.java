package ar.edu.unlp.info.oo1.ejercicio2_balanzaelectronica;

import java.time.LocalDate;

public class Balanza {
	private int CantidadDeProductos;
	private double PrecioTotal;
	private double PesoTotal;
	
	
	public Balanza() {
		super();
		CantidadDeProductos = 0;
		PrecioTotal = 0;
		PesoTotal = 0;
	}

	public void agregarProducto(Producto p) {
		this.CantidadDeProductos++;
		PesoTotal = PesoTotal + p.getPeso();
		PrecioTotal = PrecioTotal + p.getPrecio();
	}
	
	public void ponerEnCero() {
		CantidadDeProductos = 0;
		PrecioTotal = 0;
		PesoTotal = 0;
	}

	public int getCantidadDeProductos() {
		return CantidadDeProductos;
	}


	public double getPrecioTotal() {
		return PrecioTotal;
	}


	public double getPesoTotal() {
		return PesoTotal;
	}
	
	
	public Ticket emitirTicket() {
		
		Ticket t = new Ticket(LocalDate.now(),CantidadDeProductos,PesoTotal,PrecioTotal);
		this.ponerEnCero();
		return t;
	}
	
	
	
	
	
	
	
	

}
