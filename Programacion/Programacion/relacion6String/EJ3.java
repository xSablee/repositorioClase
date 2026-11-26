//Escribir un programa que lea una cadena de caracteres por teclado, y
//determine si es un palíndromo o no.
//Se denomina palíndromo, a una palabra o frase que, ignorando los
//blancos, se lee igual de izquierda a derecha que de derecha a izquierda.
//Por ejemplo: "anilina" ó "dabale arroz a la zorra el abad". Para simplificar
//el problema, puedes suponer que se usan caracteres simples, es decir,
//sin tildes ni diéresis.
package relacion6String;

import java.util.Scanner;

public class EJ3 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String introducidoPorUsuario;
		boolean esPalindromo;

		System.out.println("Introduzca la frase que quiera saber si es palíndromo:");
		introducidoPorUsuario = teclado.nextLine();

		esPalindromo = saberSiEsPalindromo(introducidoPorUsuario);

		if (esPalindromo) {
			System.out.println("La frase introducida: '" + introducidoPorUsuario + "' es palíndromo");
		} else {
			System.out.println("La frase introducida: '" + introducidoPorUsuario + "' no es palíndromo");
		}
	}

	private static boolean saberSiEsPalindromo(String introducidoPorUsuario) {
		int i = 0, sumaSiPalindromo = 0;
		char palindromoTemporal1, palindromoTemporal2;
		boolean esPalindromo = false;

		introducidoPorUsuario = introducidoPorUsuario.replace(" ", "");
		introducidoPorUsuario = introducidoPorUsuario.toLowerCase();

		while (introducidoPorUsuario.length() / 2 > sumaSiPalindromo && introducidoPorUsuario.length() / 2 > i) {
			palindromoTemporal1 = introducidoPorUsuario.charAt(i);
			palindromoTemporal2 = introducidoPorUsuario.charAt((introducidoPorUsuario.length() - i - 1));
			if (palindromoTemporal1 == palindromoTemporal2) {
				sumaSiPalindromo++;
			}
			i++;
		}

		if (sumaSiPalindromo == introducidoPorUsuario.length() / 2) {
			esPalindromo = true;

		}

		return esPalindromo;
	}

}
