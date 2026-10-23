package relacion1;

import java.util.Scanner;

public class Actividad_1_12 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String tipoDeTarta;
		String nata;
		String escrituraNata;
		String tipoDeTartaDeChocolate ="";
		double precio;
		double precioAcumulativo = 0;
		
		do {
			System.out.println("Que tipo de tarta quiere (Manzana, Fresa o Chocolate)");
			tipoDeTarta = teclado.nextLine().toLowerCase();
			if (tipoDeTarta.equals("chocolate")) {
				do {
					System.out.println("Qué tipo de chocolate (blanco o negro)");
					tipoDeTartaDeChocolate = teclado.nextLine().toLowerCase();
				} while (!tipoDeTartaDeChocolate.equals("blanco") && !tipoDeTartaDeChocolate.equals("negro"));
				
			}
		} while (!(tipoDeTarta.equals("manzana") || tipoDeTarta.equals("fresa") || tipoDeTarta.equals("chocolate")));
		do {
			System.out.println("Desea nata en su tarta (Si/No)");
			nata = teclado.nextLine().toLowerCase();
		} while (!(nata.equals("si") || nata.equals("no")));
		do {
			System.out.println("Desea una escritura en la tarta");
			escrituraNata = teclado.nextLine().toLowerCase();
		} while (!(escrituraNata.equals("si") || escrituraNata.equals("no")));
		
		if (tipoDeTarta.equals("chocolate")) {
			if (tipoDeTartaDeChocolate.equals("blanco")) {
				precio = 15;
				precioAcumulativo = precioAcumulativo + precio;
			} else {
				precio = 14;
				precioAcumulativo = precioAcumulativo + precio;
			}
		} else if (tipoDeTarta.equals("manzana")) {
			precio = 12;
			precioAcumulativo = precioAcumulativo + precio;
		} else {
			precio = 16;
			precioAcumulativo = precioAcumulativo + precio;
		}
		if (nata.equals("si")) {
			precio = 2.5;
			precioAcumulativo = precioAcumulativo + precio;
		}
		if (escrituraNata.equals("si")) {
			precio = 2.75;
			precioAcumulativo = precioAcumulativo + precio;
		}
		System.out.println("El total de su tarta sería de:" + precioAcumulativo + " euros.");
		System.out.println("Muchas gracias, que la disfrute");

	}

}
