package oo1.ejercicioAD1;

public class Medicion {
	private int unidades;
	private int mes;
	private int año;
	
	public Medicion(int unidades, int mes, int año) {
		this.unidades = unidades;
		this.mes = mes;
		this.año = año;
	}

	public int getUnidades() {
		return unidades;
	}
	
	
	public boolean coincideFecha(int mes, int año) {
		return this.mes == mes && this.año == año;
	}
	
	public boolean inferiorActual(int ant) {
		return this.unidades < ant;
	}
	

}
