package programacion_tema_2;

import java.util.Scanner;

public class Actividad_1_11 {
private static final int DESCUENTO_MAYORES_DE_60_AÑOS = 25;
private static final int DESCUENTO_ESTUDIANTES = 30;
private static final int DESCUENTO_PROFESORES_Y_ESTUDIANTES = 100;
private static final int DESCUENTO_JOVENES = 50;
private static final int EDAD_MAXIMA_JOVENES = 18;
private static final int EDAD_MAXIMO_NIÑO = 12;
private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		int edad;
		String profesion;
		do {
			System.out.println("Inserte edad (0-128)");
			edad = Integer.parseInt(teclado.nextLine());
			System.out.println("Inserte su profesión (estudiante, profesor u otros)");
			profesion = teclado.nextLine();
			profesion = profesion.toLowerCase();
		} while (!((edad>=0 && edad<=128) || (!profesion.equals("estudiante")|| !profesion.equals("profesor") || !profesion.equals("otros"))));
		if (edad<EDAD_MAXIMO_NIÑO || profesion.equals("profesor")) {
			System.out.println("Entrada al " + DESCUENTO_PROFESORES_Y_ESTUDIANTES + "% de descuento.");
		} else if (edad<=EDAD_MAXIMA_JOVENES) {
			System.out.println("Entrada al " + DESCUENTO_JOVENES + "% de descuento.");
		} else if (profesion.equals("estudiante")) {
			System.out.println("Entrada al " + DESCUENTO_ESTUDIANTES + "% de descuento.");
		}else if (edad>60) {
			System.out.println("Entrada al " + DESCUENTO_MAYORES_DE_60_AÑOS + "% de descuento.");
		} else {
			System.out.println("Entrada a precio completo");
		}
	
	}

}
