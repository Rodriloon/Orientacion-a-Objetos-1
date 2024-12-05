package OO1.E17;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	
	private String direccion;
	private String nombreDesc;
	private double precioXnoche;
	private List<Reserva> res;
	
	public Propiedad(String direccion, String nombreDesc, double precioXnoche) {
		this.direccion = direccion;
		this.nombreDesc = nombreDesc;
		this.precioXnoche = precioXnoche;
		this.res = new ArrayList<>();
	}

	public String getDireccion() {
		return direccion;
	}

	public String getNombreDesc() {
		return nombreDesc;
	}

	public double getPrecioXnoche() {
		return precioXnoche;
	}
	
	
	
}
