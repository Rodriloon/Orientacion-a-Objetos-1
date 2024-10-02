package OO1.E07;
import java.util.ArrayList;
import java.util.List;

public class Farola {
	
	private List<Farola> conexiones;
	private boolean estado;
	
	/*
	* Crear una farola. Debe inicializarla como apagada
	*/
	public Farola () {
		estado = false;
		conexiones = new ArrayList<Farola>();
	}
	
	public boolean isOn() {
		boolean aux = false;
		if (estado) {
			aux = true;
		}
		return aux;
	}
	
	public boolean isOff() {
		boolean aux = false;
		if (!estado) {
			aux = true;
		}
		return aux;
	}

	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, 
	* al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		conexiones.add(otraFarola);
		otraFarola.conexiones.add(this);
	}
	
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors (){
		return conexiones;
	}

	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if (!estado) {
			estado = true;
			conexiones.stream().forEach(con -> con.turnOn());
		}
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if (estado) {
			estado = false;
			conexiones.stream().forEach(con -> con.turnOff());
		}
	}

}
