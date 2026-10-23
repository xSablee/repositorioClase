package relacion1;

import java.util.Scanner;

public class Actividad_1_7 {
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		char caracter;
		System.out.println("Introduzca caracter");
		caracter = teclado.nextLine().charAt(0);
		if (!(caracter=='A' || caracter=='E' || caracter=='I' || caracter=='O' || caracter=='U')) {
			System.out.println("Es una consonante");
		} else {
			System.out.println("Es una vocal");
			if (caracter=='A') {
				System.out.println("Es la primera vocal (A) .");
			} else {
				if (caracter=='E') {
					System.out.println("Es la segunda vocal (E)");
				} else {
					if (caracter=='I') {
						System.out.println("Es la tercera vocal (I)");
					} else {
						if (caracter=='O') {
							System.out.println("Es la cuarta vocal (O)");
						} else {
								System.out.println("Es la quinta vocal (U)");
							}
						}
					}
				}
			}
		}
		
		
		
		
		
		}
