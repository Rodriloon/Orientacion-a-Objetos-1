package oo1.ejercicio19_MercadoDeObjetos;

public class Pedido {
	private Producto producto;
	private int cantidadSolicitada;
	private FormaDePago pago;
	private TipoEnvio envio;
	
	public Pedido(Producto prod,int cantidad,FormaDePago pago,TipoEnvio envio){
		this.producto = prod;
		this.cantidadSolicitada = cantidad;
		this.envio = envio;
		this.pago = pago;
	}
	
	public double precioDelPedido() {
		return this.envio.costo() + this.pago.precioFinal(this.precioBase());
	}
	
	private double precioBase() {
		return this.producto.getPrecio() * this.cantidadSolicitada;
	}

}
