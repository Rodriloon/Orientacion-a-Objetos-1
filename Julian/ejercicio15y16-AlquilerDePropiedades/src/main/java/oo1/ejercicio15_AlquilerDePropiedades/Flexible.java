package oo1.ejercicio15_AlquilerDePropiedades;

import java.time.LocalDate;

public class Flexible implements PoliticaDeRemplazo{

	@Override
	public double devolver(Reserva reserva, LocalDate fecha) {
		if (reserva.esAnterior(fecha)) return reserva.getMontoIngresos();
		else return 0;
	}

}
