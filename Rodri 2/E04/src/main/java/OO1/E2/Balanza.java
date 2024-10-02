package OO1.E2;
import java.util.List;
import java.util.stream.Collectors;

public class Balanza {
	
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private List<Producto> lista;
	
	public Balanza () {
		cantidadDeProductos = 0;
		precioTotal = 0;
		pesoTotal = 0;
	}
	
	public void ponerEnCero() {
		lista.removeAll(lista);
		cantidadDeProductos = 0;
		precioTotal = 0;
		pesoTotal = 0;
	}
	
	public void agregarProducto(Producto producto) {
		cantidadDeProductos++;
		precioTotal += (producto.getPrecioPorKilo() * producto.getPeso());
		pesoTotal += producto.getPeso();
		lista.add(producto);
	}
	
	public Ticket emitirTicket() {
		Ticket t = new Ticket(getCantidadDeProductos(), getPesoTotal(), getPrecioTotal());
		return t;
	}
	
	public List<Producto> getProductos(){
		return lista.stream() 
				.map(lista -> lista)       
				.collect(Collectors.toList());
	}
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
}
