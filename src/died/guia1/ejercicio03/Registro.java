package died.guia1.ejercicio03;

import died.guia1.ejercicio02.Temperatura;

public class Registro {

	private String ciudad;
	private Temperatura[] historico;
	private int FULL, EMPTY; // FULL indica la cantidad de registros que hay,
								// EMPTY la cantidad que tengo vacío en el array

	public Registro() {

		this.ciudad = "-";
		this.EMPTY = 30;
		this.FULL = 0;

	}

	public Registro(String ciudad) {

		this.ciudad = ciudad;
		this.EMPTY = 30;
		this.FULL = 0;

	}

	public String getCiudad() {
		return ciudad;
	}

	public Temperatura[] getHistorico() {
		return historico;
	}

	public int getFULL() {
		return FULL;
	}

	public int getEMPTY() {
		return EMPTY;
	}

	public void imprimir() {

		for (int i = 0; i < FULL; i++) {
			System.out.println("TEMPERATURAS REGISTRADAS EN: " + this.ciudad);
			System.out.println((i + 1) + historico[i].toString());
		}

	}

	public void agregar(Temperatura T) {

		if (this.EMPTY == 0)
			return;

		this.historico[FULL] = T;

		this.EMPTY--;
		this.FULL++;

	}

}
