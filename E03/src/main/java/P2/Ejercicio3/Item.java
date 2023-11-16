package P2.Ejercicio3;

public class Item {
	
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item (String d, int ca, double co) {
		this.detalle = d;
		this.cantidad = ca;
		this.costoUnitario = co;
	}
	
	String geDetalle () {
		return this.detalle;
	}
	
	void setCostoUnitario (double c) {
		this.costoUnitario = c;
	}
	
	double getCostoUnitario () {
		return this.costoUnitario;
	}
	
	double costo () {
		return (this.cantidad * this.costoUnitario);
	}
	
}
