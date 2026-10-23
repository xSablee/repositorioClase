//Realizar un programa que lea un número estrictamente positivo N y muestre la suma de los N
//primeros números. Diseña el programa de forma que si N es incorrecto vuelva a solicitarse.
//Ejemplo:
//Introduce un número positivo: 4
//La suma de los 4 primeros números es: 10


package relacion2;
import java.util.Scanner;

public class ActividadR2_4 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int numero;
		int sumaNumeros = 0;
		do {
			System.out.println("Introduzca un número positivo");
			numero = Integer.parseInt(teclado.nextLine());
		} while (!(numero >= 0));
		for (int i = 1; i <= numero; i++) {
			sumaNumeros += i;
		}
		System.out.println("La suma de los " + numero + " primeros números es: " + sumaNumeros);

	}

}
