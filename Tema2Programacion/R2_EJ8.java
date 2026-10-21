//Realizar un programa que solicite un conjunto de números. Después de introducir cada número se
//realizará la pregunta: "¿Desea introducir más números (S/N)". Si la respuesta es 'S' se solicitará otro
//número. Cuando no desee introducir más números debe informar cual es el menor de los números
//introducidos.
//NOTA: Debe comprobarse que la respuesta es 'S' o 'N' y si no lo es, volver a pedirla.

import java.util.Scanner;

public class R2_EJ8 {
	private static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		int numeros, menor = 999999999; //es necesario asignarle eso a menor para que cuando el usuario introduzca solo un número siga funcionando.
		String respuesta ;		
		do {
			System.out.println("Introduce número:");
			numeros = Integer.parseInt(teclado.nextLine());
			System.out.println("Desea introducir más números (S/N)");
			respuesta = teclado.nextLine();
			
			if (numeros<menor) {
				menor = numeros;
			} 
		} while (respuesta.equalsIgnoreCase("S"));
		System.out.println("El número menor es " + menor);
	}
}
