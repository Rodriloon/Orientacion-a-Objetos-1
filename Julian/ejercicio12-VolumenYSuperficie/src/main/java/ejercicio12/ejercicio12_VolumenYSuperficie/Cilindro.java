package ejercicio12.ejercicio12_VolumenYSuperficie;

public class Cilindro extends Pieza{
	private int radio;
	private int altura;
	
	public Cilindro(String material, String color, int altura, int radio) {
		super(material, color);
		this.altura = altura;
		this.radio = radio;
	}

	@Override
	public double getVolumen() {
		return this.getArea() * this.altura;
	}

	@Override
	public double getSuperficie() {
		return 2 * Math.PI * this.radio * this.altura + 2 * this.getArea();
	}
	
	private double getArea() {
		return Math.PI * (radio * radio);
	}
	
	
	
}
