package OO1.E23;
import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona{
	
	private List<Producto> productos;

	
	public Vendedor(String n, String d) {
		super(n, d);
		productos = new ArrayList<>();
	}
	
	public void agregarProductoVenta(Producto producto) {
		this.productos.add(producto);
	}
	
	
}
