package OO1.E13;
import java.util.ArrayList;
import java.util.List;
import OO1.E21.Bolsa;

public class Carpeta {
	
	private String nombre;
	private List<Email> emails;
	private Bolsa<String> bag;
	
	public Carpeta(String n) {
		this.nombre = n;
		emails = new ArrayList<Email>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public List<Email> getEmails() {
        return emails;
    }
	
	public void agregarEmail(Email email) {
        emails.add(email);
        bag.add(email.getCategoria());
    }
	
	public void mover(Email email, Carpeta destino) {
		emails.remove(email);
        destino.agregarEmail(email);
	}
	
	public int getEspacioOcupado() {
        return emails.stream().mapToInt(Email::getTamaño).sum();
    }
	
	public Email busqueda(String x) {
		return emails.stream().filter(email -> email.getTitulo().contains(x) || email.getCuerpo().contains(x)).findFirst().orElse(null);
	}
	
	public Bolsa<String> totalCategorias() {
		return bag;
	}
	
	public int cantidadEmail() {
		return emails.size();
	}
	
}
