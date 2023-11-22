package ar.edu.unlp.info.oo1.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean encendida;
	private List <Farola> farolas;

	public Farola() {
		this.farolas = new ArrayList<>();
		this.encendida = false;
	}
	
	public void pairWithNeighbor (Farola otraFarola) {
		farolas.add(otraFarola);
		otraFarola.getNeighbors().add(this);
		
		/** OTRA IMPLEMENTACION
		if (!this.farolas.contains(otraFarola) {
			farolas.add(otraFarola);
			otraFarola.pairWithNeighbor(this)
		}
		**/
	}
	
	public List<Farola> getNeighbors(){
		return farolas;
	}

	public boolean isOn() {
		if (encendida)
			return true;
		else
			return false;
	}
	
	public void turnOn() {
		if (!this.isOn()) {
			encendida = true;
			for(Farola f:farolas) {
				f.turnOn();
			}
		}	
	}
	
	public void turnOff() {
		if (this.isOn()) {
			encendida = false;
			for(Farola f:farolas) {
				f.turnOff();
			}
		}
	}
	

}
