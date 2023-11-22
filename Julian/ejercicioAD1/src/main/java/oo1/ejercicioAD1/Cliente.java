package oo1.ejercicioAD1;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private String nombre;
	private String direccion;
	private List<Medicion> mediciones;
	
	public Cliente(String nombre, String direccion) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.mediciones = new ArrayList<Medicion>();
	}
	
	public Medicion agregarMedicion(Medicion m) {
		mediciones.add(m);
		return m;
	}
	
	public Medicion buscarMedicion(int mes, int año) {
		return mediciones.stream()
				.filter(m -> m.coincideFecha(mes, año))
				.findFirst().orElse(null);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public abstract double calcularConsumo(double precioC,double precioI, int mes, int año);

}
