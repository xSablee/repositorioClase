//9. Realizar un programa que muestre todas las tablas de multiplicar (del 0 al 10).
//◦ Tabla del 0
//▪ 0 x 0=0
//▪ ….
//▪ 0x10=10
//◦ Tabla del 1
//▪ 1 x 0=0
//▪ ….
//▪ 1x10=10
package relacion3;

public class R3_EJ9 {

	private static final int MULTIPLICADOR_MAXIMO = 10;

	public static void main(String[] args) {
		int contadorTablas; //contador del bucle for primero que te dice la tabla que se va a calcular
		int contadorMultiplicaciones; //contador del bucle for que te calcule la multiplicación previamente hecha
		for (contadorTablas = 0; contadorTablas <= MULTIPLICADOR_MAXIMO; contadorTablas++) {
			System.out.println("Tabla del " + contadorTablas);
			for (contadorMultiplicaciones = 0; contadorMultiplicaciones <= MULTIPLICADOR_MAXIMO; contadorMultiplicaciones++) {
				System.out.println("\t  " + contadorTablas + "*" + contadorMultiplicaciones + "=" + (contadorTablas * contadorMultiplicaciones));
			}
			if (contadorTablas < MULTIPLICADOR_MAXIMO) {
				System.out.println();
			} 
			
		}

	}
}
