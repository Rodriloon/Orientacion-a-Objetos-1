package OO1.E25;
import java.time.LocalDate;

public abstract class Servicio {
	
	private LocalDate fechaAtencion;
	private Mascota mascota;
	
	
	public Servicio(Mascota mas) {
		this.mascota = mas;
		this.fechaAtencion = LocalDate.now();
	}


	
	public LocalDate getFechaAtencion() {
		return this.fechaAtencion;
	}
	
	public Mascota getMascota() {
		return this.mascota;
	}

	public abstract double calcularCostoServicio();
	
	public double fechaParametro(LocalDate fecha) {
		if (getFechaAtencion().isEqual(fecha))
			return calcularCostoServicio();
		return 0;
	}
}
