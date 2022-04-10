package died.guia1.ejercicio04;

import java.util.ArrayList;

public class Camino {
	
	private ArrayList<Coordenada> destinos;
	
	public Camino() {
		
		this.destinos = new ArrayList<Coordenada>();
		
	}
	
	public void agregar(Coordenada x) {
		
		this.destinos.add(x);
		
	}
	
	public void agregar(double lat, double lng) {
		
		Coordenada aux = new Coordenada(lat,lng);
		
		this.destinos.add(aux);
		
	}
	
	public void agregar(int mtslat, int mtslng) {
		
		// No se como se calcula
		
	}
	
	public ArrayList<Coordenada> buscar(Coordenada no, Coordenada se){
		
		double x0 = no.getLongitud();
		double x1 = se.getLongitud();
		double y0 = no.getLatitud();
		double y1 = se.getLatitud();
		
		ArrayList<Coordenada> aux = new ArrayList<Coordenada>();
		
		for(Coordenada i : this.destinos)
			
			if ( i.getLongitud() <= x1 & i.getLongitud() >= x0 & i.getLatitud() <= y0 & i.getLatitud() >= y1)
				aux.add(i);
		
		return aux;
		
	}
	
	public ArrayList<Coordenada> buscar(Coordenada cord, double radio){
		
		double x0 = cord.getLongitud();
		double y0 = cord.getLatitud();
		
		ArrayList<Coordenada> aux = new ArrayList<Coordenada>();
		
		for(Coordenada i : this.destinos)
			
			// Raiz de : (x0 - x1)^2 + (y0 - y1)^2
			if( Math.sqrt(Math.pow((x0 - cord.getLongitud()), 2) + Math.pow((y0 - cord.getLatitud()), 2)) <= radio)
				
				aux.add(i);
				
		return aux;
		
	}
	
	
	
}
