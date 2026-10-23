//6. Realizar un programa que lea el número de alumnos que hay en una clase. A continuación debe leer la
//nota de cada uno de ellos en un examen y nos debe informar del número de suspensos y aprobados,
//así como los porcentajes.

package relacion3;

import java.util.Scanner;

public class R3_EJ6 {
	private static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		int numeroDeAlumnos, nota, aprobados = 0, suspensos = 0;
		boolean errorNumeroDeAlumnos = false, errorNota = false;
		do {
			System.out.println("¿Cuántos alumnos hay en clase?");
			numeroDeAlumnos = Integer.parseInt(teclado.nextLine());
			if (numeroDeAlumnos<=0) {
				errorNumeroDeAlumnos = true;
			}
		} while (errorNumeroDeAlumnos);
		for (int i = 0; i < numeroDeAlumnos; i++) {
			do {
				System.out.println("Inserte nota alumno " + (i+1) + "/" + numeroDeAlumnos + (" (la nota debe encontrarse entre 0-10)."));
				nota = Integer.parseInt(teclado.nextLine());
				if (nota<0 || nota>10) {
					errorNota = true;
					System.out.println("Por favor, introduzca nota entre 0-10");
				} else {
					errorNota = false;
						if (nota<5) {
						suspensos++;
					} else {
						aprobados++;
					}
				}
			} while (errorNota);
		}
			System.out.println("Han aprobado un total de " + aprobados + " alumnos.");
			System.out.println("Han suspendido un total de " + suspensos + " alumnos.");
			System.out.println("Por tanto el porcentaje de aprobados de la clase es de " + (( (double) aprobados/numeroDeAlumnos)*100) + "%");				
			}
		}

