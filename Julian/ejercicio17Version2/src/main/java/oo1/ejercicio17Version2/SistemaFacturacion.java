package oo1.ejercicio17Version2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SistemaFacturacion {
	private List<Cliente> clientes;
	private List<Integer> numeros;
	
	public SistemaFacturacion() {
		this.clientes = new ArrayList<Cliente>();
		this.numeros = new ArrayList<Integer>();
	}
	
	public void agregarNumero(Integer numero) {
		this.numeros.add(numero);
	}
	
	public Fisico altaPersonaFisica(String nombre, String direccion, int dni) {
		Integer numero = this.numeros.remove(0);
		Fisico cliente = new Fisico(nombre,direccion,dni,numero);
		this.clientes.add(cliente);
		return cliente;
	}
	
	public Juridico altaPersonaJuridica(String nombre, String direccion, int cuil, String tipo) {
		Integer numero = this.numeros.remove(0);
		Juridico cliente = new Juridico(nombre,direccion,numero,cuil,tipo);
		this.clientes.add(cliente);
		return cliente;
	}
	
	public Local registrarLlamadaLocal(LocalDate fecha,LocalTime hora,int duracion, Integer emisor, Integer receptor) {
		Local call = new Local(fecha,hora,duracion,emisor,receptor);
		this.buscarCliente(emisor).agregarLlamada(call);
		return call;
	}
	
	
	public Interurbana registrarLlamadaInterurbana(LocalDate fecha,LocalTime hora,int duracion, Integer emisor, Integer receptor,int distancia) {
		Interurbana call = new Interurbana(fecha,hora,duracion,emisor,receptor,distancia);
		this.buscarCliente(emisor).agregarLlamada(call);
		return call;
	}
	
	
	public Internacional registrarLlamadaInternacional(LocalDate fecha,LocalTime hora,int duracion, Integer emisor, Integer receptor,String paisOrigen,String paisDestino) {
		Internacional call = new Internacional(fecha,hora,duracion,emisor,receptor,paisOrigen,paisDestino);
		this.buscarCliente(emisor).agregarLlamada(call);
		return call;
	}
	
	public Factura facturarLlamadas(Cliente cli, LocalDate inicio, LocalDate fin) {
		return cli.facturar(inicio, fin);
	}
	
	public Cliente buscarCliente(Integer numero) {
		return this.clientes.stream()
				.filter(cli -> cli.coincidenNumeros(numero))
				.findFirst().orElse(null);
	}

}
