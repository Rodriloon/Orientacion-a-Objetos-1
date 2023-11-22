package oo1.ejercicio18_LiquidacionHaberes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModuloLiquidacion {
	private List<Empleado> empleados;
	
	public ModuloLiquidacion() {
		empleados = new ArrayList<Empleado>();
	}
	
	//Dar de alta un empleado
	public void darAltaEmpleado(String nombre,String apellido,int CUIL,String nacmiento,boolean conyuge,boolean hijos) {
		Empleado empleado = new Empleado(nombre,apellido,CUIL,nacmiento,conyuge,hijos,LocalDate.now());
		empleados.add(empleado);
	}
	
	//Buscar un empleado
	public Empleado buscarEmpleado(int CUIL) { 
		return empleados.stream()
				.filter(e -> e.coincideCuil(CUIL))
				.findFirst()
				.orElse(null);
	}
	
	//Dar de baja un empleado
	public void darBajaEmpleado(Empleado emp) {
		empleados.remove(emp);
	}
	
	//Cargar el contrato de un empleado
	public void cargarContratoPorHoras(Empleado empleado, LocalDate inicio, double valorHora, int horas, LocalDate fin) {
		Empleado emp = this.buscarEmpleado(empleado.getCUIL());
		emp.cargarContratoHoras(inicio,fin, valorHora, horas);
	}
	
	public void cargarContratoDePlanta(Empleado empleado, LocalDate inicio, double sueldo, double montoConyuge, double montoHijos) {
		Empleado emp = this.buscarEmpleado(empleado.getCUIL());
		emp.cargarContratoDePlanta(inicio, sueldo, montoConyuge, montoHijos);
	}
	
	//Obtener empleados con contratos vencidos
	public List<Empleado> obtenerContratosVencidos(){
		return empleados.stream()
				.filter(e -> e.contratoActualVencido())
				.collect(Collectors.toList());
	}

	//El sistema devuelve la lista de recibos, esta lista se almacena o no, en el caso de 
	//que no se almacene como seria la notacion en UML? 
	
	//Generar recibos de sueldo
	public List<Recibo> generarRecibos(){
		return empleados.stream()
				.filter(e -> e.contratoActualVencido() == false)
				.map(e -> e.generarRecibo())
				.collect(Collectors.toList());
		
	}
	
	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
}
