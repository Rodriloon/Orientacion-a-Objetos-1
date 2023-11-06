package Practica1.E9;

public class CuentaCorriente extends Cuenta{
	
	double descubierto;
	
	public CuentaCorriente() {
		super();
	}
	
	void setDescubierto(double d) {
		this.descubierto = d;
	}
	
	double getDescubierto() {
		return this.descubierto;
	}
	
	boolean puedeExtraer(double monto) {
		if (this.saldo - monto >= this.descubierto) {
			return true;
		}
		return false;
	}
	
}
