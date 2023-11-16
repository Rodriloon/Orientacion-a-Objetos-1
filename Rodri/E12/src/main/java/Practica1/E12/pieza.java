package Practica1.E12;

public abstract class pieza {
	
	private String material;
	private String color;
	
	public pieza(String m, String c) {
		this.material = m;
		this.color = c;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public abstract double getVolumen();
	
	public abstract double getSuperficie();
	
}
