package Objetos.Ejercicio12;

public class Cilindro extends Pieza{
	
	private int radio;
	private int altura;
	
	public Cilindro(int radio, int altura, String c, String m) {
		super(c, m);
		this.radio = radio;
		this.altura = altura;
	}
	
	public int getRadio() {
		return radio;
	}

	public int getAltura() {
		return altura;
	}

	public double getSuperficie() {
		return (2 * Math.PI * this.radio  * this.altura + 2 * Math.PI * (this.radio * this.radio));
	}
	
	public double getVolumen() {
		return (Math.PI * (this.radio * this.radio) * this.altura);
	}
	
}
