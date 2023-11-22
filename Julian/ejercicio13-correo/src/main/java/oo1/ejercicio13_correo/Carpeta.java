package oo1.ejercicio13_correo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		emails = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void agregarCorreo(Email email) {
		emails.add(email);
	}
	
	public void eliminarCorreo(Email email) {
		emails.remove(email);
	}

	public List<Email> getEmails() {
		return emails;
	}
	
	public int espacioOcupado() {
		return emails.stream()
				.mapToInt(email -> email.espacioOcupado())
				.sum();
	}
	
	public Email buscar(String texto) {
		return emails.stream()
				.filter(email -> email.buscar(texto))
				.findFirst()
				.orElse(null);
	}

}
