package died.guia1.ejercicio05;

import java.util.ArrayList;

public abstract class Pedido {

	protected ArrayList<Producto> productos;
	
	public abstract double precio();
	public abstract double comision();
	
	
	public boolean agregarProducto(Producto p) {
		// Se cambio la consigna a que no hay limite de productos a pedir
		this.productos.add(p);
		
		return true;
		
	}
	
	public int cantProductos() {
		
		return this.productos.size();
		
	}
	
	
	
}
