package Practica1.E13;
import java.util.ArrayList;
import java.util.List;

public class Email {
	
	private String titulo;
	private String cuerpo;
	private List <Archivo> adjunto;
	
	public Email(String titulo, String cuerpo) {
		this.adjunto = new ArrayList <Archivo>();
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public List<Archivo> adjuntos() {
		return this.adjunto;
	}
	
	public void agregarArchivo(Archivo a) {
		this.adjunto.add(a);
	}
	
	public void eliminarArchivo(Archivo a) {
		this.adjunto.remove(a);
	}
	
	public boolean buscar(String texto) {
		if ((this.getTitulo().contains(texto) || this.getCuerpo().contains(texto))) return true;
		else return false;
	}
	
	public int tamanioTituloCuerpo() {
		return this.getTitulo().length() + this.getCuerpo().length();
	}
	
	public int espacioOcupado() {
		return adjunto.stream()
				.mapToInt(a -> a.espacioOcupado())
				.sum() + this.tamanioTituloCuerpo();
	}
	
}
