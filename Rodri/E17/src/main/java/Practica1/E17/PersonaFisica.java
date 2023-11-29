package Practica1.E17;

public class PersonaFisica extends Cliente{
	
	private int dni;

	public PersonaFisica(String nombre, String direccion, int numero, int dni) {
		super(nombre, direccion, numero);
		this.dni = dni;
	}
	
	public double descuento(double monto) {
		return monto - (monto * 0.1);
	}
	
}
