package Practica1.E9;

public abstract class Cuenta {
	
	double saldo;
	
	public Cuenta() {
		this.saldo = 0;
	}
	
	double getSaldo() {
		return this.saldo;
	}
	
	void depositar(double monto) {
		this.saldo += monto;
	}
	
	protected void extraerSinControl(double monto) {
		this.saldo -= monto;
	}
	
	abstract boolean puedeExtraer(double monto);
	
	boolean extraer(double monto) {
		if (this.puedeExtraer(monto)){
			this.extraerSinControl(monto);
			return true;
		}
		return false;
	}
	
	boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControl(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	
}
