//1. Crea un programa que genere 10 números aleatorios de 1-100 y los guarde en un array. A
//continuación debe mostrar todos los números y cuántos de estos números son superiores a un límite
//indicado.
//Números aleatorios: 28 26 10 1 5 26 27 99 100 27
//Introduce límite: 50
//Hay 2 números aleatorios superiores a 50

package arrays;

import java.util.Scanner;

public class ej1 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int numerosAleatorios[] = new int[10];
		generadorNumeroAleatorios(numerosAleatorios);
		mostrarArray(numerosAleatorios);
		mostrarSuperioresALimite(numerosAleatorios);
	}

	private static void mostrarSuperioresALimite(int[] numerosAleatorios) {
		int limite;
		System.out.println("Introduzca el límite:");
		limite = Integer.parseInt(teclado.nextLine());
		System.out.print("Los números superiores a la media son:");
		for (int i = 0; i < numerosAleatorios.length; i++) {
			if (numerosAleatorios[i] > limite) {
				System.out.print(numerosAleatorios[i]);
				if (i < (numerosAleatorios.length - 1)) {
					System.out.print(",");
				}
			}
		}
	}

	private static void mostrarArray(int[] numerosAleatorios) {
		System.out.print("Los números aleatorios generados son:");
		for (int i = 0; i < numerosAleatorios.length; i++) {
			System.out.print(numerosAleatorios[i]);
			if (i < (numerosAleatorios.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println();
	}

	private static void generadorNumeroAleatorios(int[] numerosAleatorios) {
		for (int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = (int) (Math.random() * 101);
		}

	}
}
