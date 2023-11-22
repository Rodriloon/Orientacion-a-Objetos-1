package oo1.ejercicio19_MercadoDeObjetos;

public class Persona {
	private String nombre;
	private String direccion;
	
	public Persona(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public boolean coincide(String nombre) {
		return this.nombre.equals(nombre);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
}
