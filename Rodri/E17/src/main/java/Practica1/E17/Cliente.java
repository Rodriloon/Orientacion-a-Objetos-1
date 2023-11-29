package Practica1.E17;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	
	private String nombre;
	private String direccion;
	private int numero;
	private List<Llamada> llamadas;
	private List<Factura> facturas;
	
	public Cliente(String nombre, String direccion, int numero) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.numero = numero;
		llamadas = new ArrayList<>();
		facturas = new ArrayList<>();
	}
	
	public void agregarLlamada(Llamada ll) {
		llamadas.add(ll);
	}
	
	public void agregarFactura(Factura f) {
		facturas.add(f);
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public abstract double descuento(double monto);
	
	private double montoTotalisimo(LocalDate desde, LocalDate hasta) {
		return llamadas.stream()
								.filter(l -> l.comparoFecha(desde, hasta))
								.mapToDouble(l -> l.costo())
								.sum();
	}
	
	public double montoConDescuento(LocalDate desde, LocalDate hasta) {
		double monto = this.montoTotalisimo(desde, hasta);
		return this.descuento(monto);
	}
}
