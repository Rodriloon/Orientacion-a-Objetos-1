package oo1.ejercicio14_datalapse2;

import java.time.LocalDate;

public interface DataLapseInterface {
	
	public LocalDate getTo();
	public LocalDate getFrom();
	public int sizeInDays();
	public boolean includesDate(LocalDate other);

}
