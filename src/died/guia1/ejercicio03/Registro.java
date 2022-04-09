package died.guia1.ejercicio03;

import java.util.ArrayList;
import died.guia1.ejercicio02.Temperatura;

public class Registro {

	private String ciudad;
	private ArrayList<Temperatura> historico;

	public Registro() {

		this.ciudad = "-";
		this.historico = new ArrayList<Temperatura>();

	}

	public Registro(String ciudad) {

		this.ciudad = ciudad;
		this.historico = new ArrayList<>();

	}

	public String getCiudad() {
		return ciudad;
	}

	public void imprimir() {

		System.out.println("TEMPERATURAS REGISTRADAS EN: " + this.ciudad);

		for (int i = 0; i < this.historico.size(); i++) {
			System.out.println((i + 1) + " " + historico.get(i).toString());
		}

	}

	public void agregar(Temperatura T) {

		if (this.historico.size() == 30)
			return;

		this.historico.add(T);

	}

	public double mediaAsCelcius() {

		double media = 0;

		for (int i = 0; i < this.historico.size(); i++)
			media += this.historico.get(i).asCelcius();

		if (this.historico.size() == 0)
			return 0.0;
		else
			return media / (this.historico.size());
	}

	public double mediaAsFahrenheit() {

		double media = 0;

		for (int i = 0; i < this.historico.size(); i++)
			media += this.historico.get(i).asFahrenheit();

		if (this.historico.size() == 0)
			return 0.0;
		else
			return media / (this.historico.size());

	}
	
	public Temperatura maximo() {
		
		Temperatura aux = this.historico.get(0);
		
		return this.maximo(aux, 1);
		
	}
	
	private Temperatura maximo(Temperatura t, int i) {
		
		if(i >= this.historico.size())
			return t;
		
		if(this.historico.get(i).asCelcius() > t.asCelcius())
			return this.maximo(this.historico.get(i), i+1);
		else
			if(i+1 > this.historico.size())
				return t;
			else
				return this.maximo(t, i+1);
		
	}

}
