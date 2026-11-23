package relacion3;

import java.util.Scanner;

public class R3_EJ11_con_mismo_bucle {private static Scanner teclado = new Scanner (System.in);

public static void main(String[] args) {
	int baseTrianguloImpar;
	String caracter;
	do {
		System.out.println("Introduzca base del trángulo (impar)");
		baseTrianguloImpar = Integer.parseInt(teclado.nextLine());
	} while (baseTrianguloImpar % 2 == 0 || baseTrianguloImpar <= 0);
	 System.out.println("Introduzca caracter");
	 caracter = teclado.nextLine();
	 
	 for (int i = 0; i < (baseTrianguloImpar/2+1); i++) {
		for (int j = (baseTrianguloImpar/2); j > i ; j--) {
			System.out.print(" ");
		}
		for (int j = 0; j < (2*i+1); j++) {
			System.out.print(caracter);
		}
		System.out.println();
	}
	 for (int i = 0; i < baseTrianguloImpar/2; i++) {
		for (int j = 0; j <= i; j++) {
			System.out.print(" ");
		}
		for (int j = 0; j < (baseTrianguloImpar-2)-(i*2); j++) {
			System.out.print(caracter);
		}
		System.out.println();
	}

}

}
