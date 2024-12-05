package OO1.E23;
import OO1.E21.Bolsa;

public class Pedido {
	
	private Pago formaPago;
	private Envio formaEnvio;
	private Producto unProducto;
	private int cantSolicitada;
	private Cliente cliente;
	private Vendedor vendedor;
	
	
	public Pedido(Cliente cliente, Pago formaPago, Envio formaEnvio, Producto unProducto, int cantSolicitada) {
		this.cliente = cliente;
		this.formaPago = formaPago;
		this.formaEnvio = formaEnvio;
		this.unProducto = unProducto;
		this.cantSolicitada = cantSolicitada;
	}
	
	public double getCostoPedido() {
		double precioBase = this.cantSolicitada * this.unProducto.getPrecio();
		return this.formaPago.calcularCostoPago(precioBase) + this.formaEnvio.calcularCostoEnvio(this.vendedor.getDireccion(), this.cliente.getDireccion());
	}
	
	public String getCategoria() {
		return this.unProducto.getCategoriaProducto();
	}
	
	public void agregarEnBag(Bolsa<String> bag) {
		bag.add(this.unProducto.getCategoriaProducto());
	}
	
}
