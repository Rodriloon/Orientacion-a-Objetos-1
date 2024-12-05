package OO1.E17;
import java.time.LocalDate;
import OO1.E14b.DateLapse;

public class Reserva {
	
	private Usuario cliente;
	private Propiedad inmueble;
	private DateLapse lapso;
	
	public Reserva(Usuario cliente, Propiedad inmueble, DateLapse lapso) {
		this.cliente = cliente;
		this.inmueble = inmueble;
		this.lapso = lapso;
	}

	public Usuario getCliente() {
		return cliente;
	}

	public Propiedad getInmueble() {
		return inmueble;
	}

	public DateLapse getLapso() {
		return lapso;
	}
	
	public double calculo() {
		return this.getLapso().sizeInDays() * this.getInmueble().getPrecioXnoche();
	}
	
	public boolean comparoPeriodo(DateLapse otroDateLapse) {
		return this.lapso.overlaps(otroDateLapse);
	}
	
	public boolean esPosterior(LocalDate fechaActual) {
		if (this.lapso.getFrom().isAfter(fechaActual)) 
			return true;
		else 
			return false;
	}
	
}
