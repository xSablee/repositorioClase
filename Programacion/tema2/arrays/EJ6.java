//6. Crear un programa que sirva para crear una combinación de números de la lotería Primitiva. Debe
//crear una combinación de 6 números diferentes entre 1 y 49. Pista: realiza un método estaEnArray
//que busque el número antes de introducirlo en el array.

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EJ6 {
	private static final int MAXIMO_LOTERIA = 6;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeroLoteria = new int[MAXIMO_LOTERIA];
		int[] numeroLoteriaIntroducidoPorUsuario = new int[MAXIMO_LOTERIA];
		int numeroAciertosDigitos;
		numeroSecretoLoteria(numeroLoteria);
		System.out.println("Inserte su combinación de dígitos (" + MAXIMO_LOTERIA + " dígitos del 1 al 49):");
		numeroAciertosDigitos = insertarNumeroSecreto(numeroLoteria, numeroLoteriaIntroducidoPorUsuario);
		if (numeroAciertosDigitos == 0) {
			System.out.println("Losiento, no ha acertado ningún número");
		} else if (numeroAciertosDigitos < 6) {
			System.out.println("Felicidades, ha acertado " + numeroAciertosDigitos + " de un máximo de "
					+ MAXIMO_LOTERIA + " combinaciones de números");
		} else {
			System.out.println("Felicidades, ha ganado la primitiva");
		}
	}

	private static int insertarNumeroSecreto(int[] numeroLoteria, int[] numeroLoteriaIntroducidoPorUsuario) {
		int numeroAciertosDigitos = 0;
		for (int i = 0; i < numeroLoteria.length; i++) {
			do {
				System.out.println("Dígito " + (i + 1) + "/" + MAXIMO_LOTERIA + ":");
				numeroLoteriaIntroducidoPorUsuario[i] = Integer.parseInt(teclado.nextLine());
			} while (numeroLoteriaIntroducidoPorUsuario[i] < 1 || numeroLoteriaIntroducidoPorUsuario[i] > 49);
		}
		Arrays.sort(numeroLoteriaIntroducidoPorUsuario);
		for (int i = 0; i < numeroLoteriaIntroducidoPorUsuario.length; i++) {

			if (numeroLoteria[i] == numeroLoteriaIntroducidoPorUsuario[i]) {
				numeroAciertosDigitos += 1;
			}
		}
		return numeroAciertosDigitos;
	}

	private static void numeroSecretoLoteria(int[] numeroLoteria) {
		for (int i = 0; i < numeroLoteria.length; i++) {
			numeroLoteria[i] = (int) (Math.random() * 49) + 1;
		}
		Arrays.sort(numeroLoteria);
		System.out.println(Arrays.toString(numeroLoteria));
	}

}
