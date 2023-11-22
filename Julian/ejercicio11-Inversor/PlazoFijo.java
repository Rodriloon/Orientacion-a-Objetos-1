package MisEjercicios.ejercicio11_Inversor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	
	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		super();
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}


	@Override
	public double valorActual() {
		double porcentaje = this.montoDepositado * (this.dias() * this.porcentajeDeInteresDiario);
		return this.montoDepositado + porcentaje;
	}
	
	private long dias() {
		long aux = 0; 
		LocalDate fechaActual = LocalDate.now();
		return aux = ChronoUnit.DAYS.between(this.fechaDeConstitucion, fechaActual);
	}

}
