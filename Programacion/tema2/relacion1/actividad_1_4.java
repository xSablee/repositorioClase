package relacion1;

import java.util.Scanner;

public class actividad_1_4 {
private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
do {System.out.println("Inserte su edad");
edad = Integer.parseInt(teclado.nextLine());
} while (!(edad>=0 || edad<=128));
	
	if (edad<12) {
		System.out.println("Eres un niño");
	}else if (edad<18) {
			System.out.println("Eres un adolescente");
		} else if (edad<30) {
			System.out.println("Eres un joven");
		} else {
			System.out.println("Eres un adulto");
		}
	}
	}

