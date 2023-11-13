package P2.Ejercicio3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	
	private java.time.LocalDate fecha;
	private String cliente;
	private List <Item> items = new ArrayList <Item>();
	
	public Presupuesto (String cli) {
		this.fecha = java.time.LocalDate.now();
		this.cliente = cli;
	}
	
	LocalDate getFecha () {
		return this.fecha;
	}
	
	String getCliente () {
		return this.cliente;
	}
	
	void agregarItem (Item item) {
		items.add(item);
	}
	
	double calcularTotal () {
		double total = 0;
		for (Item xItem : items) {
			total = total + xItem.costo();
		}
		return total;
	}
	
}
