package oo1.ejercicio8_distribuidoraElectrica;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distribuidora {
	private double precioKWh;
	private List <Usuario> usuarios;
	
	public Distribuidora(double precio) {
		this.precioKWh = precio;
		this.usuarios = new ArrayList<>();
	}
	
	public void agregarUsuario(Usuario otroUsuario) {
		this.usuarios.add(otroUsuario);
	}
	
	public List<Usuario> getUsuarios(){
		return usuarios;
	}
	
	public double consumoTotalActiva() {
		return usuarios.stream()
				.mapToDouble(u -> u.ultimoConsumoActiva())
				.sum();
	}
	
	public List<Factura> facturar(){
		return usuarios.stream()
				.map(u -> u.facturarEnBaseA(this.getPrecioKW()))
				.collect(Collectors.toList()); 
		
	}

	public double getPrecioKW() {
		return precioKWh;
	}

}
