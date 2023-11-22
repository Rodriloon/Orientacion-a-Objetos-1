package oo1.ejercicio17Version2;

import java.time.LocalDate;

public class Factura {
	private Cliente cliente;
	private LocalDate inicio;
	private LocalDate fin;
	private LocalDate diaFacturacion;
	private double monto;
	
	public Factura(Cliente cliente, LocalDate inicio, LocalDate fin, LocalDate diaFacturacion, double monto) {
		this.cliente = cliente;
		this.inicio = inicio;
		this.fin = fin;
		this.diaFacturacion = diaFacturacion;
		this.monto = monto;
	}
	
	public double getMonto() {
		return this.monto;
	}
	
	

}
