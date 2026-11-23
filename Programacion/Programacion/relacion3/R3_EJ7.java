	//7. Realizar un programa que solicite dos números enteros mayores que 0, que calcule el máximo común
	//divisor entre ellos mediante el algoritmo de Euclides y que muestre por pantalla el resultado.
	//◦ El algoritmo de Euclides se explica a continuación con un ejemplo:
	//• Supongamos que queremos calcular el m.c.d de 120 y 54
	//• 120 : 54 = 2 y resto 12
	//• 54 : 12 = 4 y resto 6
	//• 12: 6 = 2 y resto 0
	//• El m.c.d. de 120 y 54 es 6

package relacion3;

import java.util.Scanner;

public class R3_EJ7 {
	private static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		
		int numero1, numero2, euclides, mayor, menor;
		do {
			System.out.println("Inserte número mayor a 0");
			numero1 = Integer.parseInt(teclado.nextLine());
		} while (numero1<=0);
		
		do {
			System.out.println("Inserte otro número mayor a 0");
			numero2 = Integer.parseInt(teclado.nextLine());
		} while (numero2<=0);
		
		if (numero1>numero2) {
			mayor = numero1;
			menor = numero2;
		} else {
			mayor = numero2;
			menor = numero1;
		}
		do {
			euclides = mayor%menor;
			if (euclides == 0) {
				euclides = menor; //cuando el resto de la división es 0, significa que el divisor de esa cuenta es el MCD, por lo que le asginamos a euclides el valor del divisor para imprimirlo al final del programa
			} else {
				mayor = menor;
				menor = euclides;
			}

		} while (mayor%menor != 0);
		System.out.println("El máximo común divisor de los números " + numero1 + " y " + numero2 + " es " + euclides);

	}

}
