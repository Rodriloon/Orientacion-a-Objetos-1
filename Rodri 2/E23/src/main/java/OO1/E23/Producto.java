package OO1.E23;

public class Producto {
	
	private String nombre;
	private String categoria;
	private double precio;
	private int cantDisponibles;
	private Persona vendedor;
	
	
	public Producto(String nombre, String categoria, double precio, int cantDisponibles, Persona vendedor) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.cantDisponibles = cantDisponibles;
		this.vendedor = vendedor;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public String getCategoriaProducto() {
		return this.categoria;
	}
	
	public boolean HayStock(int cant) {
		return this.cantDisponibles >= cant;
	}
	
	public void ActualizaStock(int nuevo) {
		this.cantDisponibles -= nuevo;
	}
	
}
