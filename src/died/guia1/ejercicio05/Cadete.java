package died.guia1.ejercicio05;

import java.util.ArrayList;

public class Cadete {
	
	private ArrayList<Pedido> pedidos;
	
	public Cadete() {
		
		this.pedidos = new ArrayList<Pedido>();
		
	}
	
	public void agregarPedido(Pedido p) {
		
		this.pedidos.add(p);
		
	}
	
	public double comisiones() {
		
		double aux = 0.0;
		
		for(Pedido i : this.pedidos)
			
			if(i instanceof PedidoBasico)
				aux += ((i.precio() + i.comision()) * 0.10) + i.comision();
			else
				if(i.cantProductos() > 5)
					aux += ((i.precio() + i.comision()) *0.15) + i.comision();
				else 
					aux += ((i.precio() + i.comision()) *0.15) + i.comision() + 50;
					
		return aux;
		
	}
	
}
