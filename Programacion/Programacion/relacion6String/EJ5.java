//Realizar un programa que busque una palabra escondida dentro de un
//texto. Por ejemplo, si la cadena es “shybaoxlna” y la palabra que
//queremos buscar es “hola”, entonces si se encontrará.
//Ejemplo:
//Introduce frase: shybaoxlna
//Palabra escondida: hola
//Encontrada
//Introduce frase: aecoefo
//Palabra escondida: feo
//No se encuentra
package relacion6String;

import java.util.Scanner;

public class EJ5 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String texto, palabraABuscar;
		boolean siEstaLaPalabraEnElTexto;

		texto = solicitarTexto();
		palabraABuscar = solicitarPalabraABuscar();
		siEstaLaPalabraEnElTexto = buscarPalabra(texto, palabraABuscar);
		
		if (siEstaLaPalabraEnElTexto) {
			System.out.println("La palabra: " + palabraABuscar + " si se encuentra en el texto :" + texto + ".");
		} else {
			System.out.println("La palabra: " + palabraABuscar + " no se encuentra en el texto :" + texto + ".");
		}
	}

	private static boolean buscarPalabra(String texto, String palabraABuscar) {
		boolean siEstaLaPalabraEnElTexto = false;
		int j = 0;

		for (int i = 0; i < texto.length() && j < palabraABuscar.length(); i++) {
			if (palabraABuscar.charAt(j) == texto.charAt(i)) {
				j++;
			}
		}
		if (j == palabraABuscar.length()) {
			siEstaLaPalabraEnElTexto = true;
		}
		return siEstaLaPalabraEnElTexto;
	}

	private static String solicitarPalabraABuscar() {
		String palabraABuscar;

		System.out.println("Introduce la palabra que quieres buscar en el texto:");
		palabraABuscar = teclado.nextLine();

		return palabraABuscar;
	}

	private static String solicitarTexto() {
		String texto;

		System.out.println("Introduce el texto");
		texto = teclado.nextLine();

		return texto;
	}

}
