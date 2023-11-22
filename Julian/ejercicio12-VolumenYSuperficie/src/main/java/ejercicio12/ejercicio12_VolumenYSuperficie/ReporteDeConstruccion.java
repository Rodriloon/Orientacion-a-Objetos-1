package ejercicio12.ejercicio12_VolumenYSuperficie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<>();
	}

	public void agregarPieza(Pieza pieza) {
		piezas.add(pieza);
	}
	
	public void quitarPieza(Pieza pieza) {
		piezas.remove(pieza);
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
