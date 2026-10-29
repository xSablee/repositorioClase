package examen_pruebas;

import java.util.Random;
import java.util.Scanner;

public class Ex_2 {
	private static final int NUMERO_MAXIMO_DE_PREGUNTAS = 10;
	private static final Random numeroRandom = new Random();
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		char tipoDePrueba;
		int sumando1, sumando2, respuestaSuma, respuestaUsuario, contadorAciertos = 0, contador = 1;
		boolean usuarioError = false;
		do {
			System.out.println("Prueba normal (N) o hasta fallo (F):");
			tipoDePrueba = teclado.nextLine().charAt(0);
		} while (tipoDePrueba != 'N' && tipoDePrueba != 'F');
		if (tipoDePrueba == 'N') {
			for (int i = 1; i <= NUMERO_MAXIMO_DE_PREGUNTAS; i++) {
				sumando1 = obtenerNumeroRandom();
				sumando2 = obtenerNumeroRandom();
				System.out.print("Pregunta " + i + " de " + NUMERO_MAXIMO_DE_PREGUNTAS + ": ");
				System.out.println(sumando1 + " + " + sumando2 + " = ?");
				System.out.println("Introduce el resultado :");
				respuestaUsuario = Integer.parseInt(teclado.nextLine());
				respuestaSuma = sumando1 + sumando2;
				if (respuestaSuma == respuestaUsuario) {
					System.out.println("Correcta");
					contadorAciertos += 1;
				} else {
					System.out.println("Incorrecta");
				}
			}
			System.out.println("Nota final: " + contadorAciertos + " de " + NUMERO_MAXIMO_DE_PREGUNTAS);
			
		} else {
			do {
				sumando1 = obtenerNumeroRandom();
				sumando2 = obtenerNumeroRandom();
				System.out.print("Pregunta " + contador + " de " + NUMERO_MAXIMO_DE_PREGUNTAS + ": ");
				System.out.println(sumando1 + " + " + sumando2 + " = ?");
				System.out.println("Introduce el resultado : ");
				respuestaUsuario = Integer.parseInt(teclado.nextLine());
				respuestaSuma = sumando1 + sumando2;
				if (respuestaSuma == respuestaUsuario) {
					System.out.println("Correcta");
					contadorAciertos += 1;
					contador += 1;
				} else {
					System.out.println("Incorrecta");
					usuarioError = true;
				}
			} while (!usuarioError && contador <= NUMERO_MAXIMO_DE_PREGUNTAS);
			System.out.println("Has acertado " + contadorAciertos + " preguntas de " + NUMERO_MAXIMO_DE_PREGUNTAS);
		}
	}

	private int obtenerNumeroRandom() {
		return numeroRandom.nextInt(101);
	}
}
