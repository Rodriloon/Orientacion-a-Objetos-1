package Practica1.E11;
import java.time.LocalDate;

public class PlazoFijo implements Inversion{
	
	public LocalDate fechaDeConstitucion;
	public double montoDepositado;
	public double porcentajeDeInteresDiario;
	
	public PlazoFijo(LocalDate fc, double md, double p) {
		this.fechaDeConstitucion = fc;
		this.montoDepositado = md;
		this.porcentajeDeInteresDiario = p;
	}
	
	LocalDate getFechaDeConstitucion() {
		return this.fechaDeConstitucion;
	}
	
	void setMontoDepositado(double m) {
		this.montoDepositado = m;
	}
	
	double getMontoDepositado() {
		return this.montoDepositado;
	}
	
	void setPorcentajeDeInteresDiario(double p) {
		this.porcentajeDeInteresDiario = p;
	}
	
	double getPorcentajeDeInteresDiario() {
		return this.porcentajeDeInteresDiario;
	}
	
	public double valorActual() {
		return (getMontoDepositado() * (getPorcentajeDeInteresDiario() * (LocalDate.now().compareTo(getFechaDeConstitucion()))));
	}
	
}
