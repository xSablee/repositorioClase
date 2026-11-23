package relacion1;

import java.util.Scanner;

public class Actividad_1_8 {
	private static final int EDAD_MEDIA = 35;
	private static final int EDAD_SUPERIOR = 50;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
	char estadoCivil;
	int edad;
	System.out.println("Introduzca su estado civil");
	estadoCivil = teclado.nextLine().charAt(0);
	System.out.println("Introduzca su edad");
	edad = Integer.parseInt(teclado.nextLine());
	
	if (edad>EDAD_SUPERIOR) {
		System.out.println("Se le retendrá" + "8.5%");
	}else if (edad<EDAD_MEDIA && (estadoCivil=='D' || estadoCivil=='S')) {
		System.out.println("Se le retendrá un 12%");
	} else if (edad<EDAD_MEDIA && (estadoCivil=='V' || estadoCivil=='C')) {
		System.out.println("Se le retendrá un 11,3%");
	} else {
		System.out.println("Se le retendrá un 10,5%");
	}
	}

}
