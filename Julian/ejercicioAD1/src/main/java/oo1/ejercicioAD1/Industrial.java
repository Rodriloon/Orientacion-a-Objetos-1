package oo1.ejercicioAD1;

public class Industrial extends Cliente {
	public Industrial (String nombre, String direccion) {
		super(nombre, direccion);
	}
	
	public double calcularConsumo(double precioC,double precioI,int mes, int año) {
		Medicion ant = this.buscarMedicion(mes - 1, año);
		Medicion act = this.buscarMedicion(mes, año);
		if (act != null) {
			double total = precioI * act.getUnidades();
			if (ant != null) {
				if (act.inferiorActual(ant.getUnidades())) return total - this.descuento(total);
				else return total;	//Si el anterior no es inferior
			}
			else return total; //Si no tiene anterior
		}
		else return 0; //Si no tiene mediciones
	}
	
	private double descuento(double total) {
		return total/100 * 2;
	}
}
