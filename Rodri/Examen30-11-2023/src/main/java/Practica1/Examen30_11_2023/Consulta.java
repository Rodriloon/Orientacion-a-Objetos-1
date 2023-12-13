package Practica1.Examen30_11_2023;
import java.time.LocalDate;

public class Consulta implements Servicio{
	
	private LocalDate dia;
	private double honorariosMed;
	private int antiguedad;
	private double materialesDesc;
	private boolean esDomingo;
	
	public Consulta(double honorariosMed, int antigueadad, double materialesDesc, boolean esDomingo) {
		this.dia = LocalDate.now();
		this.honorariosMed = honorariosMed;
		this.antiguedad = antigueadad;
		this.materialesDesc = materialesDesc;
		this.esDomingo = esDomingo;
	}
	
	public LocalDate getDia() {
		return this.dia;
	}
	
	public double Costo() {
		if (this.esDomingo = true)
			return (this.honorariosMed + (this.antiguedad * 100) + this.materialesDesc + 200);
		return (this.honorariosMed + (this.antiguedad * 100) + this.materialesDesc);
	}
	
}
