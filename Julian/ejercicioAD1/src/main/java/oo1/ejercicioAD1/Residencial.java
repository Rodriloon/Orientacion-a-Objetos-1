package oo1.ejercicioAD1;

public class Residencial extends Cliente{
	private String apellido;

	public Residencial(String nombre, String apellido, String direccion) {
		super(nombre, direccion);
		this.apellido = apellido;
	}
	
	public String getApellido() {
		return apellido;
	}

	public double calcularConsumo(double precioC, double precioI, int mes, int año) {
		Medicion m = this.buscarMedicion(mes, año);
		double total = precioC * m.getUnidades();
		if (m != null) return total - this.descuento(total); //PARA EVITAR ERRORES ESTA BIEN QUE COMPRUEBE SI ES <> DE NULL? 
		else return 0;
	}
	
	private double descuento(double total) {
		return total / 100 * 10;
	}
	

	
	

}
