import java.util.ArrayList;
import java.util.List;
import edu.misena.senaviewer.model.Movie;
import edu.misena.senaviewer.model.Serie;
import edu.misena.senaviewer.model.Book;
import edu.misena.senaviewer.model.Magazine;

public class Methods {

    public static List<Movie> methodsMovie = new ArrayList<>();
    public static List<Serie> methodsSerie = new ArrayList<>();
    public static List<Book> methodsBook = new ArrayList<>();
    public static List<Magazine> methodsMagazine = new ArrayList<>();

    public static void mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1. Movies");
        System.out.println("2. Series");
        System.out.println("3. Books");
        System.out.println("4. Magazines");
        System.out.println("5. Report");
        System.out.println("6. Report Today");
        System.out.println("0. Exit");
        System.out.print("Seleccione una opcion (0-6): ");
    }

    // Métodos para agregar y mostrar películas
    public static void addMovie(Movie movie) {
        methodsMovie.add(movie);
    }

    public static void showMovies() {
        for (Movie movie : methodsMovie) {
            System.out.println(movie);
        }
    }



    // Métodos para agregar y mostrar series
    public static void addSerie(Serie serie) {
        methodsSerie.add(serie);
    }

    public static void showSerie() {
        for (Serie serie : methodsSerie) {
            System.out.println(serie);
        }
    }



    // Métodos para agregar y mostrar libros
    public static void addBook(Book book) {
        methodsBook.add(book);
    }

    public static void showBook() {
        for (Book book : methodsBook) {
            System.out.println(book);
        }
    }



    // Métodos para agregar y mostrar revistas
    public static void addMagazine(Magazine magazine) {
        methodsMagazine.add(magazine);
    }

    public static void showMagazine() {
        for (Magazine magazine : methodsMagazine) {
            System.out.println(magazine);
        }
    }
}
