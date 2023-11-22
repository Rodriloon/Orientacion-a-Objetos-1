package oo1.ejercicio19_MercadoDeObjetos;

public class Producto {
	private String nombre;
	private String descripcion;
	private double precio;
	private int stock;
	private Persona vendedor;
	
	public Producto(String nombre, String descripcion, double precio, int stock, Persona vendedor) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.vendedor = vendedor;
	}
	
	public boolean verificarStock(int cantidad) {
		if (stock - cantidad >= 0) {
			stock -= cantidad;
			return true;
		}
		else return false;
	}
	
	public boolean coincide(String nombre) {
		return this.nombre.equals(nombre);
	}

	public double getPrecio() {
		return precio;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	

}
