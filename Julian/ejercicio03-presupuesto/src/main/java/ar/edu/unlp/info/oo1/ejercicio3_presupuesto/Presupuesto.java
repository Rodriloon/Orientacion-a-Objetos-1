package ar.edu.unlp.info.oo1.ejercicio3_presupuesto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String cliente) {
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.items = new ArrayList<>();
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
		
	}
	
	public double calcularTotal() {
		double total = 0;
		for (Item item: this.items) {
			total = total + item.costo();
		}
		
		return total;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getCliente() {
		return cliente;
	}
	


}
