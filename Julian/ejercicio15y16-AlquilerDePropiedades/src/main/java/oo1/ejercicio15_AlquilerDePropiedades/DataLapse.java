package oo1.ejercicio15_AlquilerDePropiedades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import oo1.ejercicio14_datalapse2.DataLapseInterface;

public class DataLapse implements DataLapseInterface {
	private LocalDate from;
	private LocalDate to;
	
	
	public DataLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	public LocalDate getFrom() {
		return from;
	}
	public LocalDate getTo() {
		return to;
	} 
	
	public int sizeInDays() {
		//return from.until(to).getDays();
		//Obtengo Period y obtengo los dias pero no toma en cuenta los años
		
		return (int) ChronoUnit.DAYS.between(from, to);
	}
	
	public boolean includesDate(LocalDate other) {
		if ((other.isBefore(this.getTo())) && (other.isAfter(this.getFrom()))) return true;
		else if ((other.isEqual(this.getTo())) || (other.isEqual(this.getFrom()))) return true;
			else return false;
	}
	
	//Si el periodo es igual retorno true, sino retorno false 
	public boolean overlaps(DataLapse otroDateLapse) {
	    return !(to.isBefore(otroDateLapse.getFrom()) || from.isAfter(otroDateLapse.getTo()));
	}
	public boolean startsAfter(LocalDate fechaActual) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
