//2. Realizar un método que dado un número positivo devuelva su factorial. Si el número es negativo se 
//mostrará un mensaje de error y se devolverá un -1. 
//Utilizar este método desde el main para escribir los factoriales desde 0 hasta un número límite que se pida 
//por teclado. 
//La salida en pantalla será de esta forma: 
//Introduce un número límite para calcular factoriales: 4
//0! = 1 
//1! = 1 
//2! = 2 
//3! = 6 
//4! = 24
package relacion4_ej2;

import java.util.Scanner;

public class EJ3_R4 {
	private static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		int numeroIntroducido, factorial;
		
			System.out.println("Introduzca número positivo");
			numeroIntroducido = Integer.parseInt(teclado.nextLine());
			factorial = factoriales(numeroIntroducido);
			System.out.println("El factorial de " + numeroIntroducido + " con los límites establecidos es: " + factorial);
		
	}
	public static int factoriales (int numeroIntroducido) {
		int valorLimite, resultado = 1;
		if (numeroIntroducido<0) {
			System.out.println("Error");
			resultado = -1;
		} else {
			do {
				System.out.println("Introduzca valor límite para calcular factorial (igual o superior a 0)");
				valorLimite = Integer.parseInt(teclado.nextLine());
			} while (valorLimite<0);
			if (valorLimite>0) {
				for (int i = 1; i <= valorLimite; i++) {
					resultado *= i;
				}
			}
			
		}
		return resultado;
	}

}
