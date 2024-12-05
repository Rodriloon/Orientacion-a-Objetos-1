package OO1.E23;

public abstract class Persona {
	
	private String nombre;
	private String direccion;
	
	
	public Persona (String n, String d) {
		this.nombre = n;
		this.direccion = d;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
}
