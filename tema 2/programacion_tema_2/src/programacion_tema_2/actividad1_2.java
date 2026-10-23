//autor: Rubio Casanova, Álvaro;
package programacion_tema_2;
import java.util.Scanner;
public class actividad1_2 {
	 private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
        int lado1,lado2,lado3;
        
        do {System.out.print("Introduce la longitud del primer lado: ");
        lado1 = scanner.nextInt();
        
        System.out.print("Introduce la longitud del segundo lado: ");
        lado2 = scanner.nextInt();
        
        System.out.print("Introduce la longitud del tercer lado: ");
        lado3 = scanner.nextInt();	
		} while (!(lado1>0 && lado2>0 && lado3>0));

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triángulo es Equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("El triángulo es Isósceles");
        } else {
            System.out.println("El triángulo es Escaleno");
        }
        
        scanner.close();
    }
}
