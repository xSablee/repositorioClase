package programacion_tema_2;

import java.util.Scanner;

public class actividad_1_5_sin_bucle {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduzca numero 1/4");
		int numero1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduzca numero 2/4");
		int numero2 = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduzca numero 3/4");
		int numero3 = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduzca numero 4/4");
		int numero4 = Integer.parseInt(teclado.nextLine());
		int media = (numero1+numero2+numero3+numero4)/4;
		System.out.println("La media es " + media);
		System.out.println("Los siguientes números son superiores a la media:");
		if (numero1>media) {
			System.out.print(numero1 + " ");
		}
		if (numero2>media) {
			System.out.print(numero2 + " ");
		}
		if (numero3>media) {
			System.out.print(numero3 + " ");
		}
		if (numero4>media) {
			System.out.print(numero4 + " ");
		}
	}
}
