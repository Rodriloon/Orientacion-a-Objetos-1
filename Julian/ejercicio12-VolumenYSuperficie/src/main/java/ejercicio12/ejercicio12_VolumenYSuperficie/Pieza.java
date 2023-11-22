package ejercicio12.ejercicio12_VolumenYSuperficie;

public abstract class Pieza {
	private String material;
	private String color;
	
	public Pieza(String material, String color) {
		this.material = material;
		this.color = color;
	}
	
	public abstract double getVolumen();
	public abstract double getSuperficie();

	public String getMaterial() {
		return material;
	}

	public String getColor() {
		return color;
	}
	
	
	

}
