//3. Realizar un programa que solicite un número entero y determine el número de cifras que tiene dicho
//número.
//◦ Ejemplo:
//Introduce un número: 124
//El número 124 tiene 3 cifras

package programacion_tema_2;

import java.util.Scanner;

public class R3_3 {
	private static final int DIVISOR = 10;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		long numero, numeroDividido = 0;
		int cifras = 1;
		System.out.println("Introduzca número");
		numero = Integer.parseInt(teclado.nextLine());
		numeroDividido = numero;
		if (numero < 10) {
			System.out.println("El " + numero + " tiene un total de " + cifras + " cifras");
		} else {
			do {
				numeroDividido /= DIVISOR;
				cifras += 1;
			} while (numeroDividido > 10);
			System.out.println("El " + numero + " tiene un total de " + cifras + " cifras");
		}
	}
}
