package Practica1.E17;
import java.time.LocalDate;
import java.time.LocalTime;

public class LlamadaInterurbana extends Llamada{
	
	private double distancia;

	public LlamadaInterurbana(LocalDate fecha, double hora, double duracion, int llama, int recibe, double distancia) {
		super(fecha, hora, duracion, llama, recibe);
		this.distancia = distancia;
	}
	
	public double costo() {
		double costo = 5;
		if (distancia < 100) 
			return costo += (super.getDuracion() * 2);
		else 
			if ((distancia > 100) && (distancia < 500))
				return costo += (super.getDuracion() * 2.5);
			else 
				return costo += (super.getDuracion() * 3);
	}
	
}
