package ar.edu.unlp.info.oo1.ejercicio2_balanzaelectronica;

public class Producto {
	private double Peso;
	private double PrecioPorKilo;
	private String Descripcion;
	
	public Producto() {
		super();
	}


	public void setPeso(double peso) {
		Peso = peso;
	}


	public void setPrecioPorKilo(double precioPorKilo) {
		PrecioPorKilo = precioPorKilo;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}


	public double getPeso() {
		return Peso;
	}


	public double getPrecioPorKilo() {
		return PrecioPorKilo;
	}


	public String getDescripcion() {
		return Descripcion;
	}
	
	public double getPrecio() {
		return PrecioPorKilo * Peso;
	}

}
