package oo1.ejercicio19_MercadoDeObjetos;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
	private List<Pedido> pedidos;
	
	public Cliente(String nombre, String direccion) {
		super(nombre, direccion);
		pedidos = new ArrayList<Pedido>();
	}
	
	public void crearPedido(Producto prod,int cantidad,FormaDePago pago,TipoEnvio envio) {
		Pedido pedido = new Pedido(prod,cantidad,pago,envio);
		pedidos.add(pedido);
	}
	

}
