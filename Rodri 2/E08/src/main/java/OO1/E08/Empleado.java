package OO1.E08;

public class Empleado {
	
	private String nombre;
	
	public Empleado () {
		
	}
	
	public double montoBasico() {
		return 35000;
	}
	
	public double aportes() {
		return 13500;
	}
	
	public double sueldoBasico() {
		return this.montoBasico() + this.aportes();
	}
	
}
