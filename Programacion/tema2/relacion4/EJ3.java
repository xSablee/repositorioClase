//3. Realizar un método que informe de si un año es o no bisiesto. Un año es bisiesto si es múltiplo de 4, a
//excepción de los que, siendo múltiplos de 4 son múltiplos de 100 y no de 400. Probarlo desde el ma
package relacion4;

import java.util.Scanner;

public class EJ3 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Casos de prueba para verificar el funcionamiento
		int anosBisiestos;
		boolean resultadoBisiesto;
		System.out.println("Introduce año que desea saber si es bisiesto:");
		anosBisiestos = Integer.parseInt(teclado.nextLine());
		resultadoBisiesto = esBisiesto(anosBisiestos);
		if (resultadoBisiesto) {
			System.out.println("El " + anosBisiestos + " es bisiesto");
		} else {
			System.out.println("El " + anosBisiestos + " no es bisiesto");
		}

	}

	public static boolean esBisiesto(int anio) {
		boolean siBisiesto;
		if (anio % 4 == 0) {
			if (anio % 100 == 0 && anio % 400 != 0) {
				siBisiesto = false;
			} else {
				siBisiesto = true;
			}
		} else {
			siBisiesto = false;
		}

		return siBisiesto;
	}
}
