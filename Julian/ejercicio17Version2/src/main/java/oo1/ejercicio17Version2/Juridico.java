package oo1.ejercicio17Version2;

public class Juridico extends Cliente{
	private int cuil;
	private String tipo;
	
	public Juridico(String nombre, String direccion, Integer numero, int cuil, String tipo) {
		super(nombre, direccion, numero);
		this.cuil = cuil;
		this.tipo = tipo;
	}
	
	

}
