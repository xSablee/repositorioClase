//10. Realizar un programa que solicite un número entero positivo o cero y calcule su factorial. Diseñar el
//programa de forma que si algún dato es incorrecto vuelva a solicitarse.
//Explicación:
//Factorial (0)=1
//Factorial (1)=1
//Factorial (N)=N* (N-1)* (N-2)* …......1

package programacion_tema_2;

import java.util.Scanner;

public class R2_EJ10 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int numero, numeroFactorial = 1;
		do {
			System.out.println("Inserte número que desea saber su factorial (mayor o igual a 0)");
			numero = Integer.parseInt(teclado.nextLine());
		} while (numero < 0);

		for (int i = 1; i <= numero; i++) {
			numeroFactorial *= i;
		}
		System.out.println("El factorial de " + numero + " es igual a " + numeroFactorial);
	}

}
