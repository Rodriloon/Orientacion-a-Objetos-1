package OO1.E14b;
import java.time.LocalDate;

public interface DateInterface {
	
	public LocalDate getTo();
	public LocalDate getFrom();
	public int sizeInDays();
	public boolean includesDate(LocalDate other);

}