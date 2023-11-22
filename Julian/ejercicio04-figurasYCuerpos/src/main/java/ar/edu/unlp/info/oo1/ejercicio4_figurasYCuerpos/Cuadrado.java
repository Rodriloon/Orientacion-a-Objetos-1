package ar.edu.unlp.info.oo1.ejercicio4_figurasYCuerpos;

public class Cuadrado implements Figura {
	private double lado;
	
	public Cuadrado() {
		
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return this.lado;
	}

	@Override
	public double getPerimetro() {
		return this.lado * 4;
	}

	@Override
	public double getArea() {
		return this.lado * this.lado;
	}
	
}
