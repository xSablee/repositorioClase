//10. Realizar un programa que solicite la base de un triángulo (debe ser un número impar) así como un
//carácter. El programa pintará por pantalla un triángulo con esa base de esta forma.
//◦ Introduce la base (impar) : 7
//▪ *
//▪ ***
//▪ *****
//▪ *******
//◦ Realiza una segunda versión del programa para que el triángulo tenga esta forma.
//◦ Introduce la base (impar) : 7
//▪ *
//▪ ***
//▪ *****
//▪ ****** 

package relacion3;

import java.util.Scanner;

public class R3_EJ10 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Versión 1
		/*
		 * int baseTrianguloImpar, contador; do {
		 * System.out.println("Introduzca base del trángulo (impar)");
		 * baseTrianguloImpar = Integer.parseInt(teclado.nextLine()); } while
		 * (baseTrianguloImpar%2 == 0 || baseTrianguloImpar<=0 );
		 * 
		 * for (int i = 0; i < baseTrianguloImpar; i += 2) { System.out.print("*");
		 * contador = 0; while (contador<i) { System.out.print("*"); contador++; }
		 * System.out.println(); }
		 */

		// Versión 2
		int baseTrianguloImpar, contadorTabulaciones, contador;

		do {
			System.out.println("Introduzca base del trángulo (impar)");
			baseTrianguloImpar = Integer.parseInt(teclado.nextLine());
		} while (baseTrianguloImpar % 2 == 0 || baseTrianguloImpar <= 0);
		for (int i = 0; i < baseTrianguloImpar; i+=2) {
			contadorTabulaciones = i/2;
			while (contadorTabulaciones < baseTrianguloImpar/2) {
				System.out.print(" ");
				contadorTabulaciones++;
			}
				System.out.print("*");
				contador = 0;
				while (contador < i) {
					System.out.print("*");
					contador++;
				}
				System.out.println();
			}
		}
	}
