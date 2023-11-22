package oo1.ejercicio19_MercadoDeObjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {
	private List<Cliente> clientes;
	private List<Persona> vendedores;
	private List<Producto> productos;
	
	public Sistema() {
		clientes = new ArrayList<Cliente>();
		vendedores = new ArrayList<Persona>();
		productos = new ArrayList<Producto>();
	}
	
	//Registrar un vendedor
	public Persona registrarVendedor(String nombre, String direccion) {
		Persona v = new Persona(nombre,direccion);
		vendedores.add(v);
		return v;
	}
	
	//Buscar un vendedor
	public Persona buscarVendedor(String nombre) {
		return vendedores.stream()
				.filter(v -> v.coincide(nombre))
				.findFirst().orElse(null);
	}
	
	//Registrar un cliente
	public Cliente registrarCliente(String nombre, String direccion) {
		Cliente c = new Cliente(nombre,direccion);
		clientes.add(c);
		return c;
	}
	
	//Buscar un cliente
	public Cliente buscarCliente(String nombre) {
		return clientes.stream()
				.filter(c -> c.coincide(nombre))
				.findFirst().orElse(null);
	}
	
	//Poner un producto a la venta
	public Producto ponerProductoALaVenta(String nombre,String descripcion,double precio,int stock,Persona vendedor) {
		Producto p = new Producto(nombre,descripcion,precio,stock,vendedor);
		productos.add(p);
		return p;
	}
	
	//Buscar un producto
	public List<Producto> buscarProducto(String nombre){
		return productos.stream()
				.filter(p -> p.coincide(nombre))
				.collect(Collectors.toList());
	}
	
	//Crear un pedido
	public boolean crearPedido(Cliente cliente, Producto producto, int cantidad, FormaDePago pago, TipoEnvio envio) {
		Cliente cli = this.buscarCliente(cliente.getNombre());  //hay que considerar que el producto puede no estar en la lista de productos a la venta? 
		if (cli == null) return false;
		if (producto.verificarStock(cantidad)) {
			cli.crearPedido(producto, cantidad, pago, envio);
			return true;
		}
		else { return false; }
	}
	
	//Calcular el costo total de un pedido
	public double calcularCostoTotal(Pedido pedido) {
		return pedido.precioDelPedido();
	}
	
}
