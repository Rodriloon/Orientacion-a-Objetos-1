package Practica1.E13;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClienteDeCorreo {
	
	private List <Carpeta> carpetas;
	private Carpeta inbox;
	
	public ClienteDeCorreo() {
		this.carpetas = new ArrayList<Carpeta>();
	}
	
	public void recibir(Email e) {
		this.inbox.agregarEmail(e);
	}
	
	public void mover(Email e, Carpeta origen, Carpeta destino) {
		carpetas.stream()
						.filter(carp -> carp.getNombre().equals(origen.getNombre()))
						.findAny()
						.ifPresent(carp -> carp.eliminarEmail(e));
	}
	
	public Email buscar(String texto) { 
		return carpetas.stream() 
				.map(carp -> carp.buscar(texto))
				.filter(Objects::nonNull)
				.findFirst()
				.orElse(null);

	}
	
	public int espacioOcupado() {
		return carpetas.stream()
				.mapToInt(carpeta -> carpeta.espacioOcupado())
				.sum();
	}
	
	public void agregarCarpeta(Carpeta c) {
		this.carpetas.add(c);
	}
	
	public void eliminarCarpeta(Carpeta c) {
		this.carpetas.remove(c);
	}
	
	
	
}
