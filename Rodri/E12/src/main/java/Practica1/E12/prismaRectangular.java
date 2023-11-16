package Practica1.E12;

public class prismaRectangular extends pieza{
	
	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	
	public prismaRectangular(String mat, String col, int lMa, int lMe, int a) {
		super(mat, col);
		this.ladoMayor = lMa;
		this.ladoMenor = lMe;
		this.altura = a;
	}
	
	public double getVolumen() {
		return this.ladoMayor * this.ladoMenor * this.altura;
	}
	
	public double getSuperficie() {
		return 2 * (this.ladoMayor * this.ladoMenor + this.ladoMayor * this.altura + this.ladoMenor * this.altura);
	}
	
}
