//En un videojuego se dispone de un array con los objetos que tiene un personaje en su mochila
//String[] mochila = {"Espada de Madera", "Poción de Vida", "Escudo", "Manzana", , "Pico de Hierro"};
//Realizar un programa que solicite un objeto e indique si está o no en la mochila. Usa equals para
//comparar String
package arrays;

import java.util.Scanner;

public class ej3 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		boolean objetoEncontrado;
		String[] mochila = { "espada de madera", "poción de vida", "escudo", "manzana", "pico de Hierro" };
		objetoEncontrado = objetoABuscar(mochila);
		if (objetoEncontrado) {
			System.out.println("El objeto se encuentra en la mochila");
		} else {
			System.out.println("El objeto no se encuentra en la mochila");
		}
	}

	private static boolean objetoABuscar(String[] mochila) {
		String busqueda;
		boolean objetoEncontrado = false;
		System.out.println("Introduzca el objeto que desea buscar en la mochila:");
		busqueda = teclado.nextLine().toLowerCase();
		for (int i = 0; i < mochila.length; i++) {
			if (mochila[i].equals(busqueda)) {
				objetoEncontrado = true;
			}
		}
		return objetoEncontrado;
	}

}
