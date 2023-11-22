package oo1.ejercicio18_LiquidacionHaberes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
	private String nombre;
	private String apellido;
	private int CUIL;
	private String nacimiento;
	private boolean conyuge;
	private boolean hijos;
	private Contrato contratoActual;
	private List<Contrato> contratos;
	private LocalDate fechaInicioRelacionLaboral;
	
	public Empleado(String nombre, String apellido, int cUIL, String nacimiento, boolean conyuge, boolean hijos, LocalDate fechaInicioRelacionLaboral) {
		this.nombre = nombre;
		this.apellido = apellido;
		CUIL = cUIL;
		this.nacimiento = nacimiento;
		this.conyuge = conyuge;
		this.hijos = hijos;
		this.fechaInicioRelacionLaboral = fechaInicioRelacionLaboral;
		contratos = new ArrayList<Contrato>();
	}
	
	public void cargarContratoHoras(LocalDate inicio,LocalDate fin, double valorHora, int horas) {
		
		ContratoPorHoras contrato = new ContratoPorHoras(this,inicio,fin,valorHora,horas);
		this.agregarContrato(contrato);
	}
	
	public void cargarContratoDePlanta(LocalDate inicio, double sueldo, double montoConyuge, double montoHijos) {
		montoConyuge = this.asignarMontoPorConyuge(montoConyuge);
		montoHijos = this.asignarMontoPorHijo(montoHijos);
		ContratoDePlanta contrato = new ContratoDePlanta(this,inicio,sueldo,montoConyuge,montoHijos);
		this.agregarContrato(contrato);
	}
	
	private void agregarContrato(Contrato contrato) {
		contratos.add(contrato);
		this.actualizarContrato(contrato);	
	}
	
	private void actualizarContrato(Contrato contrato) {
		System.out.println("Entro");
		if (!contrato.isVencido()) {
			System.out.println("No esta VENCIDO");

			if (this.contratoActual != null) {
				if (contrato.diferenciaDias() < this.contratoActual.diferenciaDias()) this.contratoActual = contrato;
			}else this.contratoActual = contrato;
		}
	}
	
	public boolean coincideCuil(int cuil) {
		return cuil == this.CUIL;
	}

	public int getCUIL() {
		return CUIL;
	}
	
	public boolean contratoActualVencido() {
		return this.contratoActual.isVencido();
	}
	
	private int getAntigueadad() {
		return LocalDate.now().getYear() - this.fechaInicioRelacionLaboral.getYear();
	}
	
	private double asignarMontoPorConyuge(double monto) {
		if (this.conyuge) return monto;
		else return 0;
	}
	
	private double asignarMontoPorHijo(double monto) {
		if (this.hijos) return monto;
		else return 0;
	}
	
	public Recibo generarRecibo() {
		Recibo recibo = new Recibo(this.nombre, this.apellido, this.CUIL, this.getAntigueadad(),LocalDate.now(),this.contratoActual.montoACobrar());
		return recibo;
	}

	public Contrato getContratoActual() {
		return contratoActual;
	}

	
}

