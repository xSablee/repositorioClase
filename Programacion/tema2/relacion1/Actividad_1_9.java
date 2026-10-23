package relacion1;

import java.util.Scanner;

public class Actividad_1_9 {
	private static final int MAXIMO_MINUTOS_SEGUNDOS = 59;
	private static final int MINIMO_HORAS_SEGUNDOS_MINUTOS = 0;
	private static final int MAXIMO_HORA = 24;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int[] hora = new int[2];
		int[] minuto = new int[2];
		int[] segundo = new int[2];
		int contador = 0;
		do {
			System.out.println("Introduzca hora " + (contador+1) + ".");
			hora [contador] = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduzca minutos " + (contador+1) + ".");
			minuto [contador] = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduzca segundos " + (contador+1) + ".");
			segundo [contador] = Integer.parseInt(teclado.nextLine());
			if (hora[contador]<MAXIMO_HORA && hora[contador]>=MINIMO_HORAS_SEGUNDOS_MINUTOS && minuto[contador]>=MINIMO_HORAS_SEGUNDOS_MINUTOS && minuto[contador]<=MAXIMO_MINUTOS_SEGUNDOS && segundo[contador]>=MINIMO_HORAS_SEGUNDOS_MINUTOS && segundo[contador]<=MAXIMO_MINUTOS_SEGUNDOS) {
				contador = contador+1;
			}
		} while (contador<2);
			
		 if (hora[0]>hora[1]) {
			System.out.println("La hora " + hora[0] + ":" + minuto[0] + ":" + segundo[0] + " es superior a " + hora[1] + ":" + minuto[1] + ":" + segundo[1]);
		} else {
			System.out.println("La hora " + hora[1] + ":" + minuto[1] + ":" + segundo[1] + " es superior a " + hora[0] + ":" + minuto[0] + ":" + segundo[0]);
		}
	}

}
