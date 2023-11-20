package Practica1.E13;
import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	
	private String nombre;
	private List <Email> Emails;
	
	public Carpeta (String nom) {
		this.nombre = nom;
		this.Emails = new ArrayList <Email>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void agregarEmail(Email e) {
		this.Emails.add(e);
	}
	
	public void eliminarEmail(Email e) {
		this.Emails.remove(e);
	}
	
	public List<Email> getEmails() {
		return Emails;
	}
	
	public Email buscar(String texto) {
		return Emails.stream()
				.filter(email -> email.buscar(texto))
				.findFirst()
				.orElse(null);
	}
	
	public int espacioOcupado() {
		return Emails.stream()
				.mapToInt(email -> email.espacioOcupado())
				.sum();
	}
	
}
