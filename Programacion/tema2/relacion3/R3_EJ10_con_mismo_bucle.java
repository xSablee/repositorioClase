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

public class R3_EJ10_con_mismo_bucle {
	private static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		int baseTrianguloImpar;
		String caracter;
		do {
			System.out.println("Introduzca base del trángulo (impar)");
			baseTrianguloImpar = Integer.parseInt(teclado.nextLine());
		} while (baseTrianguloImpar % 2 == 0 || baseTrianguloImpar <= 0);
		 System.out.println("Introduzca caracter");
		 caracter = teclado.nextLine();
		 
		 for (int i = 0; i < (baseTrianguloImpar/2+1); i++) {
			for (int j = (baseTrianguloImpar/2); j > i ; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2*i+1); j++) {
				System.out.print(caracter);
			}
			System.out.println();
		}

	}

}
