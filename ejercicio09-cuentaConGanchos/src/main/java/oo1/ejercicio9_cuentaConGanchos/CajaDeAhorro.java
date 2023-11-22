package oo1.ejercicio9_cuentaConGanchos;

public class CajaDeAhorro extends Cuenta {


	public CajaDeAhorro() {
		
	}
	
	@Override
	public boolean puedeExtraer(double monto) {
		if ((this.getSaldo() - this.costoAdicional(monto)) - monto >= 0) return true;
		else return false;
	}
	
	public boolean extraer (double monto) {
		return super.extraer(monto + this.costoAdicional(monto));
	}
	
	public void depositar(double monto) {
		super.depositar(monto - this.costoAdicional(monto));
	}

	protected double costoAdicional(double monto) {
		return monto * 0.02;
	}
	
	public boolean transferirACuenta (double monto, Cuenta otraCuenta) {
		return super.transferirACuenta(monto + this.costoAdicional(monto),otraCuenta);
	}
	
}
