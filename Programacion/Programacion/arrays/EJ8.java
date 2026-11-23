//8. Realizar un programa que solicite el número de personas invitados a un evento. A continuación
//solicitará 1 a 1 (Introduce el nombre del invitado 1:) el nombre y si son o no invitados vip. Debe
//almacenar esta información en arrays. Posteriormente se mostrará:
//◦ Listado de personas Vip
//◦ Listado de personas Vip ordenadas alfabéticamente. Debe crearse un array con los vip y usar
//Arsys.sort

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EJ8 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String[] listadoInvitados;
		String[] listadoInvitadosVips;
		int totalInvitados, totalInvitadosVips;
		totalInvitados = solicitarNumeroTotalInvitados();
		totalInvitadosVips = solicitarNumeroTotalInvitadosVips(totalInvitados);
		listadoInvitados = solicitarNombre(totalInvitados);
		listadoInvitadosVips = solicitarListadoDeInvitadosVips(listadoInvitados, totalInvitadosVips, totalInvitados);
		System.out.println("Los invitados son los siguientes: " + Arrays.toString(listadoInvitados));
		System.out.println("Los invitados Vips son los siguientes: " + Arrays.toString(listadoInvitadosVips));
	}

	private static int solicitarNumeroTotalInvitadosVips(int totalInvitados) {
		int totalInvitadosVips;

		do {
			System.out.println("¿Cuántos invitados VIPS habrá?");
			totalInvitadosVips = Integer.parseInt(teclado.nextLine());
		} while (totalInvitadosVips < 1 || totalInvitadosVips > totalInvitados);
		return totalInvitadosVips;
	}

	private static String[] solicitarListadoDeInvitadosVips(String[] listadoInvitados, int totalInvitadosVips, int totalInvitados) {
		String[] listadoInvitadosVips = new String[totalInvitadosVips];
		String respuestaVip;
		int i = 0, j = 0;
		do {
			System.out.println("¿Es " + listadoInvitados[i] + " vip? (S/N):");
			respuestaVip = teclado.nextLine().toUpperCase();
			if (respuestaVip.equals("S")) {
				listadoInvitadosVips[j] = listadoInvitados[i];
				j++;
			}
			i++;
		} while (j<totalInvitadosVips && i<totalInvitados);
		Arrays.sort(listadoInvitadosVips);
		return listadoInvitadosVips;
	}

	private static int solicitarNumeroTotalInvitados() {
		int totalInvitados;
		do {
			System.out.println("¿Cuál es total de invitados?");
			totalInvitados = Integer.parseInt(teclado.nextLine());
		} while (totalInvitados <= 0);

		return totalInvitados;
	}

	private static String[] solicitarNombre(int totalInvitados) {
		String[] listadoInvitados = new String[totalInvitados];

		for (int i = 0; i < listadoInvitados.length; i++) {
			System.out.println("Introduzca el nombre del invitado " + (i + 1) + " de " + listadoInvitados.length);
			listadoInvitados[i] = teclado.nextLine();
		}
		Arrays.sort(listadoInvitados);
		return listadoInvitados;
	}

}
