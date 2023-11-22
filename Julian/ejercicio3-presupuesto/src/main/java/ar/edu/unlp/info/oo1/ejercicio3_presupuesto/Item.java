package ar.edu.unlp.info.oo1.ejercicio3_presupuesto;

public class Item {
	private String detalle;
	private int cantidad = 0;
	private double costoUnitario = 0;
	
	public Item(String detalle, int cantidad, double costoUnitario) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}
	
	public double costo() {
		return costoUnitario * cantidad;
	}

	public String getDetalle() {
		return detalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}
}
