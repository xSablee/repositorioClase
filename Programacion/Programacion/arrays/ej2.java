//Crea un programa que solicite las 10 últimas páginas web que se han visitado. Una vez termine de
//introducirlas todas deben mostrarse en orden inverso (de la más reciente a la menos). Utiliza un array
//de String.

package arrays;

import java.util.Scanner;

public class ej2 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String[] paginasVisitadas = new String[10];
		solicitarPaginasVisitadas(paginasVisitadas);
		imprimirArrays(paginasVisitadas);
	}

	private static void imprimirArrays(String[] paginasVisitadas) {
		System.out.print("Las páginas visitadas en orden inverso son:");
		for (int i = (paginasVisitadas.length-1); i >= 0; i--) {
			System.out.print(paginasVisitadas[i]);
			if (i>0) {
				System.out.print(",");
			}
		}
		System.out.println("");
	}

	private static void solicitarPaginasVisitadas(String[] paginasVisitadas) {
		for (int i = 0; i < paginasVisitadas.length; i++) {
			System.out.println("Introduzca páginas visitadas (" + (i+1) + "/10):");
			paginasVisitadas[i] = teclado.nextLine();
		}

	}

}
