package OO1.E25;

public class Guarderia extends Servicio{
	
	private int cantidadDias;

	
	public Guarderia(Mascota mas, int cantidadDias) {
		super(mas);
		this.cantidadDias = cantidadDias;
	}
	
	
	public int getCantidadDias() {
		return this.cantidadDias;
	}
	
	public double calcularCostoServicio() {
		if (getMascota().bonificacionGuarderia())
			return (getCantidadDias() * 500) * 0.9;
		return getCantidadDias() * 500;
	}
	
}
