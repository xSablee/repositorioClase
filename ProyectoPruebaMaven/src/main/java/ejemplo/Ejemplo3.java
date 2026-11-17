package ejemplo;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Ejemplo3 {
    public static void main(String[] args) throws IOException {
        
        String url = "https://books.toscrape.com";
        System.out.println("Conectando con " + url + "...\n");

        // 1. Descargamos todo el HTML de la página web
        Document doc = Jsoup.connect(url).get();

        // 2. Mostramos el título de la pestaña del navegador
        System.out.println("TÍTULO DE LA WEB: " + doc.title());
        System.out.println("--------------------------------------------------");

        // 3. Buscamos cada tarjeta de libro (etiqueta <article class="product_pod">)
        Elements libros = doc.select("article.product_pod");

        int contador = 1;
        for (Element libro : libros) {
            // El título completo está en el atributo "title" del enlace dentro de <h3>
            String titulo = libro.select("h3 a").attr("title");
            
            // El precio está dentro de <p class="price_color">
            String precio = libro.select("p.price_color").text();

            System.out.println(contador + ". " + titulo + " --> " + precio);
            contador++;
        }
    }
}