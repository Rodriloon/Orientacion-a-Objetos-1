package Practica1.E6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Farola {
	
	private boolean on;
	private List <Farola> neighbor;
	
	public Farola () {
		on = false;
		neighbor = new ArrayList <Farola> ();
	}
	
	public void pairWithNeighbor( Farola otraFarola ) {
		if (!neighbor.contains(otraFarola)) {
			neighbor.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}

	public List <Farola> getNeighbors () {
		return neighbor;
	}

	public void turnOn() {
		if (this.on != true) {
			this.on = true;
			neighbor.forEach(vecina -> vecina.turnOn());
		}
	}
	
	public void turnOff() {
		if (this.on != false) {
			this.on = false;
			neighbor.forEach(vecina -> vecina.turnOff());
		}
	}

	public boolean isOn() {
		return this.on;
	}

	
}
