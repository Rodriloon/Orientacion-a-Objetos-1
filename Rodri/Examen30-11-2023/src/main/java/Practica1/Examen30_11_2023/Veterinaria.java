package Practica1.Examen30_11_2023;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
	
	private List<MedicoVet> medicos;
	private List<Mascota> mascotas;
	
	public Veterinaria() {
		this.medicos = new ArrayList<>();
		this.mascotas = new ArrayList<>();
	}
	
	public MedicoVet registrarMedicoVet(String nombre, LocalDate fecha, double honorarios) {
		MedicoVet med = new MedicoVet(nombre, fecha, honorarios);
		medicos.add(med);
		return med;
	}
	
	public Mascota registrarMascota(String nombre, LocalDate fecha, String especie) {
		Mascota mas = new Mascota(nombre, fecha, especie);
		mascotas.add(mas);
		return mas;
	}
	
	public Consulta registrarConsultaMedica(MedicoVet med, Mascota mas) {
		return mascotas.stream().filter(m -> m.getNombre() == mas.getNombre())
								.filter(m -> m.getFecha() == mas.getFecha())
								.filter(m -> m.getEspecie() == mas.getEspecie())
						 		.findFirst()
						 		.map(m -> m.agregarConsulta(med))
						 		.orElse(registrarMascota(mas.getNombre(), mas.getFecha(), mas.getEspecie()).agregarConsulta(med));
	}
	
	public Vacunacion registrarVacunacion(MedicoVet med, Mascota mas, String nomVac, double costo) {
		return mascotas.stream().filter(m -> m.getNombre() == mas.getNombre())
								.filter(m -> m.getFecha() == mas.getFecha())
								.filter(m -> m.getEspecie() == mas.getEspecie())
		 						.findFirst()
		 						.map(m -> m.agregarVac(med, nomVac, costo))
		 						.orElse(registrarMascota(mas.getNombre(), mas.getFecha(), mas.getEspecie()).agregarVac(med, nomVac, costo));
	}
	
	public Guarderia registrarGuarderia(Mascota mas, int cant) {
		return mascotas.stream().filter(m -> m.getNombre() == mas.getNombre())
								.filter(m -> m.getFecha() == mas.getFecha())
								.filter(m -> m.getEspecie() == mas.getEspecie())
								.findFirst()
								.map(m -> m.agregarGuard(cant))
								.orElse(registrarMascota(mas.getNombre(), mas.getFecha(), mas.getEspecie()).agregarGuard(cant));
	}
	
	public double recaudacionPorCachorros(LocalDate diaCach) {
		return mascotas.stream().filter(m -> m.esCachorro(diaCach) == true)
								.mapToDouble(m -> m.RecaudacionPorFecha(diaCach))
								.sum();
	}
	
}
