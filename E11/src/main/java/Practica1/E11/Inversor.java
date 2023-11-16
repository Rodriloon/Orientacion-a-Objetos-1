package Practica1.E11;
import java.util.ArrayList;
import java.util.List;

public class Inversor {
	
	private String nombre;
	private List <Inversion> inversiones;
	
	public Inversor(String nom) {
		this.nombre = nom;
		inversiones = new ArrayList <Inversion>();
	}
	
	String getNombre() {
		return this.nombre;
	}
	
	double valorActual() {
		return inversiones.stream().mapToDouble(inv -> inv.valorActual()).sum();
	}
	
}
