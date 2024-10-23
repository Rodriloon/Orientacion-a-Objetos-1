package Objetos.Ejercicio12;

public abstract class Pieza {
	
	private String material;
	private String color;
	
	public Pieza(String c, String m) {
		this.material = m;
		this.color = c;
	}
	
	public String getMaterial() {
		return material;
	}

	public String getColor() {
		return color;
	}

	public abstract double getSuperficie();
	
	public abstract double getVolumen();
}
