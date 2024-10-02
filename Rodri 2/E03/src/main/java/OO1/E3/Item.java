package OO1.E3;

public class Item {
	
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item(String d, int c, double co) {
		detalle = d;
		cantidad = c;
		costoUnitario = co;
	}
	
	public double costo() {
		return cantidad * costoUnitario;
	}
	
	public double getCostoUnitario() {
		return costoUnitario;
	}
	
}
