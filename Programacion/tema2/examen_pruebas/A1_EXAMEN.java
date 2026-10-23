package examen_pruebas;

import java.util.Scanner;

public class A1_EXAMEN {

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
			diaDeLaSemana = teclado.nextLine();
		} while (!diaDeLaSemana.equals("L") && !diaDeLaSemana.equals("M") && !diaDeLaSemana.equals("X")
				&& !diaDeLaSemana.equals("J") && !diaDeLaSemana.equals("V") && !diaDeLaSemana.equals("S")
				&& !diaDeLaSemana.equals("D"));
		do {
			System.out.println("¿Tienes tarjeta CineMonroy (S/N)?");
			tarjetaMonroy = teclado.nextLine();
		} while (!tarjetaMonroy.equals("S") && !tarjetaMonroy.equals("N"));
		if (diaDeLaSemana.equals("X")) {
			precio = 5 * numeroDeEntradas;
			precioTotal = precio;
		} else {
			if (diaDeLaSemana.equals("J")) {
				precio = numeroDeEntradas / 2 * 11 + numeroDeEntradas % 2 * 8;
			} else {
				precio = 8 * numeroDeEntradas;
			}
			if (tarjetaMonroy.equals("S")) {
				precioTotal = precio - precio * 10 / 100;
		} else {
			precioTotal = precio;
		}
		}
		System.out.println("El precio de su compra es de " + precioTotal + " euros");

	}
}
