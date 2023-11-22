package oo1.ejercicio19_MercadoDeObjetos;

public class AlContado implements FormaDePago {
	
	public AlContado() {
		
	}

	@Override
	public double precioFinal(double precioPedido) {
		return precioPedido;
	}

}
