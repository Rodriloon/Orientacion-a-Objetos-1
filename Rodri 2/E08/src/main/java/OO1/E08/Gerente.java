package OO1.E08;

public class Gerente extends EmpleadoJerarquico{
	
	public double aportes() {
		return this.montoBasico() * 0.05d;
	}
	
	public double montoBasico() {
		return 57000;
	}
	
}
