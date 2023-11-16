package Practica1.E3bis;

public class Producto {
	
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public Producto () {
		
	}
	
	void setPeso (double p) {
		this.peso = p;
	}
	
	double getPeso () {
		return this.peso;
	}
	
	void setPrecioPorKilo (double ppk) {
		this.precioPorKilo = ppk;
	}
	
	double getPrecioPorKilo () {
		return this.precioPorKilo;
	}
	
	void setDescripcion (String d) {
		this.descripcion = d;
	}
	
	String getDescripcion () {
		return this.descripcion;
	}
	
	double getPrecio () {
		return (this.peso * this.precioPorKilo);
	}
	
}
