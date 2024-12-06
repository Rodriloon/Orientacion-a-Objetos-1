package OO1.E24;
import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Usuario{
	
	private List<Viaje> viajePasados;
	
	
	public Pasajero(String nombre, double saldo) {
		super(nombre, saldo);
		this.viajePasados = new ArrayList<>();
	}
	
	public boolean viajoEn30Dias () {
		return viajePasados.stream().anyMatch(v -> v.realizadoEnUltimos30dias());
	}
	
	public void cargarSaldo(double monto) {
		if (viajoEn30Dias())
			setSaldo(getSaldo() + monto);
		if (!viajoEn30Dias())
			setSaldo(getSaldo() + (monto * 0.9));
	}
	
	public double calcularBonificacion() {
		if (viajePasados.size() == 0)
			return 0;
		return 500;
	}
	
	public void registrarViaje (Viaje viaje) {
		if (getSaldo() > 0  && viaje.puedeIngresar()){
			viaje.registrarPasajero(this);
			this.viajePasados.add(viaje);
		}
	}
	
}
