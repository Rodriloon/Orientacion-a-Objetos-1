package Objetos.Ejercicio12;

public class Esfera extends Pieza{
	
	private int radio;

	public Esfera(int radio, String c, String m) {
		super(c, m);
		this.radio = radio;
	}
	
	public int getRadio() {
		return radio;
	}

	public double getSuperficie() {
		return (4 * Math.PI * Math.pow(getRadio(), 2));
	}
	public double getVolumen() {
		return (1.33) * Math.PI * Math.pow(getRadio(), 3);
	}
	
}
