package programacion_tema_2;

import java.util.Scanner;

public class actividad_1_5 {
private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroAcumulado = 0;
		int [] numero = new int[4];
		
	for (int contador=0; contador<4; contador++) {
		System.out.println("Introduzca numero " + contador );
		numero [contador] = Integer.parseInt(teclado.nextLine());
		numeroAcumulado = numeroAcumulado + numero [contador];
		}
	 double media = (double) numeroAcumulado/4;
	System.out.println("Los números superiores a la media son : ");
	for (int contador = 0; contador<4; contador++) {
		if (numero [contador]>media) {
			System.out.println(numero [contador] + " ");
		}
		
	}
	System.out.println("La media es " + media);
}
	}

