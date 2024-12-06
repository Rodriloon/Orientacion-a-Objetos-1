package OO1.E25;

import java.time.DayOfWeek;

public abstract class IntervencionMedica extends Servicio{
	
	private Medico medico;

	
	public IntervencionMedica(Mascota mas, Medico medico) {
		super(mas);
		this.medico = medico;
	}
	
	public abstract double getAdicionales();
	
	public double calcularCostoServicio() {
		if (esDomingo())
			return medico.getHonorarios() + getAdicionales() + 200 + medico.calcularAntiguedad(); 
		return medico.getHonorarios() + getAdicionales() + medico.calcularAntiguedad(); 
	}
	
	public boolean esDomingo() {
		return (getFechaAtencion().getDayOfWeek() == DayOfWeek.SUNDAY);
	}
}
