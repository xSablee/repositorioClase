package relacion2;

import java.util.Scanner;

public class R2_EJ7 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int numerosIntroducir, numero, numeroAcumulado = 0;
		double media = 0;
		do {
			System.out.println("Cuántos números desea introducir");
			numerosIntroducir = Integer.parseInt(teclado.nextLine());
		} while (numerosIntroducir <= 0);

		for (int i = 0; i < numerosIntroducir; i++) {
			System.out.println("Introduzca numero " + (i + 1) + "/" + numerosIntroducir);
			numero = Integer.parseInt(teclado.nextLine());
			numeroAcumulado += numero;
			media = numeroAcumulado / (i + 1);
		}
		System.out.println("La media es igual a " + media);
	}
}
