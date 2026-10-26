package examen_pruebas;

import java.util.Scanner;

public class A2_EXAMEN {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int numero1, numero2, sumatorioMultiplos = 0, mayor = 0, menor = 0;

		do {
			System.out.println("Introduce un número impar y postivo: ");
			numero1 = Integer.parseInt(teclado.nextLine());
		} while (numero1 % 2 == 0 || numero1 < 0);
		do {
			System.out.println("Introduce otro número impar y positivo: ");
			numero2 = Integer.parseInt(teclado.nextLine());
		} while (numero1 % 2 == 0 || numero1 < 0);

		if (numero1 < numero2) {
			menor = numero1;
			mayor = numero2;
		} else {
			menor = numero2;
			mayor = numero1;
		}
		
		if ((mayor - menor) < menor) {
			System.out.println("No hay múltiplos de " + menor + " entre " + mayor + " y " + menor);
		} else {
			System.out.print(
					"Los números entre " + menor + " y " + mayor + " que son múltiplos de " + menor + " son: ");
			for (int i = menor; i <= (mayor - menor); i++) {
				if (i % menor == 0) {
					System.out.print(i + " , ");
					sumatorioMultiplos += i;
				}
			}
			System.out.print("\nLa suma de los múltiplos entre " + menor + " y " + mayor + " es " + sumatorioMultiplos);
		}
	
	}
}
