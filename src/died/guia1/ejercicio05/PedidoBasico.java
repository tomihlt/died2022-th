package died.guia1.ejercicio05;

import java.util.ArrayList;

public class PedidoBasico extends Pedido{
	
	private boolean esExpress = false;
	private final double $EXTRA_PRODUCTO = 0.05;
	private final double $EXTRA_EXPRESS = 0.20;
	
	public PedidoBasico() {
		
		this.productos = new ArrayList<Producto>();
		
	}
	
	public void mkExpress() {
		
		this.esExpress = true;
		
	}
	
	public double precio() {
		
		double aux = 0.0;
		
		for (Producto i : this.productos)
			aux += i.getCosto();
		
		return aux;
	}
	
	
	
	public double comision() {
		
		double aux = 0.0;
		
		for(Producto i : this.productos)
			aux += ( i.getCosto() * this.$EXTRA_PRODUCTO );
		
		return this.esExpress ? ((this.precio() + aux) * this.$EXTRA_EXPRESS) - this.precio() : aux;
		
	}
	
	
	
}
