package Practica1.E18;
import java.time.LocalDate;

public class Planta extends Contrato{
	
	private double sueldo;
	private double montoConyuge;
	private double montoHijos;
	
	public Planta(double sueldo, double montoConyuge, double montoHijos, LocalDate i) {
		super(i);
		this.sueldo = sueldo;
		this.montoConyuge = montoConyuge;
		this.montoHijos = montoHijos;
	}
	
	public double montoACobrar() {
		return this.sueldo + this.montoConyuge + this.montoHijos;
	}
	
}
