package programacion_tema_2;

import java.util.Scanner;

public class Actividad_1_6 {
	private static final int LIMITE_B = 89;
	private static final int LIMITE_C = 79;
	private static final int LIMITE_D = 69;
	private static final int LIMITE_F = 59;
	private static final int MAXIMO_CALIFICACION = 100;
	private static final int MINIMO_CALIFICACION = 0;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int calificacion;
		do {
			System.out.println("Inserte su califación numérica (1-100)");
			calificacion = Integer.parseInt(teclado.nextLine());
		} while (calificacion > MAXIMO_CALIFICACION || calificacion < MINIMO_CALIFICACION);

		if (calificacion <= LIMITE_F) {
			System.out.println("Su " + calificacion + " es una F");
		} else if (calificacion <= LIMITE_D) {
			System.out.println("Su " + calificacion + " es una D");
		} else if (calificacion <= LIMITE_C) {
			System.out.println("Su " + calificacion + " es una C");
		} else if (calificacion <= LIMITE_B) {
			System.out.println("Su " + calificacion + " es una B");
		} else {
			System.out.println("Su " + calificacion + " es una A");
		}
	}
}
