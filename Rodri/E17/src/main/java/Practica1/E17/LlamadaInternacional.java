package Practica1.E17;
import java.time.LocalDate;
import java.time.LocalTime;

public class LlamadaInternacional extends Llamada{
	
	private String origen;
	private String destino;
	
	public LlamadaInternacional(LocalDate fecha, double hora, double duracion, int llama, int recibe, String origen, String destino) {
		super(fecha, hora, duracion, llama, recibe);
		this.origen = origen;
		this.destino = destino;
	}
	
	public double costo() {
		if ((super.getHora() >= 800) && (super.getHora() <= 2000)) 
			return (super.getDuracion() * 4);
		else 
			return (super.getDuracion() * 3);
	}
	
}
