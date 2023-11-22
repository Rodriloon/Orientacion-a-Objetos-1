package oo1.ejercicio17_FacturacionDeLlamadas;

import java.time.LocalDate;

public class LlamadaLocal extends Llamada {

	public LlamadaLocal(LocalDate fecha, double hora, double duracion, int numeroLlama, int numeroRecibe) {
		super(fecha, hora, duracion, numeroLlama, numeroRecibe);
	}

	@Override
	public double costoPorLlamada() {
		return this.getDuracion() * 1;
	}
	
	
	
	


}
