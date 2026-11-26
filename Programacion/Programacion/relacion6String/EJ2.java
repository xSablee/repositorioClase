//2. Realizar un programa que solicite una cadena de caracteres por teclado
//y visualice por pantalla cuántos de esos caracteres son letras
//mayúsculas, cuántos son letras minúsculas y cuántos son caracteres
//numéricos. Investigar en los métodos de la clase "is..." de la clase
//Character.

package relacion6String;

import java.util.Scanner;

public class EJ2 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String cadenaIntroducidaPorUsuario;
		System.out.println("Introduce la cadena");
		int numeroLetrasMayusculas, numerosLetrasMinúsculas, numeroDeNumeros;

		cadenaIntroducidaPorUsuario = teclado.nextLine();
		numeroLetrasMayusculas = letrasMayusculas(cadenaIntroducidaPorUsuario);
		numerosLetrasMinúsculas = letrasMinusculas(cadenaIntroducidaPorUsuario);
		numeroDeNumeros = numeros(cadenaIntroducidaPorUsuario);

		System.out.println("Hay un total de " + numeroLetrasMayusculas + " letras mayúsculas en la cadena");
		System.out.println("Hay un total de " + numerosLetrasMinúsculas + " letras mayúsculas en la cadena");
		System.out.println("Hay un total de " + numeroDeNumeros + " números en la cadena");
	}

	private static int numeros(String cadenaIntroducidaPorUsuario) {
		int numeroDeNumeros = 0;
		boolean tieneNumeros = false;

		for (int i = 0; i < cadenaIntroducidaPorUsuario.length(); i++) {
			tieneNumeros = Character.isDigit(cadenaIntroducidaPorUsuario.charAt(i));
			if (tieneNumeros) {
				numeroDeNumeros++;
			}
			tieneNumeros = false;
		}
		return numeroDeNumeros;
	}

	private static int letrasMinusculas(String cadenaIntroducidaPorUsuario) {
		int letrasMinusculas = 0;
		boolean minusculas = false;

		for (int i = 0; i < cadenaIntroducidaPorUsuario.length(); i++) {
			minusculas = Character.isLowerCase(cadenaIntroducidaPorUsuario.charAt(i));
			if (minusculas) {
				letrasMinusculas++;
			}
			minusculas = false;
		}
		return letrasMinusculas;
	}

	private static int letrasMayusculas(String cadenaIntroducidaPorUsuario) {
		boolean mayuscula = false;
		int totalMayusculas = 0;

		for (int i = 0; i < cadenaIntroducidaPorUsuario.length(); i++) {
			mayuscula = Character.isUpperCase(cadenaIntroducidaPorUsuario.charAt(i));
			if (mayuscula) {
				totalMayusculas++;
			}
		}
		return totalMayusculas;
	}

}
