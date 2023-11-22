package oo1.ejercicio19_MercadoDeObjetos;

public class Cuotas implements FormaDePago{
	
	public Cuotas() {
		
	}

	@Override
	public double precioFinal(double precioPedido) {
		return precioPedido + this.incremento(precioPedido);
	}
	
	private double incremento(double precioPedido){
		return precioPedido * 0.2;
	}

}
