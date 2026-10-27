package examen_pruebas;

import java.util.Scanner;

public class A1_EXAMEN {

	private static final int PRECIO_ENTRADA_REGULAR = 8;
	private static final int PRECIO_ENTRADA_MIERCOLES = 5;
	private static final int PORCENTAJE_DESCUENTO_TARJETA_MONROY = 10;
	private static final int PRECIO_2_ENTRADAS_PAREJA_JUEVES = 11;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int numeroDeEntradas;
		String diaDeLaSemana, tarjetaMonroy;
		double precio, precioTotal;
		precioTotal = 0;
		do {
			System.out.println("Número de entradas: ");
			numeroDeEntradas = Integer.parseInt (teclado.nextLine());
		} while (numeroDeEntradas <= 0);
		do {
			System.out.println("Día de la semana (L, M, X, J, V, S, D):");
			diaDeLaSemana = teclado.nextLine().toUpperCase();
		} while (!diaDeLaSemana.equals("L") && !diaDeLaSemana.equals("M") && !diaDeLaSemana.equals("X")
				&& !diaDeLaSemana.equals("J") && !diaDeLaSemana.equals("V") && !diaDeLaSemana.equals("S")
				&& !diaDeLaSemana.equals("D"));
		do {
			System.out.println("¿Tienes tarjeta CineMonroy (S/N)?");
			tarjetaMonroy = teclado.nextLine();
		} while (!tarjetaMonroy.equals("S") && !tarjetaMonroy.equals("N"));
		if (diaDeLaSemana.equals("X")) {
			precio = PRECIO_ENTRADA_MIERCOLES * numeroDeEntradas;
			precioTotal = precio;
		} else {
			if (diaDeLaSemana.equals("J")) {
				precio = numeroDeEntradas / 2 * PRECIO_2_ENTRADAS_PAREJA_JUEVES + numeroDeEntradas % 2 * 8;
			} else {
				precio = PRECIO_ENTRADA_REGULAR * numeroDeEntradas;
			}
			if (tarjetaMonroy.equals("S")) {
				precioTotal = precio - precio * PORCENTAJE_DESCUENTO_TARJETA_MONROY / 100;
		} else {
			precioTotal = precio;
		}
		}
		System.out.println("El precio de su compra es de " + precioTotal + " euros");

	}
}
