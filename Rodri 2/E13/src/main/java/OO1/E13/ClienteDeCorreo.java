package OO1.E13;
import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo () {
		this.inbox = new Carpeta("Inbox");
        this.carpetas = new ArrayList<Carpeta>();
        this.carpetas.add(inbox);
	}
	
	public void recibir (Email email) {
		inbox.agregarEmail(email);
	}
	
	public Email buscar(String texto) {
		return carpetas.stream().flatMap(carpeta -> carpeta.getEmails()
				.stream()).filter(email -> email.getTitulo().contains(texto) || email.getCuerpo().contains(texto)).findFirst().orElse(null);
	}
	
	public int espacioOcupado() {
        return carpetas.stream().mapToInt(Carpeta::getEspacioOcupado).sum();
    }
	
	public int cantidadTotalEmails() {
		int aux = inbox.cantidadEmail();
		aux += carpetas.stream().mapToInt(car -> car.cantidadEmail()).sum();
		return aux;
	}
}
