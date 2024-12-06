package OO1.E24;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Viaje {
	
	private String origen;
	private String destino;
	private double costoTotal;
	private LocalDate fecha;
	private Vehiculo auto;
	private List<Usuario> pasajeros;
	
	public Viaje(String origen, String destino, double costoTotal, LocalDate fecha, Vehiculo auto) {
		this.origen = origen;
		this.destino = destino;
		this.costoTotal = costoTotal;
		this.fecha = fecha;
		this.auto = auto;
		this.pasajeros = new ArrayList<>();
		pasajeros.add(auto.getDueño());
	}
	
	public int diferenciaEnDias() {
		LocalDate fechaActual = LocalDate.now(); 
		Period periodo = Period.between(fecha, fechaActual);
		int diferenciaEnDias = periodo.getDays(); 
		return diferenciaEnDias; 
	}
	
	public boolean realizadoEnUltimos30dias() {
		if (diferenciaEnDias() <= 30 || fecha.isAfter(LocalDate.now())) {		// Si pasaron >30 dias o si todavia no se viajo
			return true; 
		}
		return false;
	}
	
	public boolean puedeIngresar() {
		if ((auto.getCapacidad() > pasajeros.size()) && (ChronoUnit.DAYS.between(this.fecha, LocalDate.now()) >= 2)) 
			return true;
		return false;
	}
	
	public void registrarPasajero(Pasajero pasajero) {
		this.pasajeros.add(pasajero);
	}
	
	public double division() {
		return (costoTotal / pasajeros.size());
	}
	
	public void procesarViaje() {
		pasajeros.stream().forEach(p -> p.bajarSaldo(division()));
	}
	
}
