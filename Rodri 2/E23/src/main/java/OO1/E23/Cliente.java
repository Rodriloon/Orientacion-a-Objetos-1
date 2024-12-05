package OO1.E23;
import java.util.ArrayList;
import java.util.List;

import OO1.E21.Bolsa;

public class Cliente extends Persona{
	
	private List<Pedido> pedidos;
	
	
	public Cliente(String n, String d) {
		super(n, d);
		pedidos = new ArrayList<>();
	}
	
	public void agregarPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}
	
	public Bolsa<String> productosPorCategoria() {
		Bolsa<String> bag = new Bolsa<String>();
		this.pedidos.forEach(Pedido -> Pedido.agregarEnBag(bag));
	    return bag;
	}
	
}
