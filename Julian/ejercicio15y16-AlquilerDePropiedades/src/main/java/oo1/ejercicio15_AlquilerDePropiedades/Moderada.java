package oo1.ejercicio15_AlquilerDePropiedades;

import java.time.LocalDate;

public class Moderada implements PoliticaDeRemplazo{

	@Override
	public double devolver(Reserva reserva, LocalDate fecha) {
		double valor = 0;
		if (reserva.esAnterior(fecha)) {
			if (reserva.diferenciaDias(fecha) >= 7) valor = reserva.getMontoIngresos();
			else if (reserva.diferenciaDias(fecha) >= 2) valor = reserva.getMontoIngresos() * 0.5;
		}
		return valor;
	}

}
