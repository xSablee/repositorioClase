import java.util.Iterator;
import java.util.Scanner;
/*Realizar un programa que solicite una cantidad de números que van a introducirse por teclado.
Después, para cada uno de ellos indique si el número es par o impar. Si la cantidad de números
introducida es 0 o negativa volverá a solicitarse el dato.*/

public class ActividadR2_3 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int cantidadNumeros = 0;
		int numero;
		do {
			System.out.println("¿Cuántos números desea introducir?");
			cantidadNumeros = Integer.parseInt(teclado.nextLine());
		} while (!(cantidadNumeros > 0));
		
		for (int i = 1; i <= cantidadNumeros; i++) {
			System.out.println("Introduzca numero " + i + "/" + cantidadNumeros + ":");
			numero = Integer.parseInt(teclado.nextLine());
			if (numero % 2 == 0) {
				System.out.println("El número " + numero + " es par.");
			} else {
				System.out.println("El número " + numero + " es impar.");
			}
		}

	}

}
