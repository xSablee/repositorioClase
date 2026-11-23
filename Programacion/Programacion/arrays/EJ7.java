//7. Realiza un programa que pida la temperatura media (entero) que ha hecho en cada mes de un
//determinado año y que muestre a continuación un diagrama de barras horizontales con esos datos.
//Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter. Se considera
//que las temperaturas estarán entre 0 y 45 grados.

package arrays;

import java.util.Scanner;

public class EJ7 {
	private static Scanner teclado = new Scanner(System.in);
	private static final int MAXIMO_MESES = 12;
	private static final int MAXIMO_TEMPERATURA = 45;
	private static final int MINIMO_TEMPERATURA = 0;

	public static void main(String[] args) {
		int[] mediaTemperaturaPorMes;

		mediaTemperaturaPorMes = solicitarTemperatura();
		diagramaDeTemperaturas(mediaTemperaturaPorMes);
	}

	private static void diagramaDeTemperaturas(int[] mediaTemperaturaPorMes) {
		for (int i = 0; i < mediaTemperaturaPorMes.length; i++) {
			System.out.print("Mes " + (i+1) + " de " + MAXIMO_MESES + ":");
			for (int j = 0; j < mediaTemperaturaPorMes[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static int[] solicitarTemperatura() {
		int[] mediaTemperaturaPorMes = new int[MAXIMO_MESES];
		for (int i = 0; i < mediaTemperaturaPorMes.length; i++) {
			do {
				System.out.println("Inserte temperatura media del mes " + (i + 1) + "/" + MAXIMO_MESES
						+ " del año 2015 (valores entre " + MINIMO_TEMPERATURA + " y " + MAXIMO_TEMPERATURA + ").");
				mediaTemperaturaPorMes[i] = Integer.parseInt(teclado.nextLine());
			} while (mediaTemperaturaPorMes[i] > MAXIMO_TEMPERATURA || mediaTemperaturaPorMes[i] < MINIMO_TEMPERATURA);
		}
		return mediaTemperaturaPorMes;
	}

}
