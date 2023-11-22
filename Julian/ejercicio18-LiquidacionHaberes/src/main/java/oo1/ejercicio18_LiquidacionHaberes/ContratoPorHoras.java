package oo1.ejercicio18_LiquidacionHaberes;

import java.time.LocalDate;
import java.time.LocalTime;

public class ContratoPorHoras extends Contrato{
	private LocalDate finDelContrato;
	private double valorHora;
	private int horas;
	
	public ContratoPorHoras(Empleado empleado,LocalDate inicioContrato, LocalDate finDelContrato, double valorHora, int horas) {
		super(empleado,inicioContrato);
		this.finDelContrato = finDelContrato;
		this.valorHora = valorHora;
		this.horas = horas;
	}

	@Override
	public boolean isVencido() {
		return this.finDelContrato.isBefore(LocalDate.now()) || this.finDelContrato.isEqual(LocalDate.now());
	}

	@Override
	public double montoACobrar() {
		return this.valorHora * this.horas;
	}


	
	
	
	

}
