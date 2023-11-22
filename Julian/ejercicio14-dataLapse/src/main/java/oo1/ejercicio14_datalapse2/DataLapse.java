package oo1.ejercicio14_datalapse2;

import java.time.LocalDate;

public class DataLapse implements DataLapseInterface {
	private LocalDate from;
	private int sizeInDays;
	
	
	public DataLapse(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}
	
	public LocalDate getTo() {
		return from.plusDays(sizeInDays);
	}
	
	
	public LocalDate getFrom() {
		return from;
	}

	public int sizeInDays() {
		return sizeInDays;
	}
	
	public boolean includesDate(LocalDate other) { //esto se pedia?
		if ((other.isBefore(this.getTo())) && (other.isAfter(this.getFrom()))) return true;
		else if ((other.isEqual(this.getTo())) || (other.isEqual(this.getFrom()))) return true;
			else return false;
	}
}
