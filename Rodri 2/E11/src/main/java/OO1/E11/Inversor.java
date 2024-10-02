package OO1.E11;
import java.util.ArrayList;
import java.util.List;

public class Inversor {
	
	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversion>();
	}
	
	public void agregarInversion(Inversion unaInversion) {
		this.inversiones.add(unaInversion);
	}
	
	public void quitarInversion(Inversion unaInversion) {
		this.inversiones.remove(unaInversion);
	}
	
	public List<Inversion> listaDeInversiones(){
		return this.inversiones;
	}
	
	public double valorActual() {
		return inversiones.stream().
				mapToDouble(inv -> inv.valor()).sum();
	}
	
}
