package oo1.ejercicio18_LiquidacionHaberes;

import java.time.LocalDate;
import java.time.LocalTime;

public class ContratoDePlanta extends Contrato {
	private double sueldo;
	private double montoConyuge;
	private double montoHijos;
	
	public ContratoDePlanta(Empleado empleado,LocalDate inicioContrato, double sueldo, double montoConyuge, double montoHijos) {
		super(empleado,inicioContrato);
		this.sueldo = sueldo;
		this.montoConyuge = montoConyuge;
		this.montoHijos = montoHijos;
	}

	@Override
	public boolean isVencido() {
		return false;
	}

	@Override
	public double montoACobrar() {
		return this.sueldo + this.montoConyuge + this.montoHijos;
	}

	
	
	
	

}
