package programacion_tema_2;

import java.util.Scanner;

public class Actividad_1_7_switch {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter;
		System.out.println("Introduzca caracter");
		caracter = teclado.nextLine().charAt(0);
		caracter = Character.toUpperCase(caracter);

		if (!(caracter == 'A' & caracter == 'E' & caracter == 'I' & caracter == 'O' & caracter == 'U')) {
			System.out.println("Error, introduzca una vocal");
		}
		switch (caracter) {
		case 'A':
			System.out.println("Es la primera vocal (A) ");
			break;
		case 'E':
			System.out.println("Es la segunda vocal (E)");
			break;
		case 'I':
			System.out.println("Es la tercera vocal (I)");
			break;
		case 'O':
			System.out.println("Es la cuarta vocal (O)");
			break;
		case 'U':
			System.out.println("Es la quinta vocal (U)");
			break;

		default:
			break;
		}
	}
}
