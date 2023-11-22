package oo1.ejercicio18_LiquidacionHaberes;

import java.time.LocalDate;
import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.DAYS;

public abstract class Contrato {
	private Empleado empleado;
	private LocalDate inicioContrato;

	public Contrato(Empleado empleado, LocalDate inicioContrato) {
		this.empleado = empleado;
		this.inicioContrato = inicioContrato;
	}
	
	public int diferenciaDias() {
		long dias = DAYS.between(LocalDate.now(), this.inicioContrato);
        return Math.toIntExact(dias);
	}

	public abstract boolean isVencido();
	
	public abstract double montoACobrar();
	 
	
	

}
