//2. Realizar un programa que solicite dos números, base y exponente, enteros positivos (incluido el 0), y
//que calcule la potencia (base elevado a exponente) a través de productos. Si los datos son incorrectos
//deberán volverse a solicitar.

package relacion3;

import java.util.Scanner;

public class R3_EJ2 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int base;
		int exponente;
		int baseAcumulada;
		do {
			System.out.println("Introduzca número base");
			base = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduzca número exponente");
			exponente = Integer.parseInt(teclado.nextLine());
			baseAcumulada = base;
		} while (base < 0 && exponente < 0);
		if (exponente > 0) {
			for (int i = 1; i < exponente; i++) {
				baseAcumulada *= base;
			}
		} else {
			baseAcumulada = base - (base - 1);
		}
		System.out.println("El " + base + " elevado a " + exponente + " es igual a " + baseAcumulada);
	}

}
