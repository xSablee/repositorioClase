//3. Realizar un programa que solicite un número entero y determine el número de cifras que tiene dicho
//número.
//◦ Ejemplo:
//Introduce un número: 124
//El número 124 tiene 3 cifras

package relacion3;

import java.util.Scanner;

public class R3_EJ3 {
	private static final int DIVISOR = 10;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		long numero, resultadoCifras;
		System.out.println("Introduzca número");
		numero = Integer.parseInt(teclado.nextLine());
		resultadoCifras = numeroCifras(numero);
		System.out.println("El " + numero + " tiene un total de " + resultadoCifras + " cifras");
	}
	public static int numeroCifras (long numero) {
		int numeroCifras = 1;	
		while (numero>10) {
			numero /= DIVISOR;
			numeroCifras += 1;
		}
			return numeroCifras;
	} 
}
