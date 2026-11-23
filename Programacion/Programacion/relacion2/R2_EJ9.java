//9. Realizar un programa que lea un número entero positivo y averigüe si es perfecto. Un número es
//perfecto cuando es igual a la suma de sus divisores excepto él mismo. Diseñar el programa de forma
//que si algún dato es incorrecto vuelva a solicitarse.
//Ejemplo:
//El número 6 es perfecto porque es igual que 1+2+3=6
//El número 8 no es perfecto porque 1+2+4=7

package relacion2;

import java.util.Scanner;

public class R2_EJ9 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int numero, numeroAcumulado = 0;
		String respuestaPerfecto;
		do {
			System.out.println("Inserte número que desea averiguar si es perfecto:");
			numero = Integer.parseInt(teclado.nextLine());
		} while (numero <= 0);
		for (int i = 1; i <= (numero / 2); i++) {
			if (numero % (i) == 0) {
				numeroAcumulado += i;
			}
		}
		if (numero == numeroAcumulado) {
			respuestaPerfecto = "El número " + numero + " es perfecto";
		} else {
			respuestaPerfecto = "El número " + numero + " no es perfecto";
		}
		System.out.println(respuestaPerfecto);
	}

}
