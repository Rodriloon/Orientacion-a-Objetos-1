package OO1.E2;

public class Balanza {
	
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza () {
		cantidadDeProductos = 0;
		precioTotal = 0;
		pesoTotal = 0;
	}
	
	public void ponerEnCero() {
		cantidadDeProductos = 0;
		precioTotal = 0;
		pesoTotal = 0;
	}
	
	public void agregarProducto(Producto producto) {
		cantidadDeProductos++;
		precioTotal += (producto.getPrecioPorKilo() * producto.getPeso());
		pesoTotal += producto.getPeso();
	}
	
	public Ticket emitirTicket() {
		Ticket t = new Ticket(getCantidadDeProductos(), getPesoTotal(), getPrecioTotal());
		return t;
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
