//8. Realizar un programa que solicite el ancho y el alto de un rectángulo, así como el carácter con el que
//se quiere dibujar. El programa pintará un rectángulo de dichas dimensiones con el carácter.
//◦ Ejemplo
//▪ Introduce el ancho: 5
//▪ Introduce el alto: 3
//▪ Carácter: *
//- *****
//- *****
//- *****

package relacion3;

import java.util.Scanner;

public class R3_EJ8 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int ancho, alto;
		String caracter;
		do {
			System.out.println("Introduce ancho del rectángulo");
			ancho = Integer.parseInt(teclado.nextLine());
		} while (ancho <= 0);
		do {
			System.out.println("Introduce alto del rectángulo");
			alto = Integer.parseInt(teclado.nextLine());
		} while (alto <= 0);
		System.out.println("Introduce el carácter con el que quieres pintar el rectángulo");
		caracter = teclado.nextLine();

		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print(caracter);
			}
			System.out.println(" ");
		}

		/*
		 * for (int i = 0; i < alto; i++) { 
		 * System.out.println(caracter.repeat(ancho));
		 * }
		 */

	}

}
