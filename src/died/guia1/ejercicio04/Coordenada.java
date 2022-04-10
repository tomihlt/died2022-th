package died.guia1.ejercicio04;

public class Coordenada {

	private double latitud, longitud;

	public Coordenada() {

		this.latitud = (double) 0;
		this.longitud = (double) 0;

	}

	public Coordenada(double latitud, double longitud) {

		this.latitud = latitud;
		this.longitud = longitud;

	}

	// g&s

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	public String toString() {
		
		return "Latitud: " + this.latitud + " Longitud: " + this.longitud ;
		
	}

}
