//1. Realizar un programa que solicite 3 números cualesquiera y los muestre por pantalla ordenados de
//menor a mayor.

package relacion3;

import java.util.Arrays;
import java.util.Scanner;

public class R3_1 {
	private static final int TOTAL_NUMEROS_A_PEDIR = 3;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numero = new int[3];

		for (int i = 0; i < numero.length; i++) {
				System.out.println("Introduzca numero " + (i + 1) + "/" + TOTAL_NUMEROS_A_PEDIR);
				numero[i] = Integer.parseInt(teclado.nextLine());
			}
		Arrays.sort(numero);
		System.out.println("Ordenados de mayor a menor:" + numero[2] + "," + numero[1] + "," + numero[0]);
		if (numero[0] == numero [1] || numero [0] == numero[2] || numero[1] == numero[2]) {
			System.out.println("Introduzca números diferentes unos de otros para una mejor comparación");
		}

		}
		
	}

