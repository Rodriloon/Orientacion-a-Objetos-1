package Practica1.E4;

public class Cuerpo3D {
	
	private double altura;
	private Figura caraBasal;
	
	public Cuerpo3D () {
		
	}
	
	void setAltura (double a) {
		this.altura = a;
	}
	
	double getAltura () {
		return this.altura;
	}
	
	void setCaraBasal (Figura cb) {
		this.caraBasal = cb;
	}
	
	double getVolumen () {
		return (this.caraBasal.getArea() * this.altura);
	}
	
	double getSuperficieExterior () {
		return ((2 * this.caraBasal.getArea()) + (this.caraBasal.getPerimetro() * this.altura));
	}
	
}
