package Practica1.E4;

public class Cuadrado implements Figura{
	
	private double lado;
	
	public Cuadrado () {
		
	}
	
	void setLado (double l) {
		this.lado = l;
	}
	
	double getLado () {
		return this.lado;
	}
	
	public double getPerimetro () {
		return (4 * this.lado);
	}
	
	public double getArea () {
		return (this.lado * this.lado);
	}
	
}