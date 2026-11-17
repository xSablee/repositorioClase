package ejemplo;

import java.io.IOException;
import java.util.Arrays;
import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.BitmapEncoder.BitmapFormat;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.SwingWrapper;

public class Ejemplo2 {
    public static void main(String[] args) throws IOException {
        
        // 1. Creamos el lienzo del gráfico de barras
        CategoryChart grafico = new CategoryChartBuilder()
                .width(800)
                .height(600)
                .title("Lenguaje favorito de la clase")
                .xAxisTitle("Lenguajes")
                .yAxisTitle("Número de votos")
                .build();

        // 2. Añadimos los datos (ejes X e Y)
        grafico.addSeries(
                "Votos 2026",
                Arrays.asList("Java", "Python", "JavaScript", "C++"),
                Arrays.asList(14, 9, 6, 3)
        );

        // 3. Mostramos el gráfico en una ventana interactiva
        new SwingWrapper<>(grafico).displayChart();

        // 4. Además, lo guardamos como imagen PNG en la raíz del proyecto
        BitmapEncoder.saveBitmap(grafico, "./resultado_encuesta", BitmapFormat.PNG);
        System.out.println("Gráfico generado y guardado como resultado_encuesta.png");
    }
}