package relacion1;
import java.util.Scanner;
public class actividad1_3 {
	private static final int NUMERO_CLAVE_2 = 3;
	private static final int NUMERO_CLAVE_1 = 2;
	private static Scanner scanner = new Scanner(System.in);
	    public static void main(String[] args) {
	        int numero;
	        do {System.out.print("Introduce un número (mayor a 0) ");
	         numero = scanner.nextInt();
			} while (numero>0); 
	        
	        if (numero%NUMERO_CLAVE_1==0 && numero%NUMERO_CLAVE_2==0) {
	            System.out.println("El número " + numero + " es múltiplo de " + NUMERO_CLAVE_1 + " y " + NUMERO_CLAVE_2);
	        } else if (numero%NUMERO_CLAVE_1==0) {
	        	 System.out.println("El número " + numero + " es múltiplo de 3");
			} else if (numero%NUMERO_CLAVE_2==0) {
				System.out.println("El número " + numero + " es múltiplo de 3");
			} else {
	            System.out.println("El número " + numero + " no es múltiplo de 2 o 3");
	        }
	        scanner.close();
	    }
	}
