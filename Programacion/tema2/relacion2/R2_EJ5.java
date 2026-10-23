package relacion2;
import java.util.Scanner;
public class R2_EJ5 {
	private static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		int numero, contador = 0;
		do {
			System.out.println("Introduzca número (negativo para terminar):");
			numero = Integer.parseInt(teclado.nextLine());
			if (numero>=0) {
				contador += 1;
			}
		} while (numero>=0);
		System.out.println("Has introducido un total de " + contador + " números positivos.");

	}

}
