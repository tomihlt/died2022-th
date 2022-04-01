package died.guia1.ejercicio02;

public class Temperatura {
	private double grados;
	private Escala escala;

	public Temperatura() {
		this.grados = 0;
		this.escala = Escala.CELCIUS;
	}

	public Temperatura(double grados, Escala escala) {
		this.grados = grados;
		this.escala = escala;
	}

	@Override
	public String toString() {

		switch (this.escala) {
			case CELCIUS :
				return Double.toString(this.grados).concat(" °C");
			case FAHRENHEIT :
				return Double.toString(this.grados).concat(" °F");
			default :
				return "NULL";
		}
	}

	public double getGrados() {
		return grados;
	}

	public Escala getEscala() {
		return escala;
	}

	public double asCelcius() {

		if (this.escala == Escala.FAHRENHEIT)
			return (this.grados - 32) * (5.0 / 9.0);
		else
			return this.grados;

	}

	public double asFahrenheit() {

		if (this.escala == Escala.CELCIUS)
			return ((this.grados) * (9.0 / 5.0)) + 32;
		else
			return this.grados;

	}

	public void setGrados(double grados) {
		this.grados = grados;
	}

	public void setEscala(Escala escala) {
		this.escala = escala;
	}

	public void aumentar(Temperatura T) {

		if (this.escala == T.getEscala()) {
			if (T.getGrados() > 0)
				this.grados += T.getGrados();
		} else {
			double aux;
			if (this.escala == Escala.CELCIUS)
				aux = T.asCelcius();
			else
				aux = T.asFahrenheit();
			if (aux > 0)
				this.grados += aux;
		}
	}

	public void disminuir(Temperatura T) {

		if (this.escala == T.getEscala()) {
			if (T.getGrados() > 0)
				this.grados -= T.getGrados();
		} else {
			double aux;
			if (this.escala == Escala.CELCIUS)
				aux = T.asCelcius();
			else
				aux = T.asFahrenheit();
			if (aux > 0)
				this.grados -= aux;
		}

	}

}