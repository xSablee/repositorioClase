import java.util.Scanner;

public class ActividadR2_1 {
private static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
	int numeroMultiplicar;
	do {
		System.out.println("Introduzca número entre 1-10 para visualizar su tabla de multiplicar");
		numeroMultiplicar = Integer.parseInt(teclado.nextLine());
	} while (!(numeroMultiplicar>=0 && numeroMultiplicar<=10)); 
	for (int i = 0; i <= 10; i++) {
		System.out.println(numeroMultiplicar + " * " + i + " = " + (numeroMultiplicar*i));
	}

	}

}
