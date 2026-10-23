package examen_pruebas;

import java.util.Scanner;

public class Actividad_Simulacro {
	private static final int PRECIO_PIERNAS = 25;
	private static final int PRECIO_CUELLO = 18;
	private static final int EDAD_MAXIMA_DESCUENTO_ANCIANO = 100;
	private static final int EDAD_MINIMA_DESCUENTO_ANCIANO = 61;
	private static final int EDAD_MAXIMA_DESCUENTO_ADULTO = 60;
	private static final int EDAD_MINIMA_DESCUENTO_ADULTO = 40;
	private static final int PRECIO_ESPALDA = 22;
	private static final int PRECIO_FACIAL = 20;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int edad;
		int descuentoAcumulable = 0;
		int descuento;
		int precio;
		int precioAcumulable = 0;
		double precioTotal;
		String facial;
		String espalda;
		String cuello;
		String piernas;

		do {
			System.out.println("Inserte su edad(18-100)");
			edad = Integer.parseInt(teclado.nextLine());
		} while (!(edad <= 100 && edad >= 18));
		if (edad >= EDAD_MINIMA_DESCUENTO_ADULTO && edad <= EDAD_MAXIMA_DESCUENTO_ADULTO) {
			descuento = 2;
			descuentoAcumulable = descuento;
		} else if (edad >= EDAD_MINIMA_DESCUENTO_ANCIANO && edad <= EDAD_MAXIMA_DESCUENTO_ANCIANO) {
			descuento = 5;
			descuentoAcumulable = descuentoAcumulable + descuento;
		}
		do {
			System.out.println("¿Desea masaje facial (SI/NO)?");
			facial = teclado.nextLine().toLowerCase();

		} while (!facial.equals("si") && !facial.equals("no"));
		if (facial.equals("si")) {
			precio = PRECIO_FACIAL;
			precioAcumulable = precioAcumulable + precio;
		}
		do {
			System.out.println("¿Desea masaje de espalda (SI/NO)?");
			espalda = teclado.nextLine().toLowerCase();

		} while (!espalda.equals("si") && !espalda.equals("no"));
		if (espalda.equals("si")) {
			precio = PRECIO_ESPALDA;
			precioAcumulable = precioAcumulable + precio;
		}
		do {
			System.out.println("¿Desea masaje de cuello (SI/NO)?");
			cuello = teclado.nextLine().toLowerCase();

		} while (!cuello.equals("si") && !cuello.equals("no"));
		if (cuello.equals("si")) {
			precio = PRECIO_CUELLO;
			precioAcumulable = precioAcumulable + precio;
		}
		do {
			System.out.println("¿Desea masaje de piernas (SI/NO)?");
			piernas = teclado.nextLine().toLowerCase();

		} while (!piernas.equals("si") && !piernas.equals("no"));
		if (piernas.equals("si")) {
			precio = PRECIO_PIERNAS;
			precioAcumulable = precioAcumulable + precio;
		}
		if (facial.equals("no") && espalda.equals("no") && cuello.equals("no") && piernas.equals("no")) {
			System.out.println("Error, no ha seleccionado ningún tipo de masaje");
		} else {
			if (facial.equals("si") && espalda.equals("si") && cuello.equals("si") && piernas.equals("si")) {
				descuento = 3;
				descuentoAcumulable = descuentoAcumulable + descuento;
			}
			precioTotal = precioAcumulable - precioAcumulable * (descuentoAcumulable / 100);
			System.out.println("El precio de su masaje es de " + precioTotal + "euros");
			System.out.println("Disfrute.");

		}
	}
}
