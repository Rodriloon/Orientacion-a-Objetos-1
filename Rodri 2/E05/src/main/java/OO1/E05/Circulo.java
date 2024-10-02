package OO1.E05;

public class Circulo implements Figura{
	
	private double diametro;
	private double radio;
	
	public Circulo () {
		
	}
	
	double getDiametro () {
		return this.diametro;
	}
	
	void setDiametro (double d) {
		this.diametro = d;
	}
	
	double getRadio () {
		return this.radio;
	}
	
	void setRadio (double r) {
		this.radio = r;
		this.diametro = r * 2;
	}
	
	public double getPerimetro () {
		return (Math.PI * this.diametro);
	}
	
	public double getArea () {
		return (Math.PI * (this.radio * this.radio));
	}
	
}
