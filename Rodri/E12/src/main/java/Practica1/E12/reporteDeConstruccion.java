package Practica1.E12;
import java.util.ArrayList;
import java.util.List;

public class reporteDeConstruccion {
	
	private List <pieza> piezas;
	
	public reporteDeConstruccion() {
		this.piezas = new ArrayList <>();
	}
	
	public void agregarPieza(pieza p) {
		piezas.add(p);
	}
	
	public void quitarPieza(pieza p) {
		piezas.remove(p);
	}
	
	public double volumenDeMaterial(String material) {
		return piezas.stream()
						.filter(p -> p.getMaterial().equals(material))
						.mapToDouble(p -> p.getVolumen())
						.sum();
	}
	
	public double superficieDeColor(String color) {
		return piezas.stream()
					.filter(p -> p.getColor().equals(color))
					.mapToDouble(p -> p.getSuperficie())
					.sum();
	}
	
}
