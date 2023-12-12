package Practica1.E18;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
	
	private String nombre;
	private String apellido;
	private int cuil;
	private LocalDate nacimiento;
	private boolean conyuge;
	private boolean hijos;
	private LocalDate inicio;
	private Contrato contratoAct;
	private List<Contrato> contratos;
	
	public Empleado (String nom, String ape, int cu, LocalDate nacimiento, boolean con, boolean h, LocalDate i) {
		this.nombre = nom;
		this.apellido = ape;
		this.cuil = cu;
		this.nacimiento = nacimiento;
		this.conyuge = con;
		this.hijos = h;
		this.inicio = i;
		this.contratoAct = null;
		this.contratos = new ArrayList<>();
	}
	
	public int getCuil() {
		return this.cuil;
	}
	
	public Contrato contraActivo() {
		return this.contratoAct;
	}
	
	public boolean coincideCuil(int cu) {
		return this.cuil == cu;
	}
	
	public void agregarContratoHoras(Hora conH) {
		contratoAct.modificarEstado();
		if (this.contratoAct != null) {
			if (conH.diferenciaDias() < this.contratoAct.diferenciaDias()) 
				this.contratoAct = conH;
		}
		else 
			this.contratoAct = conH;
		conH.modificarEstado();
		contratos.add(conH);
	}
	
	public void agregarContratoPlanta(Planta conP) {
		if (contratoAct.getEstado() == true)
			contratoAct.modificarEstado();
		contratoAct = conP;
		conP.modificarEstado();
		contratos.add(conP);
	}
	
	private int getAntigueadad() {
		return LocalDate.now().getYear() - this.inicio.getYear();
	}
	
	public Recibo generarRecibo() {
		Recibo recibo = new Recibo(this.nombre, this.apellido, this.cuil, this.getAntigueadad(),LocalDate.now(),this.contratoAct.montoACobrar());
		return recibo;
	}
	
}
