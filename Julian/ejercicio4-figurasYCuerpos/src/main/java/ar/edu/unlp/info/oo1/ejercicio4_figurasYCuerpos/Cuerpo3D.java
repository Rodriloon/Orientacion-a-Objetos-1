package ar.edu.unlp.info.oo1.ejercicio4_figurasYCuerpos;

public class Cuerpo3D {
	private double altura;
	private Figura caraBasal;
	
	public Cuerpo3D() {
		
	}
	
	public double getAltura() {
		return this.altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public void setCaraBasal(Figura caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getSuperficieExterior() {
		return 2 * caraBasal.getArea() + (caraBasal.getPerimetro() * this.altura);
	}
	
	public double getVolumen() {
		return caraBasal.getArea() * this.altura;
	}
	
	
}
