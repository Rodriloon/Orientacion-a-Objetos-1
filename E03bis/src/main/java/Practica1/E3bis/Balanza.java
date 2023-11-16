package Practica1.E3bis;
import java.util.ArrayList;
import java.util.List;

public class Balanza {
	
	private int cantidadDeProductos;
	private List <Producto> lista;
	
	public Balanza () {
		lista = new ArrayList <Producto> ();
		
	}
	
	int getCantidadDeProductos () {
		return this.cantidadDeProductos;
	}
	
	double getPrecioTotal () {
		return this.lista.stream().mapToDouble(Producto::getPrecio).sum();
	}
	
	double getPesoTotal () {
		return this.lista.stream().mapToDouble(Producto::getPeso).sum();
	}
	
	void ponerEnCero () {
		lista.clear();
		this.cantidadDeProductos = 0;
	}
	
	void agregarProducto (Producto producto) {
		lista.add(producto);
		this.cantidadDeProductos++;
	}
	
	Ticket emitirTicket () {
		Ticket t = new Ticket(this.cantidadDeProductos, this.getPesoTotal(), this.getPrecioTotal());
		t.impuesto();
		return t;
	}
	
}
