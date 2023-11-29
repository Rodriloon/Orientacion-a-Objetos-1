package Practica1.E17;
import java.time.LocalDate;

public class Factura {
	
	private Cliente persona;
	private LocalDate fechaF;
	private LocalDate inicio;
	private LocalDate fin;
	private double montoTotal;
	
	public Factura(Cliente persona, LocalDate fechaF, LocalDate inicio, LocalDate fin, double montoTotal) {
		this.persona = persona;
		this.fechaF = fechaF;
		this.inicio = inicio;
		this.fin = fin;
		this.montoTotal = montoTotal;
	}
	
	public double getMonto() {
		return montoTotal;
	}
	
	public Cliente getCliente() {
		return persona;
	}
	
}
