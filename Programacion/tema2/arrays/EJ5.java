//5. Se dispone de un array con la duración en segundos de los vídeos que ha visto un usuario en su
//última sesión de TikTok. Para simularlo en este ejercicio carga el array con datos aleatorios entre 1-100
//segundos. Por ejemplo:
//int[] duracionVideos = {15, 60, 8, 120, 30, 45, 90, 5};
//Se pide
//1. Mostrar cuántos vídeos largos se han visto ( duran más de 45 segundos).
//2. Calcula el tiempo total consumido por el usuario en minutos y segundos.
//3. Encuentra la posición (índice, contando desde 1) del vídeo más largo.
//4. Encuentra la posición (índice, contando desde 1) del primer vídeo que el usuario saltó casi al
//instante (menos de 10 segundos).

package arrays;

import java.util.Arrays;

public class EJ5 {

	private static final int DURACION_LIMITE_VIDEO_LARGO = 20;
	private static final int MAXIMO_NUM_VIDEOS = 8;

	public static void main(String[] args) {
		int[] duracionVideos = new int[MAXIMO_NUM_VIDEOS];
		int numVideosLargos, posicionVideoMasLargo, posicionVideoQueSalto;
		int minutos = 0, segundos = 0;
		int[] minutosSegundos;

		segundosAleatoriosTikTok(duracionVideos);
		numVideosLargos = videosLargosVistos(duracionVideos);
		minutosSegundos = minutosSegundosVisualizacion(duracionVideos);
		System.out.println(Arrays.toString(minutosSegundos));
		posicionVideoMasLargo = videoMasLargo(duracionVideos);
		posicionVideoQueSalto = videoSaltadoAntes(duracionVideos);
		salidasDeVariables(duracionVideos, posicionVideoMasLargo, posicionVideoQueSalto, minutosSegundos,
				numVideosLargos);
	}

	private static void salidasDeVariables(int[] duracionVideos, int posicionVideoMasLargo, int posicionVideoQueSalto,
			int[] minutosSegundos, int numVideosLargos) {
		System.out.println("Ha visto un total de " + numVideosLargos + " de videos de más de 45 segundos de duración");
		System.out.println("Ha consumido un total de " + minutosSegundos[0] + " minutos y " + minutosSegundos[1]
				+ " segundos en visualización");
		System.out.println("El vídeo más largo que ha visto es el número " + (posicionVideoMasLargo + 1) + ".");
		System.out.println("El primer video que saltó en menos de diez segundos fue el número "
				+ (posicionVideoQueSalto + 1) + ".");

	}

	private static int videoSaltadoAntes(int[] duracionVideos) {
		int posicionVideoQueSalto = -1, i = 0;
		while (posicionVideoQueSalto == -1 && i < duracionVideos.length) {
			if (duracionVideos[i] < 10) {
				posicionVideoQueSalto = i;
			}
			i++;
		}
		return posicionVideoQueSalto;
	}

	private static int videoMasLargo(int[] duracionVideos) {
		int posicionVideoMasLargo = 0, minutosVideosMasLargo = duracionVideos[0];
		for (int i = 1; i < duracionVideos.length; i++) {
			if (duracionVideos[i] > minutosVideosMasLargo) {
				posicionVideoMasLargo = i;
				minutosVideosMasLargo = duracionVideos[i];
			}
		}
		return posicionVideoMasLargo;
	}

	private static int[] minutosSegundosVisualizacion(int[] duracionVideos) {
		int minutos = 0, segundos = 0;
		int[] minutosSegundos = new int[2];
		for (int i = 0; i < duracionVideos.length; i++) {
			segundos += duracionVideos[i];
		}
		minutos = segundos / 60;
		segundos = segundos % 60;
		minutosSegundos[0] = minutos;
		minutosSegundos[1] = segundos;
		return minutosSegundos;
	}

	private static int videosLargosVistos(int[] duracionVideos) {
		int numVideosLargos = 0;
		for (int i = 0; i < duracionVideos.length; i++) {
			if (duracionVideos[i] > DURACION_LIMITE_VIDEO_LARGO) {
				numVideosLargos++;
			}
		}
		return numVideosLargos;
	}

	private static void segundosAleatoriosTikTok(int[] duracionVideos) {
		for (int i = 0; i < duracionVideos.length; i++) {
			duracionVideos[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(duracionVideos));
	}

}
