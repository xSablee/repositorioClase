package programacion_tema_2;
import java.util.Scanner;
public class actividad_1_1 {
	public static void main(String[] args) {
		int numero;
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        scanner.close(); 
    }
}
