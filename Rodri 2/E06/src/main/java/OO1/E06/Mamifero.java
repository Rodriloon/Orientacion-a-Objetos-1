package OO1.E06;
import java.sql.Date;

public class Mamifero {
	
	private String identificador;
	private String especie;
	private Date fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero (String id) {
		identificador = id;
	}
	public Mamifero () {
		
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String id) {
		this.identificador = id;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
	
	public Mamifero getAbueloMaterno() {
		if (this.getMadre() != null) {
			return this.madre.getPadre();
		}
		else {
			return null;
		}
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.getMadre() != null) {
			return this.madre.getMadre();
		}
		else {
			return null;
		}
	}
	
	public Mamifero getAbueloPaterno() {
		if (this.getPadre() != null) {
			return this.padre.getPadre();
		}
		else {
			return null;
		}
	}
	
	public Mamifero getAbuelaPaterna() {
		if (this.getPadre() != null) {
			return this.padre.getMadre();
		}
		else {
			return null;
		}
	}
	
	public Boolean tieneComoAncestroA(Mamifero unMamifero) {
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
