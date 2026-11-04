//RELACIÓN DE PROBLEMAS 4. Programación modular
//Resolver los siguientes problemas en Java. Realizarla en un sólo proyecto llamado Relacion4, con un 
//paquete por cada ejercicio. En toda la relación se usarán métodos public static.
//1. Realizar un método llamado solicitarNumeroEnRango. El método devuelve un entero y tendrá 
//como parámetros de entrada: 
//◦ límite inferior
//◦ límite superior
//El método solicitará un número comprendido entre esos dos valores y lo devolverá. Si no está en el rango lo
//volverá a solicitar . Si el límite inferior es mayor al limite superior, los intercambia. 
//Probarlo desde el main.
package relacion4_ej1;

import java.util.Scanner;

public class EJ1_R4 {
	public static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		int limite1,limite2, resultado;
		System.out.println("Introduzca los valores númericos límite");
		System.out.println("Número límite 1:");
		limite1 =  Integer.parseInt(teclado.nextLine());
		System.out.println("Número límite 2:");
		limite2 =  Integer.parseInt(teclado.nextLine());
		resultado = solicitarNumeroEnRango(limite1,limite2);
		System.out.println("El número " + resultado + " se encuentra entre los límites asignados");
	}

	
	public static int solicitarNumeroEnRango (int limiteInferior, int limiteSuperior) {
		int numeroIntroducido, auxiliar;
		
		if (limiteInferior>limiteSuperior) {
			auxiliar = limiteInferior;
			limiteInferior = limiteSuperior;
			limiteSuperior = auxiliar;
		}
		do {
			System.out.println("Introduzca número comprendido entre " + limiteInferior + " y " + limiteSuperior + ".");
			numeroIntroducido = Integer.parseInt(teclado.nextLine());
		} while (!(numeroIntroducido>limiteInferior & numeroIntroducido<limiteSuperior));

		return numeroIntroducido;
		
	}
}
