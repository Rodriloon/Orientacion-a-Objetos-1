package Practica1.E12;

public class esfera extends pieza{
	
	private int radio;
	
	public esfera(String mat, String col, int r) {
		super(mat, col);
		this.radio = r;
	}
	
	public double getVolumen() {
		return 4/3 * Math.PI * Math.pow(this.radio, 3);
	}
	
	public double getSuperficie() {
		return 4 * Math.PI * Math.pow(this.radio, 2);
	}

}
