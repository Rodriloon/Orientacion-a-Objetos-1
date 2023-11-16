package Practica1.E8;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nombre;
	private String domicilio;
	private List<Consumo> consumos;
	private List<Factura> facturas;
	
	public Usuario (String nombre, String direccion) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.consumos = new ArrayList<>();
		this.facturas = new ArrayList<>();
	}
	
	public void agregarMedicion(Consumo unConsumo) {
		this.consumos.add(unConsumo);
	}
	
	public Consumo ultimoConsumo() {
		return consumos.stream()
				.max((fe1, fe2) -> fe1.getFecha()
				.compareTo(fe2.getFecha())).orElse(null);
	}
		
	
	public double ultimoConsumoActiva() {
		return this.ultimoConsumo()!=null ? this.ultimoConsumo().getConsumoEnergiaActiva() : 0;
	}
	
	public Factura facturarEnBaseA(double precioKw) {
		Factura f = new Factura(this.ultimoConsumoActiva() * precioKw,this.descuento(),this);
		facturas.add(f);
		return f;
	}

	private double descuento() {
        double descuento = 0;
        if (this.ultimoConsumoActiva() != 0)
        	if (this.ultimoConsumo().factorDePotencia() > 0.8) {
            descuento = 10;
        }
        return descuento;
    }
	
	public List<Factura> facturas(){
		return facturas;
	}
	
}