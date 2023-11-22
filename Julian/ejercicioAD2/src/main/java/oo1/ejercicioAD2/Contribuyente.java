package oo1.ejercicioAD2;

import java.util.ArrayList;
import java.util.List;

public class Contribuyente {
	private String nombre;
	private int dni; 
	private String mail;
	private String localidad;
	private List<Propiedad> propiedades;
	
	public Contribuyente(String nombre, int dni, String mail, String localidad) {
		this.nombre = nombre;
		this.dni = dni;
		this.mail = mail;
		this.localidad = localidad;
		this.propiedades = new ArrayList<Propiedad>();
	}
	
	public void cargarPropiedad(Propiedad p) {
		this.propiedades.add(p);
	}
	
	public double calcularImpuesto() {
		return this.propiedades.stream()
				.mapToDouble(p -> p.valor())
				.sum();
	}
	
	public boolean isLocalidad(String localidad) {
		return this.localidad.equals(localidad);
	}

}
