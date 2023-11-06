package Practica1.E5;

import java.time.LocalDate;

public class Mamifero {
	
	private String identificacion;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	private Mamifero abueloPaterno;
	private Mamifero abuelaPaterno;
	private Mamifero abueloMaterna;
	private Mamifero abuelaMaterna;
	
	public Mamifero () {
		this.identificacion = "anonimo";
	}
	
	public Mamifero (String nom) {
		this.identificacion = nom;
	}
	
	String getIdentificador () {
		return this.identificacion;
	}
	
	void setIdentificador (String id) {
		this.identificacion = id;
	}
	
	String getEspecie () {
		return this.especie;
	}
	
	void setEspecie (String e) {
		this.especie = e;
	}
	
	LocalDate getFechaNacimiento () {
		return this.fechaNacimiento;
	}
	
	void setFechaNacimiento (LocalDate fn) {
		this.fechaNacimiento = fn;
	}
	
	Mamifero getPadre () {
		return this.padre;
	}
	
	void setPadre (Mamifero p) {
		this.padre = p;
	}
	
	Mamifero getMadre () {
		return this.madre;
	}
	
	void setMadre (Mamifero m) {
		this.madre = m;
	}
	
	Mamifero getAbueloPaterno () {
		if (this.getPadre() != null) {
			return this.padre.getPadre();
		}
		else {
			return null;
		}
	}

	Mamifero getAbuelaPaterna () {
		if (this.getPadre() != null) {
			return this.padre.getMadre();
		}
		else {
			return null;
		}
	}
	
	Mamifero getAbueloMaterno () {
		if (this.getMadre() != null) {
			return this.madre.getPadre();
		}
		else {
			return null;
		}
	}
	
	Mamifero getAbuelaMaterna () {
		if (this.getMadre() != null) {
			return this.madre.getMadre();
		}
		else {
			return null;
		}
	}
	
	boolean tieneComoAncestroA (Mamifero unMamifero) {
		if (this.getMadre() == unMamifero) {
			return true;
		}
		else {
			if (this.getAbueloMaterno() == unMamifero) {
				return true;
			}
			else 
				if (this.getAbuelaMaterna() == unMamifero){
					return true;
			}
		}
		
		if (this.getPadre() == unMamifero) {
			return true;
		}
		else {
			if (this.getAbueloPaterno() == unMamifero) {
				return true;
			}
			else 
				if (this.getAbuelaPaterna() == unMamifero){
					return true;
			}
		}
		
		return false;
	}
	
}
