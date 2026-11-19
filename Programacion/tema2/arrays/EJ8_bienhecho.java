//8. Realizar un programa que solicite el número de personas invitados a un evento. A continuación
//solicitará 1 a 1 (Introduce el nombre del invitado 1:) el nombre y si son o no invitados vip. Debe
//almacenar esta información en arrays. Posteriormente se mostrará:
//◦ Listado de personas Vip
//◦ Listado de personas Vip ordenadas alfabéticamente. Debe crearse un array con los vip y usar
//Arsys.sort

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EJ8_bienhecho {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int totalInvitados, totalInvitadosVips;
		String[] listadoInvitados = null;
		boolean[] listadoInvitadosVipsBoolean = null;
		String[] listadoInvitadosVipsString = null;

		totalInvitados = solicitarTotalInvitados();
		listadoInvitados = new String[totalInvitados];
		listadoInvitadosVipsBoolean = new boolean[totalInvitados];

		solicitarNombresYSiVip(listadoInvitados, listadoInvitadosVipsBoolean, listadoInvitadosVipsString);

		totalInvitadosVips = calcularLengthDelArraysDeInvitados(listadoInvitados, listadoInvitadosVipsBoolean,
				listadoInvitadosVipsString);

		listadoInvitadosVipsString = new String[totalInvitadosVips];
		crearArrayDeLosInvitados(listadoInvitados, listadoInvitadosVipsBoolean, listadoInvitadosVipsString);
		System.out.println("Los invitados son:" + Arrays.toString(listadoInvitados));
		System.out.println("Los invitados vips son:" + Arrays.toString(listadoInvitadosVipsString));
	}

	private static int calcularLengthDelArraysDeInvitados(String[] listadoInvitados,
			boolean[] listadoInvitadosVipsBoolean, String[] listadoInvitadosVipsString) {
		int totalVips = 0;

		for (int i = 0; i < listadoInvitadosVipsBoolean.length; i++) {
			if (listadoInvitadosVipsBoolean[i]) {
				totalVips++;
			}
		}
		return totalVips;
	}

	private static int solicitarTotalInvitados() {
		int totalInvitados;

		do {
			System.out.println("Inserte el número total de Invitados");
			totalInvitados = Integer.parseInt(teclado.nextLine());
		} while (totalInvitados <= 0);

		return totalInvitados;
	}

	private static void crearArrayDeLosInvitados(String[] listadoInvitados, boolean[] listadoInvitadosVipsBoolean,
			String[] listadoInvitadosVipsString) {
		int i = 0, j = 0;

		do {
			if (listadoInvitadosVipsBoolean[i]) {
				listadoInvitadosVipsString[j] = listadoInvitados[i];
				j++;
			}
			i++;
		} while (j < listadoInvitadosVipsString.length);
		Arrays.sort(listadoInvitadosVipsString);
	}

	private static void solicitarNombresYSiVip(String[] listadoInvitados, boolean[] listadoInvitadosVipsBoolean,
			String[] listadoInvitadosVipsString) {
		char respuestaVip;

		for (int i = 0; i < listadoInvitadosVipsBoolean.length; i++) {
			System.out.println("Inserte el nombre del invitado " + (i + 1) + " de " + listadoInvitados.length);
			listadoInvitados[i] = teclado.nextLine().toUpperCase();
			do {
				System.out.println("¿Es este invitado VIP? (S/N)");
				respuestaVip = teclado.nextLine().charAt(0);
			} while (respuestaVip != 'S' && respuestaVip != 'N');
			if (respuestaVip == 'S') {
				listadoInvitadosVipsBoolean[i] = true;
			} else {
				listadoInvitadosVipsBoolean[i] = false;
			}
		}
	}

}