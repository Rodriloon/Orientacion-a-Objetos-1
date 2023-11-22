package oo1.ejercicioAD2;

public class Inmueble implements Propiedad{
	private int numero;
	private double valorLote;
	private double valorEdificacion;
	
	public Inmueble(int numero, double valorLote, double valorEdificacion) {
		this.numero = numero;
		this.valorLote = valorLote;
		this.valorEdificacion = valorEdificacion;
	}
	
	public double valor() {
		return (this.valorLote + this.valorEdificacion) / 100 * 1;
	}
	
	

}
