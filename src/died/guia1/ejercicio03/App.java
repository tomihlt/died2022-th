package died.guia1.ejercicio03;

import died.guia1.ejercicio02.Escala;
import died.guia1.ejercicio02.Temperatura;

public class App {

	public static void main(String[] args) {

		Registro aux = new Registro("Santa Fe");
		Temperatura taux = new Temperatura(20, Escala.CELCIUS);
		Temperatura taux2 = new Temperatura(10, Escala.CELCIUS);

		aux.agregar(taux);
		aux.agregar(taux2);
		aux.imprimir();
		System.out.println("Media en C: " + aux.mediaAsCelcius());

	}

}
