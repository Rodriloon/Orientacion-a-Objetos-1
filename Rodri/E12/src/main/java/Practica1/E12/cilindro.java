package Practica1.E12;

public class cilindro extends pieza{
	
	private int radio;
	private int altura;
	
	public cilindro(String mat, String col, int r, int a) {
		super(mat, col);
		this.radio = r;
		this.altura = a;
	}
	
	public double getVolumen() {
		return Math.PI * Math.pow(this.radio, 2) * this.altura;
	}
	
	public double getSuperficie() {
		return 2 * Math.PI * this.radio * this.altura + 2 * Math.PI * Math.pow(this.radio, 2);
	}
	
}
