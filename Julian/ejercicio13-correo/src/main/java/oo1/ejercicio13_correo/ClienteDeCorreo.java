package oo1.ejercicio13_correo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.carpetas = new ArrayList<>();
		inbox = new Carpeta("Inbox");
		carpetas.add(inbox);
	}
	
	public void agregarCarpeta(Carpeta c) {
		carpetas.add(c);
	}
	
	public List<Carpeta> getCarpetas() {
		return carpetas;
	}

	public Carpeta getInbox() {
		return inbox;
	}

	public void setInbox(Carpeta inbox) {
		this.inbox = inbox;
	}

	public void recibir (Email email) {
		this.inbox.agregarCorreo(email);
	}
	
	public void mover (Email email, Carpeta origen, Carpeta destino) {
		origen.eliminarCorreo(email);
		destino.agregarCorreo(email);
	}
	
	public Email buscar(String texto) { 
		return carpetas.stream() 
				.map(carpeta -> carpeta.buscar(texto))
				.filter(Objects::nonNull)
				.findFirst()
				.orElse(null);
			
	}
			
	
	public int espacioOcupado() {
		return carpetas.stream()
				.mapToInt(carpeta -> carpeta.espacioOcupado())
				.sum();
	}
	
	

}
