package Practica1.E14;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate f, LocalDate t) {
		this.from = f;
		this.to = t;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.to;
	}
	
	public int sizcinDays() {
		long diferenciaEnDias = ChronoUnit.DAYS.between(this.from , this.to);
		return Math.abs((int) diferenciaEnDias);

	}
	
	public boolean includesDate(LocalDate other) {
		if ((other.isBefore(this.getTo())) && (other.isAfter(this.getFrom()))) return true;
		else if ((other.isEqual(this.getTo())) || (other.isEqual(this.getFrom()))) return true;
			else return false;
	}
	
}
