package Objetos.Ejercicio12;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReporteDeConstruccion {
	
	private ArrayList<Pieza> listaPieza;
	
	public ReporteDeConstruccion() {
		this.listaPieza = new ArrayList<Pieza>();
	}
	
	public double getVolumenDeMaterial(String nombreDeMaterial) {
		List<Pieza> nueva = listaPieza.stream().
							filter(lista -> lista.getMaterial().equals(nombreDeMaterial)).
							collect(Collectors.toList());
		return nueva.stream().
				mapToDouble(lis -> lis.getVolumen()).sum();
	}
	
	public double getSuperficieDeColor(String unNombreDeColor) {
		List<Pieza> nueva = listaPieza.stream().
							filter(lista -> lista.getColor().equals(unNombreDeColor)).
							collect(Collectors.toList());
		return nueva.stream().
				mapToDouble(lis -> lis.getSuperficie()).sum();
	}
	
}
