package oo1.ejercicioAD2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AgenciaRecaudacion {
	private List<Contribuyente> contribuyentes;
	
	public AgenciaRecaudacion() {
		this.contribuyentes = new ArrayList<Contribuyente>();
	}
	
	public Contribuyente altaContribuyente(String nombre, int dni, String mail, String localidad) {
		Contribuyente c = new Contribuyente(nombre,dni,mail,localidad);
		this.contribuyentes.add(c);
		return c;
	}
	
	public Inmueble altaInmueble(int numero, double valorLote, double valorEdificacion,Contribuyente c) {
		Inmueble i = new Inmueble(numero,valorLote,valorEdificacion);
		c.cargarPropiedad(i);
		return i;
	}
	
	public Automotor altaAutoMotor(int patente, String marca, String modelo,LocalDate fabricacion,Contribuyente c,double valor ) {
		Automotor a = new Automotor(patente,fabricacion,marca,modelo,valor);
		c.cargarPropiedad(a);
		return a;
	}
	
	public Embarcacion altaEmbarcacion(int patente, String nombre,double valor,LocalDate fabricacion,Contribuyente c) {
		Embarcacion e = new Embarcacion(patente,fabricacion,valor,nombre);
		c.cargarPropiedad(e);
		return e;
	}
	
	public double calcularImpuesto(Contribuyente c) {
		return c.calcularImpuesto();
	}
	
	public List<Contribuyente> contribuyentesMasPagan(String localidad, int N) {
		return this.contribuyentes.stream()
				.filter(c -> c.isLocalidad(localidad))
				.sorted((c1,c2)->Double.compare(c1.calcularImpuesto(),c2.calcularImpuesto()))
				.limit(N)
				.collect(Collectors.toList());
	}
}
