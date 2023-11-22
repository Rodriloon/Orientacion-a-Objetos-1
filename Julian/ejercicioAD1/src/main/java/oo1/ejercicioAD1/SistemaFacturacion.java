package oo1.ejercicioAD1;

import java.util.ArrayList;
import java.util.List;

public class SistemaFacturacion {
	private double precioResidencial;
	private double precioIndustrial;
	private List<Cliente> clientes;
	
	public SistemaFacturacion() {
		//hace falta declarar los precios en 0? 
		clientes = new ArrayList<Cliente>();
	}
	
	public Residencial altaClienteResidencial(String nombre,String apellido, String direccion) {
		Residencial r = new Residencial(nombre,apellido,direccion);
		clientes.add(r);
		return r;
	}
	
	public Industrial altaClienteIndustrial(String nombre, String direccion) {
		Industrial i = new Industrial(nombre,direccion);
		clientes.add(i);
		return i;
	}
	
	public Medicion registrarMedicion(Cliente c, int unidades, int mes, int año) {
		Medicion m = new Medicion(unidades,mes,año);
		c.agregarMedicion(m);
		return m;
	}
	
	public void actualizarTarifas(double residencial,double industrial) {
		this.precioIndustrial = industrial;
		this.precioResidencial = residencial;
	}
	
	public double calcularMontoAFacturar(Cliente c, int mes, int año) {
		return c.calcularConsumo(this.precioResidencial, this.precioIndustrial, mes, año);
	}
	
	public double getPrecioClientes() {
		return this.precioResidencial;
	}
	public double getPrecioIndustrial() {
		return this.precioIndustrial;
	}
}
