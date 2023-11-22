package oo1.ejercicio9_cuentaConGanchos;

public abstract class Cuenta {
	private double saldo;
	
	public Cuenta() {
		this.saldo=0;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double monto) {
		this.saldo += monto;
	}
	
	protected void extraerSinControl(double monto) {
		this.saldo -= monto;
	}
	
	public boolean extraer(double monto) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControl(monto);
			return true;
		}
		return false;
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino){
		if (this.puedeExtraer(monto)) {
			this.extraerSinControl(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	

	protected abstract boolean puedeExtraer(double monto);
	
}
