package OO1.E05;

public class Cuerpo3D {
	
	private double altura;
	private Figura caraBasal;
	
	public Cuerpo3D() {
		
	}
	
	public void setAltura(double valor) {
		altura = valor;
	}
	public double getAltura () {
		return this.altura;
	}
	
	public void setCaraBasal(Figura cara) {
		caraBasal = cara;
	}
	
	public double getVolumen() {
		return caraBasal.getArea() * getAltura();
	}
	
	public double getSuperficieExterior() {
		return (2 * caraBasal.getArea()) + (caraBasal.getPerimetro() * getAltura());
	}
	
}
