package OO1.E24;

public abstract class Usuario {
	
	private String nombre;
	private double saldo;
	
	
	public Usuario(String nombre, double saldo) {
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract void cargarSaldo(double monto);
	
	public abstract double calcularBonificacion();
	
	public void bajarSaldo(double monto) {
		setSaldo(this.saldo - monto);
	}
	
}
