package programacion_tema_2;

import java.util.Scanner;

public class A2_EXAMEN {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int numero1, numero2, sumatorioMultiplos = 0, mayor = 0, menor = 0;

		do {
			System.out.println("Introduce un número impar y postivo: ");
			numero1 = teclado.nextInt();
		} while (numero1 % 2 == 0 || numero1 < 0);
		do {
			System.out.println("Introduce otro número impar y positivo: ");
			numero2 = teclado.nextInt();
		} while (numero1 % 2 == 0 || numero1 < 0);

		if (numero1 < numero2) {
			numero1 = menor;
			numero2 = mayor;
		} else {
			numero1 = mayor;
			numero2 = menor;
		}
		
		if ((mayor - menor) < menor) {
			System.out.println("No hay múltiplos de " + menor + " entre " + mayor + " y " + menor);
		} else {
			System.out.println(
					"Los números entre " + menor + " y " + mayor + " que son múltiplos de " + menor + " son: ");
			for (int i = menor; i <= (mayor - menor); i++) {
				if (mayor % i == 0) {
					System.out.print(i);
					sumatorioMultiplos += i;
				}

			}

		}
	}
}
