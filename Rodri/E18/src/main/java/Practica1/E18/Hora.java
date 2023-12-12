package Practica1.E18;
import java.time.LocalDate;

public class Hora extends Contrato{
	
	private LocalDate fin;
	private double valorHora;
	private int numeroHoras;
	
	public Hora(LocalDate fin, double valorHora, int numeroHoras, LocalDate i) {
		super(i);
		this.fin = fin;
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	
	public double montoACobrar() {
		return this.valorHora * this.numeroHoras;
	}

}
