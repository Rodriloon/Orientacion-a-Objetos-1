package OO1.E24;

public class Conductor extends Usuario{
	
	private Vehiculo vehiculo;

	
	public Conductor(String nombre, double saldo, Vehiculo vehiculo) {
		super(nombre, saldo);
		this.vehiculo = vehiculo;
	}
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	
	public void cargarSaldo(double monto) {
		if (vehiculo.calcularAntiguedad() < 5)
			super.setSaldo(super.getSaldo() + (monto * 0.99));
		if (vehiculo.calcularAntiguedad() >= 5)
			super.setSaldo(super.getSaldo() + (monto * 0.9));
	}
	
	public double calcularBonificacion() {
		return (vehiculo.getValor() * 0.01);
	}
	
	
}
