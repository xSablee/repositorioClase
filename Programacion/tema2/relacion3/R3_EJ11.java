//11. Realizar un programa que solicite la base de un rombo (debe ser un número impar) así como un
//carácter. El programa pintará por pantalla un rombo con esa base de esta forma.
//◦ Introduce la base (impar) : 7
//▪ *
//▪ ***
//▪ *****
//▪ *******
//▪ *****
//▪ ***
//▪ *

package relacion3;

import java.util.Scanner;

public class R3_EJ11 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int baseTrianguloImpar;
		double contadorCaracteres, contadorTabulaciones;
		do {
			System.out.println("Introduzca base del trángulo (impar)");
			baseTrianguloImpar = Integer.parseInt(teclado.nextLine());
		} while (baseTrianguloImpar % 2 == 0 || baseTrianguloImpar <= 0);

		for (int i = 0; i < (baseTrianguloImpar / 2 + 1); i++) {
			contadorTabulaciones = i;
			while (contadorTabulaciones < baseTrianguloImpar / 2) {
				System.out.print(" ");
				contadorTabulaciones++;
			}
			contadorCaracteres = 0;
				do {
					System.out.print("*");
					contadorCaracteres += 0.5;
				} while (contadorCaracteres<=i);
				System.out.println();
			}
		for (int i = 0; i < baseTrianguloImpar / 2; i++) {
			contadorTabulaciones = 0;
			do {
				System.out.print(" ");
				contadorTabulaciones++;
			} while (contadorTabulaciones <= i);
			contadorCaracteres = i+1;
			do {
				System.out.print("*");
				contadorCaracteres += 0.5;
			} while (contadorCaracteres <= baseTrianguloImpar/2);
			System.out.println();
		}
	}
}
