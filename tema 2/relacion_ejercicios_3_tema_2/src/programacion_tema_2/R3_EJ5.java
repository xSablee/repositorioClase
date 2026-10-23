//5. Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa
//nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no
//es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
//◦ Tendremos cinco oportunidades para abrir la caja fuerte.

package programacion_tema_2;

import java.util.Scanner;

public class R3_EJ5 {

	private static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		int combinacionCajaFuerte = (int) ((Math.random()*1000) +1), contador = 0, combinacionIntroducida ;
		boolean combinacionCorrecta = false;
		System.out.println(combinacionCajaFuerte);
		do {
			System.out.println("Inserte la combinación de la caja fuerte. Intento " + (contador+1) + "/" + 5);
			combinacionIntroducida = Integer.parseInt(teclado.nextLine());
			if (combinacionIntroducida == combinacionCajaFuerte) {
				combinacionCorrecta = true ;
				System.out.println("La caja fuerte se  ha abierto satisfactoriamente");
			} else {
				System.out.println("Lo siento, esa no es la combinación");
				contador++;
			}
		} while (!combinacionCorrecta && contador < 5);
		if (!combinacionCorrecta) {
			System.out.println("No tiene más intentos");
		}
	}

}
