package Practica1.Examen30_11_2023;
import java.time.LocalDate;

public class Vacunacion implements Servicio{
	
	private LocalDate dia;
	private double honorariosMed;
	private double materialesDesc;
	private boolean esDomingo;
	private String nombreVacuna;
	private double costoVacuna;
	
	public Vacunacion(double honorariosMed, double materialesDesc, boolean esDomingo, String nombreVacuna, double costoVacuna) {
		this.dia = LocalDate.now();
		this.honorariosMed = honorariosMed;
		this.materialesDesc = materialesDesc;
		this.esDomingo = esDomingo;
		this.nombreVacuna = nombreVacuna;
		this.costoVacuna = costoVacuna;
	}
	
	public LocalDate getDia() {
		return this.dia;
	}
	
	public double Costo() {
		if (this.esDomingo = true)
			return (this.honorariosMed + this.materialesDesc + 200 + this.costoVacuna);
		return (this.honorariosMed + this.materialesDesc + this.costoVacuna);
	}
	
}
