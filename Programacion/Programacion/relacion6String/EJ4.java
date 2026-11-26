//Realizar un programa que valide el nombre de usuario y contraseña que
//se soliciten.Deben cumplir las siguientes condiciones:
//El nombre de usuario debe estar formado solo por caracteres alfabéticos
//(longitud máxima 30 caracteres).
//La contraseña debe tener como mínimo 7 caracteres y debe contener al
//menos una letra, un dígito y un carácter no alfanumérico.

package relacion6String;

import java.util.Scanner;

public class EJ4 {
	private static final int MAXIMO_LONGITUD_CONTRASEÑA = 7;
	private static final int MAXIMO_LONGITUD_NOMBRE = 30;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String nombre, contraseña;
		boolean contraseñaCorrecta, nombreCorrecto;

		do {
			System.out.println("Introduzca nombre (El nombre de usuario debe estar formado solo por caracteres alfabéticos, longitud máxima 30 caracteres):");
			nombre = teclado.nextLine();
			nombreCorrecto = saberSiNombreEnParametros(nombre);
		} while (!nombreCorrecto);
		
		do {
			System.out.println("Introduzca contraseña (La contraseña debe tener mínimo 7 caracteres y debe contener al menos una letra, un dígito y un carácter):");
			contraseña = teclado.nextLine();
			contraseñaCorrecta = saberSiContraseñaEnParametros(contraseña);
		} while (!contraseñaCorrecta);
	 System.out.println("Nombre y contraseña correctos, muchas gracias");
	}

	private static boolean saberSiContraseñaEnParametros(String contraseña) {
		boolean siEstaEnParametro = false, tieneDigito = false, tieneLetra = false, tieneSpace = false, tieneCaracterNoAlfanumerico = false;
		int i = 0;
		if (contraseña.length()<MAXIMO_LONGITUD_CONTRASEÑA) {
			do {
				tieneDigito = Character.isDigit(contraseña.charAt(i));
				i++;
				} while (!tieneDigito && contraseña.length()>i);
			i = 0;
			if (tieneDigito) {
				do {
					tieneLetra = Character.isLetter(contraseña.charAt(i));
					i++;
				} while (!tieneLetra && contraseña.length()>i);
				i = 0;
			} if (tieneLetra) {
				do {
					tieneDigito = Character.isDigit(contraseña.charAt(i));
					tieneLetra = Character.isLetter(contraseña.charAt(i));
					tieneSpace = Character.isSpaceChar(contraseña.charAt(i)); //En este programa espacio no se considera carácter no alfanumérico
					i++;
					if (!tieneDigito && !tieneLetra && !tieneSpace) {
						tieneCaracterNoAlfanumerico = true;
					}
				} while (!tieneCaracterNoAlfanumerico && contraseña.length()>i);
			}
		}
		if (tieneCaracterNoAlfanumerico) {//si llega al esta condición y este boleano es true, significa que el resto son true.
			siEstaEnParametro = true;
		}
		return siEstaEnParametro;
	}

	private static boolean saberSiNombreEnParametros(String nombre) {
		boolean siEstaEnParametro = false, esLetra;
		int i = 0;

		if (nombre.length() <= MAXIMO_LONGITUD_NOMBRE) {
			do {
				esLetra = Character.isLetter(nombre.charAt(i));
				if (esLetra) {
					i++;
				}
			} while (esLetra && nombre.length()>i);
		}
		if (i == nombre.length()) {
			siEstaEnParametro = true;
		}
		return siEstaEnParametro;
	}

}
