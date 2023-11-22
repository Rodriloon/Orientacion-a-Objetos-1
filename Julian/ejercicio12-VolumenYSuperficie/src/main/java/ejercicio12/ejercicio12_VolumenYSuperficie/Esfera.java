package ejercicio12.ejercicio12_VolumenYSuperficie;

public class Esfera extends Pieza{
	private int radio;

	public Esfera(String material, String color, int radio) {
		super(material, color);
		this.radio = radio;
	}

	@Override
	public double getVolumen() {
		return (4/3 * Math.PI * (radio * radio * radio));
	}

	@Override
	public double getSuperficie() {
		return 4 * Math.PI * (radio * radio);
	}
	
	
	
}
