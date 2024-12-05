package OO1.E14b;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate f, LocalDate t) {
		this.from = f;
		this.to = t;
	}
	
	//“Retorna la fecha de inicio del rango”
	public LocalDate getFrom() {
		return this.from;
	}

	//“Retorna la fecha de fin del rango”
	public LocalDate getTo() {
		return this.to;
	}

	//“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”
	public int sizeInDays() {
		return new Long(ChronoUnit.DAYS.between(from, to)).intValue();
	}

	//“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.
	public boolean includesDate(LocalDate other) {
		if ((other.isBefore(this.getTo())) && (other.isAfter(this.getFrom())))
			return true;
		else
			if (other.isEqual((this.getTo())) || (other.isEqual(this.getFrom())))
				return true;
			else
				return false;
	}
	
	//"Retorna true si el período de tiempo del receptor se superpone con el recibido por parámetro"
	public boolean overlaps(DateLapse otroDateLapse) {
	    return !(to.isBefore(otroDateLapse.getFrom()) || from.isAfter(otroDateLapse.getTo()));
	}
	
}
