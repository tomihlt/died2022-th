package died.guia1.ejercicio01;

public class App {

	public static void main(String[] args) {

		Punto p1 = new Punto(1, 1);
		Punto p2 = new Punto(2, 2);
		Recta r1 = new Recta(p1, p2);

		System.out.println("Pendiente r1: " + r1.getM());

		Punto p3 = new Punto(3, 3);
		Recta r2 = new Recta(p2, p3);

		System.out.println("Recta r1=r2?: " + r1.equals(r2));

	}

}
