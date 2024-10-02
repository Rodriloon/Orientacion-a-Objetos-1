package OO1.E05;

public class Cuadrado implements Figura{
	
	private double lado;
	
	public Cuadrado() {
		
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getPerimetro() {
		return 4 * lado;
	}

	public double getArea() {
		return lado * lado;
	}
	
}
