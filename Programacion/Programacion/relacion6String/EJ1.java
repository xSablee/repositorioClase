//1. Realizar un método que tenga como parámetros de entrada una cadena
//de caracteres y un carácter y devuelva cuántas veces aparece ese
//carácter en la cadena. No debe distinguir entre caracteres mayúsculas y
//minúsculas.
package relacion6String;

public class EJ1 {

	public static void main(String[] args) {
		String[] cadenaDeCaracteres = {"hola", "adios", "hasta luego", "buenos", "días", "buenas tardes", "buenas noches", "hasta mañana"};
		String caracterDelArrayDeCadema = "a";
		int repeticionesDeCaracterDelArrayDeCadena = 0;
		
		repeticionesDeCaracterDelArrayDeCadena = vecesQueApareceCaracterEnLaCadena(cadenaDeCaracteres,caracterDelArrayDeCadema);
		System.out.println("Se repite la letra un total de " + repeticionesDeCaracterDelArrayDeCadena);
	}

	private static int vecesQueApareceCaracterEnLaCadena(String[] cadenaDeCaracteres, String caracterDelArrayDeCadema) {
		int repeticionesDeCaracterDelArrayDeCadena = 0;
		boolean estaElCaracter = false;
		for (int i = 0; i < cadenaDeCaracteres.length; i++) {
			estaElCaracter = cadenaDeCaracteres[i].contains(caracterDelArrayDeCadema);
			if (estaElCaracter) {
				repeticionesDeCaracterDelArrayDeCadena++;
			}
			estaElCaracter = false;
		}
		return repeticionesDeCaracterDelArrayDeCadena;
	}

}
