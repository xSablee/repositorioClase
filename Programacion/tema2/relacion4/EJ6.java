package relacion4;

import java.util.Scanner;

public class EJ6 {
	 Scanner teclado = new Scanner(System.in);
	 public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        int dia, mes, anno;
	        boolean correcta;

	        do {
	            System.out.println("--- Introduce una fecha válida ---");
	            System.out.print("Introduce el día: ");
	            dia = Integer.parseInt(teclado.nextLine());

	            System.out.print("Introduce el mes: ");
	            mes = Integer.parseInt(teclado.nextLine());

	            System.out.print("Introduce el año: ");
	            anno = Integer.parseInt(teclado.nextLine());

	            correcta = esFechaValida(dia, mes, anno);

	            if (!correcta) {
	                System.out.println("Error: La fecha introducida no existe. Inténtalo de nuevo.\n");
	            }

	        } while (!correcta);

	        // Guardamos el resultado del método
	        siguienteFecha(dia, mes, anno);

	        System.out.println("\nPrograma finalizado correctamente.");

	        teclado.close();
	    }

	    public static void siguienteFecha(int diaActual, int mesActual, int annoActual) {
	        int diaManana = diaActual + 1;
	        int mesManana = mesActual;
	        int annoManana = annoActual;

	        // Guardamos el resultado del método
	        int diasDelMes = obtenerDiasDelMes(mesActual, annoActual);

	        if (diaManana > diasDelMes) {
	            diaManana = 1;
	            mesManana++;

	            if (mesManana > 12) {
	                mesManana = 1;
	                annoManana++;
	            }
	        }

	        System.out.println("\nLa fecha de hoy es " + diaActual + "-" + mesActual + "-" + annoActual);
	        System.out.println("La fecha de mañana es " + diaManana + "-" + mesManana + "-" + annoManana);
	    }

	    public static boolean esFechaValida(int dia, int mes, int anno) {
	        boolean esValida = true;

	        if (anno < 1 || mes < 1 || mes > 12 || dia < 1) {
	            esValida = false;
	        } else {
	            // Guardamos los días del mes en una variable
	            int diasDelMes = obtenerDiasDelMes(mes, anno);

	            if (dia > diasDelMes) {
	                esValida = false;
	            }
	        }

	        return esValida;
	    }

	    public static int obtenerDiasDelMes(int mes, int anno) {
	        int dias = 31;

	        switch (mes) {
	            case 4:
	            case 6:
	            case 9:
	            case 11:
	                dias = 30;
	                break;

	            case 2:
	                if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
	                    dias = 29;
	                } else {
	                    dias = 28;
	                }
	                break;
	        }

	        return dias;
	    }
	}