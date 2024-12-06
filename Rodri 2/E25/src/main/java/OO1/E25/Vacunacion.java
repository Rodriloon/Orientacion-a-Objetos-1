package OO1.E25;

public class Vacunacion extends IntervencionMedica{
	
	private String nombreVacuna;
	private double valor;
	
	
	public Vacunacion(Mascota mas, Medico medico, String nombreVacuna, double valor) {
		super(mas, medico);
		this.nombreVacuna = nombreVacuna;
		this.valor = valor;
	}
	
	
	public double getValor() {
		return this.valor;
	}
	
	public double getAdicionales() {
		return 500 + getValor();
	}
	
}
