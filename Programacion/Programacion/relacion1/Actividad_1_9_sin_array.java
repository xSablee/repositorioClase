package relacion1;

import java.util.Scanner;

public class Actividad_1_9_sin_array {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int hora1;
		int minuto1; 
		int segundo1;
		int hora2;
		int minuto2;
		int segundo2;
do {
	System.out.println("Introduzca hora1.");
	hora1 = Integer.parseInt(teclado.nextLine());
	System.out.println("Introduzca minutos de la primera hora.");
	minuto1 = Integer.parseInt(teclado.nextLine());
	System.out.println("Introduzca segundos de la primera hora");
	segundo1 = Integer.parseInt(teclado.nextLine());
	System.out.println("Introduzca hora2.");
	hora2 = Integer.parseInt(teclado.nextLine());
	System.out.println("Introduzca minutos de la segunda hora.");
	minuto2 = Integer.parseInt(teclado.nextLine());
	System.out.println("Introduzca segundos de la segunda hora");
	segundo2 = Integer.parseInt(teclado.nextLine());
} while (hora1 < 0 || hora1 > 23 || minuto1 < 0 || minuto1 > 59 || segundo1 < 0 || segundo1 > 59 || hora2 < 0 || hora2 > 23 || minuto2 < 0 || minuto2 > 59 || segundo2 < 0 || segundo2 > 59);

		
		 if (hora1>hora2) {
			System.out.println("La hora " + hora1 + ":" + minuto1 + ":" + segundo1 + " es superior a " + hora2 + ":" + minuto2 + ":" + segundo2);
		} else {
			System.out.println("La hora " + hora2 + ":" + minuto2 + ":" + segundo2 + " es superior a " + hora1 + ":" + minuto1 + ":" + segundo1);
		}
	}

}
