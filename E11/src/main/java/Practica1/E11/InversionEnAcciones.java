package Practica1.E11;

public class InversionEnAcciones implements Inversion{
	
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	public InversionEnAcciones(String nom, int cant, double val) {
		this.nombre = nom;
		this.cantidad = cant;
		this.valorUnitario = val;
	}
	
	String getNombre() {
		return this.nombre;
	}
	
	void setCantidad(int c) {
		this.cantidad = c;
	}
	
	int getCantidad() {
		return this.cantidad;
	}
	
	void setValorUnitario(double vu) {
		this.valorUnitario = vu;
	}
	
	double getValorUnitario() {
		return this.valorUnitario;
	}
	
	public double valorActual() {
		return (this.cantidad * this.valorUnitario);
	}
	
}
