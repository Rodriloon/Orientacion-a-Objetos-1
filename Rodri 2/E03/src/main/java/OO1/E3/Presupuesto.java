package OO1.E3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Presupuesto {
	
	private LocalDate fecha;
	private String cliente;
	private List<Item> lista;
	
	public Presupuesto(String c) {
		fecha = LocalDate.now();
		cliente = c;
		lista = new ArrayList<Item>();
	}
	
	public void agregarItem(Item item) {
		lista.add(item);
	}
	
	public double calcularTotal() {
		return lista.stream()
				.mapToDouble(lista -> lista.costo())
				.sum();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getCliente() {
		return cliente;
	}
	
}
