package OO1.E13;
import java.util.ArrayList;
import java.util.List;

public class Email {
	
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String t, String c) {
		this.titulo = t;
		this.cuerpo = c;
		adjuntos = new ArrayList<Archivo>();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}
	
	public List<Archivo> getAdjuntos() {
        return adjuntos;
    }
	
	public int getTamaño() {
        return titulo.length() + cuerpo.length() + 
               adjuntos.stream().mapToInt(Archivo::getTamaño).sum();
    }
	
	public String getCategoria() {
		int tamaño = this.getTamaño();
		if (tamaño <= 300)
			return "Pequeño";
		if (tamaño <= 500)
			return "Mediano";
		return "Grande";
	}
	
}
