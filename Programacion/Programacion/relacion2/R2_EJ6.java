package relacion2;
import java.util.Scanner;

public class R2_EJ6 {
	private static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		int numeroA, numeroB, sumatorio = 0;
		System.out.println("Introduzca numero 1");
		numeroA = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduzca numero 2");
		numeroB = Integer.parseInt(teclado.nextLine());
		 if (numeroB==0) {
			 System.out.println("El producto de " + numeroA + "*" + numeroB + " es igual a " + sumatorio);
		} else if (numeroB==1) {
			sumatorio = numeroA;
			System.out.println("El producto de " + numeroA + "*" + numeroB + " es igual a " + sumatorio);
		} else {
			for (int i = 0; i < numeroB; i++) {
				sumatorio += numeroA;
			}
			System.out.println("El producto de " + numeroA + "*" + numeroB + " es igual a " + sumatorio);
		}
	}
}
