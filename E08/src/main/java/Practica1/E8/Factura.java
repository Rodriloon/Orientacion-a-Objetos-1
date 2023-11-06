package Practica1.E8;
import java.time.LocalDate;

public class Factura {
	
	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha;
	private Usuario usuario;
	
	public Factura(double ma, double d, Usuario u) {
		fecha = LocalDate.now();
		montoEnergiaActiva = ma;
		descuento = d;
		this.usuario = u;
	}
	
	public void setMontoEnergiaActiva(double montoEnergiaActiva) {
		this.montoEnergiaActiva = montoEnergiaActiva;
	}
	
	public double getMontoEnergiaActiva() {
		return montoEnergiaActiva;
	}
	
	public double montoTotal() {
		return montoEnergiaActiva - (this.montoEnergiaActiva * (this.descuento/100));
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	LocalDate getFecha() {
		return fecha;
	}
	
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	public double getDescuento() {
		return descuento;
	}
	
}
