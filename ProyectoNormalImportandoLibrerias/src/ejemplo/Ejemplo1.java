package ejemplo;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Ejemplo1 {
    public static void main(String[] args) {
        
        File archivoPdf = new File("apuntes.pdf");
        String palabraBuscada = "Estructuras";

        // Usamos try-with-resources para que el PDF se cierre solo al terminar
        try (PDDocument documento = Loader.loadPDF(archivoPdf)) {
            
            int totalPaginas = documento.getNumberOfPages();
            System.out.println("Archivo cargado. Total de páginas: " + totalPaginas);
            System.out.println("--------------------------------------------------");

            // 1. Extraer todo el texto del PDF de golpe
            PDFTextStripper lector = new PDFTextStripper();
            String textoCompleto = lector.getText(documento);
            
            // Mostramos los primeros 300 caracteres como vista previa
            System.out.println("VISTA PREVIA:\n" + textoCompleto.substring(0, Math.min(300, textoCompleto.length())) + "...\n");

            // 2. Buscar en qué páginas aparece una palabra concreta
            System.out.println("Buscando la palabra '" + palabraBuscada + "'...");
            
            for (int pagina = 1; pagina <= totalPaginas; pagina++) {
                lector.setStartPage(pagina);
                lector.setEndPage(pagina);
                
                String textoPagina = lector.getText(documento);
                
                // Comprobamos si está (ignorando mayúsculas/minúsculas)
                if (textoPagina.toLowerCase().contains(palabraBuscada.toLowerCase())) {
                    System.out.println("-> Encontrada en la página " + pagina);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el PDF. Asegúrate de que 'apuntes.pdf' está en la raíz del proyecto.");
            e.printStackTrace();
        }
    }
}