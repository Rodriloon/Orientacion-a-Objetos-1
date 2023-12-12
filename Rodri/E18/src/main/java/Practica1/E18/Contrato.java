package Practica1.E18;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public abstract class Contrato {
	
	private LocalDate inicio;
	private boolean activo;

	public Contrato(LocalDate inicio) {
		this.inicio = inicio;
		this.activo = false;
	}
	
	public boolean getEstado() {
		return this.activo;
	}
	
	public void modificarEstado() {
		this.activo = !this.activo;
	}
	
	public int diferenciaDias() {
		long dias = DAYS.between(LocalDate.now(), this.inicio);
        return Math.toIntExact(dias);
	}
	
	public abstract double montoACobrar();
}
