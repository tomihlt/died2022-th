package died.guia1.ejercicio01;

public class Recta {

	private float m, b;

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public void setM(float m) {
		this.m = m;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}

	private Punto p1, p2;

	public Recta() {

		this.m = 1;

		this.b = 0;

		this.p1 = new Punto(0, 0);

		this.p2 = new Punto(1, 1);

	}

	public Recta(Punto A, Punto B) {

		this.m = this.calcularPendiente(A, B);

		this.b = A.getY() - this.m * A.getX();

		this.p1 = A;

		this.p2 = B;

	}

	public Punto getP1() {
		return p1;
	}

	public Punto getP2() {
		return p2;
	}

	private float calcularPendiente(Punto A, Punto B) {

		return (B.getY() - A.getY()) / (B.getX() - A.getX());

	}

	public boolean equals(Recta A) {

		Recta aux = new Recta(A.getP1(), this.p1);

		if (aux.getM() == this.m)
			return true;
		else
			return false;

	}

	public float getM() {
		return m;
	}

}