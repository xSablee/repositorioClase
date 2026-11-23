//4. Realizar un método llamado diasDeUnMes que tenga como entrada un número de mes (entre 1 y 12)
//y un año y devuelva el número de días de ese mes y año. Usar el método anterior para cuando el año
//sea bisiesto, febrero tenga 29 días.
package relacion4;

import java.util.Scanner;

public class EJ4 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int numeroMes, ano, numeroDias;
		do {
			System.out.println("¿En qué mes estamos (numero de mes(1-12))?:");
			numeroMes = Integer.parseInt(teclado.nextLine());
		} while (numeroMes <= 0 || numeroMes > 12);
		do {
			System.out.println("¿En que año estamos?:");
			ano = Integer.parseInt(teclado.nextLine());
		} while (ano < 0);
		numeroDias = diasDeUnMes(numeroMes, ano);
		System.out.println("El mes " + numeroMes + " tiene " + numeroDias + " días.");
	}

	public static int diasDeUnMes(int numeroMes, int ano) {
		Boolean esBisiesto;
		int numeroDias;
		esBisiesto = EJ3.esBisiesto(ano);

		if (numeroMes % 2 != 0 || numeroMes == 8) {
			numeroDias = 31;
		} else if (numeroMes % 2 == 0 && numeroMes != 2) {
			numeroDias =  30;
		} else if (esBisiesto) {
			numeroDias = 29;
		} else {
			numeroDias = 28;
		}
		return numeroDias;
	}
}
