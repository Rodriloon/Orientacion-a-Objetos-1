package ar.edu.unlp.info.oo1.ejercicio5_genalogia;

import java.util.Date;

public class Mamifero {
	private String identificador;
	private String especie;
	private Date fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;

	
	
	public Mamifero(String identificador) {
		super();
		this.identificador = identificador;
	}
	
	public Mamifero() {
		
	}

	public Mamifero getPadre() {
		return padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public Mamifero getMadre() {
		return madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public Mamifero getAbueloPaterno() {
		Mamifero abuelo = null;
		if (padre != null) 
			abuelo =  this.getPadre().getPadre();
		return abuelo;
	}

	
	public Mamifero getAbueloMaterno() {
		Mamifero abuelo = null;
		if (madre != null) 
			abuelo = this.getMadre().getPadre();
		return abuelo;
	}

	
	public Mamifero getAbuelaPaterna() {
		Mamifero abuela = null;
		if (padre != null)
			abuela = this.getPadre().getMadre();
		return abuela;
	}


	public Mamifero getAbuelaMaterna() {
		Mamifero abuela = null;
		if (madre != null)
			abuela = this.getMadre().getMadre();
		return abuela;
	}

	
	public boolean tieneComoAncestroA(Mamifero m) {
		boolean tiene = false;
		if (this.getPadre() != null) { //SI TIENE PADRE 
			if (this.getPadre().equals(m)) { // SI EL PADRE ES EL MAMIFERO
				tiene = true;  //DEVUELVO TRUE
			} //SINO
			else {  
				tiene = this.getPadre().tieneComoAncestroA(m);
			}
		}
		
		if (!tiene) { //SI TODAVIA NO LO ENCONTRE
			if (this.getMadre() != null) { // SI TIENE MADRE
				if (this.getMadre().equals(m)) { //SI LA MADRE ES EL MAMIFERO
					tiene = true;
				}
				else { //SINO
					tiene = this.getMadre().tieneComoAncestroA(m); //BUSCO ANCESTROS
				}
			}
		}		
		return tiene;	
	}
	
	
	
	

	
	
}
