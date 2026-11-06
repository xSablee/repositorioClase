//5. Realizar un método llamado pintarNuevaHora al que se le pasen 4 parámetros enteros:
//◦ horaActual
//◦ minutosActuales
//◦ segundosActuales
//◦ segundosASumar
//El método no devuelve nada y debe mostrar dos mensajes:
//La hora anterior era H: M: S
//La nueva hora es H: M: S
//El método supondrá que los datos de entrada son correctos. Esta validación de datos se realizará desde el
//main.
//Probar el método desde el main.

package relacion4;

import java.util.Scanner;

public class EJ5 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int hora, minutos, segundos, segundosASumar;
		do {
			System.out.println("Introduzca hora:");
			hora = Integer.parseInt(teclado.nextLine());
		} while (hora < 0 || hora >= 24);
		do {
			System.out.println("Introduzca minutos:");
			minutos = Integer.parseInt(teclado.nextLine());
		} while (minutos < 0 || minutos > 59);
		do {
			System.out.println("Introduzca segundos:");
			segundos = Integer.parseInt(teclado.nextLine());
		} while (segundos < 0 || segundos > 59);
		do {
			System.out.println("¿Cuántos segundos quiere sumar?:");
			segundosASumar = Integer.parseInt(teclado.nextLine());
		} while (segundos < 0);
		pintarNuevaHora(segundos, minutos, hora, segundosASumar);
	}

	public static void pintarNuevaHora(int segundos, int minutos, int hora, int segundosASumar) {
		int sumaHoras = 0, sumaMinutos = 0, numeroDiasSiguientes = 0;
		boolean diaSiguiente = false;
		System.out.println("La hora anterior era " + hora + ":" + minutos + ":" + segundos + ".");
		if (segundosASumar >= 3600) {
			sumaHoras = segundosASumar / 3600;
			hora += sumaHoras;
			segundosASumar %= 3600;
		}
		do {
			if (hora >= 24) {
				hora -= 24;
				numeroDiasSiguientes += 1;
				diaSiguiente = true;
			}
		} while (hora >= 24);

		if (segundosASumar >= 60) {
			sumaMinutos = segundosASumar / 60;
			minutos += sumaMinutos;
			segundosASumar %= 60;
		}
		do {
			if (minutos >= 60) {
				minutos -= 60;
				hora += 1;
			}
		} while (minutos >= 60);
		if (segundosASumar < 60) {
			segundos += segundosASumar;
		}
		if (segundos >= 60) {
			segundos -= 60;
			minutos += 1;
		}
		if (diaSiguiente) {
			System.out.println("La nueva hora es " + hora + ":" + minutos + ":" + segundos + " ," + numeroDiasSiguientes + " días después");
		} else {
			System.out.println("La nueva hora es " + hora + ":" + minutos + ":" + segundos + ".");
		}
		
	}

}
