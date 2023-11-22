package oo1.ejercicio17_FacturacionDeLlamadas;

import java.time.LocalDate;

public class Factura {
	private Cliente cliente;
	private LocalDate fechaFacturacion;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private double monto;
	
	public Factura(Cliente cliente, LocalDate fechaFacturacion, LocalDate fechaInicio, LocalDate fechaFin,double monto) {
		this.cliente = cliente;
		this.fechaFacturacion = fechaFacturacion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.monto = monto;
	}
	
	public double getMonto() {
		return monto;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

}
