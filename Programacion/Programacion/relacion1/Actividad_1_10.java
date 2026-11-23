package relacion1;

import java.util.Scanner;

public class Actividad_1_10 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		char caracter;
		int numero1;
		int numero2;
		double division;

		System.out.println("Inserte numero 1");
		numero1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Inserte numero 2");
		numero2 = Integer.parseInt(teclado.nextLine());
		System.out.println("Inserte operador aritmético según operación que desee realizar");
		caracter = teclado.nextLine().charAt(0);

		if (!(caracter == '+' || caracter == '-' || caracter == '/' || caracter == '*')) {
			System.out.println("Error");
		} else if (caracter == '+') {
			System.out.println(numero1 + "+" + numero2 + "=" + (numero1 + numero2));
		} else if (caracter == '-') {
			System.out.println(numero1 + "-" + numero2 + "=" + (numero1 - numero2));
		} else if (caracter == '/') {
			if (numero2 == 0) {
				System.out.println("No se puede dividir entre 0");
			} else {
				division = (double) numero1 / numero2;
				System.out.println(numero1 + "/" + numero2 + "=" + (division));
			}
		} else {
			System.out.println(numero1 + "*" + numero2 + "=" + (numero1 * numero2));
		}
	}

}
