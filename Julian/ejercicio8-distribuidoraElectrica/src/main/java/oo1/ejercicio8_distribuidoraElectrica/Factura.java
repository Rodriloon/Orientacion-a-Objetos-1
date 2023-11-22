package oo1.ejercicio8_distribuidoraElectrica;

import java.time.LocalDate;

public class Factura {
	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha;
	private Usuario usuario;

	public Factura(double monto, double descuento, Usuario usuario) {
		this.montoEnergiaActiva = monto;
		this.descuento = descuento;
		this.fecha = LocalDate.now();
		this.usuario = usuario;
	}
	
	public double montoTotal() {
		return montoEnergiaActiva - (this.montoEnergiaActiva * (this.descuento/100));
	}

	public double getMontoEnergiaActiva() {
		return montoEnergiaActiva;
	}

	public void setMontoEnergiaActiva(double montoEnergiaActiva) {
		this.montoEnergiaActiva = montoEnergiaActiva;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
