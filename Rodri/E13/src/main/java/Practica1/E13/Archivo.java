package Practica1.E13;

public class Archivo {
	
	private String nombre;
	
	public Archivo(String n) {
		this.nombre = n;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String n) {
		this.nombre = n;
	}
	
	public int tamaño() {	
		return this.nombre.length();
	}
	
	public int espacioOcupado() {
		return this.nombre.length();
	}
	
}
