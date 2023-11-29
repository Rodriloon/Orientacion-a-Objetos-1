package Practica1.E17;
import java.time.LocalDate;
import java.time.LocalTime;

public class LlamadaLocal extends Llamada{
	
	public LlamadaLocal(LocalDate fecha, double hora, double duracion, int llama, int recibe) {
		super(fecha, hora, duracion, llama, recibe);
	}
	
	public double costo() {
		return getDuracion();
	}
	
}
