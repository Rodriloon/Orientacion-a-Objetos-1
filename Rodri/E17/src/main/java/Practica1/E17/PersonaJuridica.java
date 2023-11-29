package Practica1.E17;

public class PersonaJuridica extends Cliente{
	
	private int cuit;
	private String tipo;
	
	public PersonaJuridica(String nombre, String direccion, int numero, int cuit, String tipo) {
		super(nombre, direccion, numero);
		this.cuit = cuit;
		this.tipo = tipo;
	}
	
	public double descuento(double monto) {
		return monto;
	}
	
}
