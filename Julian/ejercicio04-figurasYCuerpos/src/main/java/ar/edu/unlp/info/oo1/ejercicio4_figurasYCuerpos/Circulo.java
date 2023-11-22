package ar.edu.unlp.info.oo1.ejercicio4_figurasYCuerpos;

public class Circulo implements Figura{
	private double radio;

	public Circulo() {
		
	}

	public double getRadio() {
		return this.radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getDiametro() {
		return this.radio * 2;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return Math.PI * this.getDiametro();
	}

	@Override
	public double getArea() {
		return Math.PI * (this.radio * this.radio);
	} 
	
	
	
}
