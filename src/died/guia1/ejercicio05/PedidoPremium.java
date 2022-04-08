package died.guia1.ejercicio05;

import java.util.ArrayList;

public class PedidoPremium extends Pedido{

	private final double $EXTRA_PRODUCTO = 0.20;
	private final double $EXTRA_PRODUCTO_5 = 0.30;
	
	public PedidoPremium() {
		
		this.productos = new ArrayList<Producto>();
		
	}
	
	public double precio() {
		
		double aux = 0.0;
		
		for(Producto i : this.productos)
			aux += i.getCosto();
		
		return aux;
		
	}
	
	public double comision() {
		
		double aux = 0.0;
		
		if(this.productos.size() <= 5)
			for(Producto i : this.productos)
				aux += i.getCosto() * this.$EXTRA_PRODUCTO;
		else
			for(Producto i : this.productos)
				aux += i.getCosto() * this.$EXTRA_PRODUCTO_5;
		
		return aux;
		
	}
	
}
