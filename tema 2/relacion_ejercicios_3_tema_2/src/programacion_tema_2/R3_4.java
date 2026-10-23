//4. Se desea realizar un programa que implemente un juego que consiste en acertar un número secreto.
//El ordenador deberá generar aleatoriamente un número secreto entre 1 y 100 y el jugador tratará de
//acertarlo.
//◦ Cada vez que el jugador introduzca un número, se comprobará si es el número secreto, en cuyo
//caso termina el juego. Si no lo es, se informará que el número introducido es mayor o menor que
//el número secreto. El programa termina cuando acierta el número (gana) o cuando agota el
//número de intentos ( en nuestro caso 5) sin acertar el número , en cuyo caso pierde.
//◦ Si es número no estuviese en el rango de 1-100, debe mostrar un mensaje “El número debe estar
//entre 1 y 100” y también debe contarse como un fallo.
//◦ NOTA: Se proporciona la forma de crear un número secreto en Java

package programacion_tema_2;

import java.util.Scanner;

public class R3_4 {
	private static final int NUMERO_MAXIMO_DE_INTENTOS = 5;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int numeroSecreto = (int) ((Math.random() * 100) + 1), numeroIntroducido, contador = 0;
		boolean haGanado = false;
		do {
			System.out.println("Introduzca numero entre (1-100).");
			System.out.println("Este es tu intento " + (contador + 1) + "/" + NUMERO_MAXIMO_DE_INTENTOS);
			numeroIntroducido = Integer.parseInt(teclado.nextLine());
			if (numeroIntroducido > numeroSecreto) {
				System.out.println("El " + numeroIntroducido + " es mayor al número secreto");
			} else if (numeroIntroducido < numeroSecreto) {
				System.out.println("El " + numeroIntroducido + " es menor al número secreto");
			}
			if (numeroIntroducido > 100 || numeroIntroducido < 1) {
				System.out.println(
						"Recuerde que el número que introduzca debe encontrarse entre 1-100 y usted ha introducido el número "
								+ numeroIntroducido + ", desgraciadamente este intento cuenta como fallo");
			} else if (numeroIntroducido != numeroSecreto) {
				System.out.println("Fallo, le quedan " + (NUMERO_MAXIMO_DE_INTENTOS - (contador + 1)) + " intentos.");
			} else {
				System.out.println("Enhorabuena, ha acertado el número");
				haGanado = true;
			}
			contador++;
		} while (haGanado == false && contador < NUMERO_MAXIMO_DE_INTENTOS);
		if (haGanado == false) {
			System.out.println("Has perdido, el número secreto era " + numeroSecreto);
		}
		System.out.println("Fin del programa");
	}
}
