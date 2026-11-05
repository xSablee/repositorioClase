package examen_pruebas;

import java.util.Scanner;

public class Ex_1 {
	private static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		char tamañoPizza, extraQueso, pedirMasPizzas;
		int numeroDeIngredientes;
		double precioAcumulado = 0, precio, precioTotal = 0;
		do {
			do {
				System.out.println("Introduce el tamaño (P-pequeña, M-Mediana, G-grande:");
				tamañoPizza = teclado.nextLine().charAt(0);
			} while (tamañoPizza != 'P' && tamañoPizza != 'M' && tamañoPizza != 'G');
			if (tamañoPizza == 'P') {
				precio = 5;
			} else if (tamañoPizza == 'M') {
				precio = 8;
			} else {
				precio = 10;
			}
			precioAcumulado += precio;
			do {
				System.out.println("Número de ingredientes:");
				numeroDeIngredientes = Integer.parseInt(teclado.nextLine());
			} while (numeroDeIngredientes<=0 || numeroDeIngredientes>8);
			precio = numeroDeIngredientes;
			precioAcumulado += precio;
			do {
				System.out.println("Extra de Queso (S/N):");
				extraQueso = teclado.nextLine().charAt(0);
			} while (extraQueso != 'S' && extraQueso != 'N');
			if (extraQueso == 'S') {
				precio = 1.5;
				precioAcumulado += precio;
			}
			if (numeroDeIngredientes>=3) {
				precioAcumulado = precioAcumulado - precioAcumulado * (0.1);
			}
			System.out.println("El precio de la pizza es " + precioAcumulado + " euros");
			do {
				System.out.println("¿Desea pedir más pizzas (S/N)?");
				pedirMasPizzas = teclado.nextLine().charAt(0);
			} while (pedirMasPizzas != 'S' && pedirMasPizzas != 'N');
			precioTotal += precioAcumulado;
			precioAcumulado = 0;
		} while (pedirMasPizzas == 'S');
		System.out.println("El precio total del pedido es " + precioTotal + " euros");
	}

}
