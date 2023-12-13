package Practica1.Examen30_11_2023;
import java.time.LocalDate;

public class Guarderia implements Servicio{
	
	private LocalDate dia;
	private double diario;
	private int cant;
	private boolean seDescuenta;
	
	public Guarderia(double diario, int cant, boolean seDescuenta) {
		this.dia = LocalDate.now();
		this.diario = diario;
		this.cant = cant;
		this.seDescuenta = seDescuenta;
	}
	
	public LocalDate getDia() {
		return this.dia;
	}
	
	public double Costo() {
		double total = this.diario * this.cant;
		if (this.seDescuenta = true)
			return (total * 0.9);
		return total;
	}
	
}
