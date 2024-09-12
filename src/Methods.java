import java.util.ArrayList;
import java.util.List;
import edu.misena.senaviewer.model.Movie;
import edu.misena.senaviewer.model.Serie;
import edu.misena.senaviewer.model.Book;
import edu.misena.senaviewer.model.Magazine;

public class Methods {

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

    public static class methodsMovie {
        private static List<Movie> movies = new ArrayList<>();

        public static void showMovies() {
            if (movies.isEmpty()) { // verifica que si hay datos dentro de este y continua
                System.out.println("No hay películas disponibles.");
            } else {
                System.out.println("Lista de películas:");
                for (Movie movie : movies) {
                    System.out.println("ID: " + movie.getId());
                    System.out.println("Título: " + movie.getTitle());
                    System.out.println("Género: " + movie.getGender());
                    System.out.println("Creador: " + movie.getCreator());
                    System.out.println("Duración: " + movie.getDuration() + " minutos");
                    System.out.println("Año: " + movie.getYear());
                    System.out.println("Visto: " + (movie.getViewed() ? "Sí" : "No"));
                    System.out.println("Tiempo visto: " + movie.getTimeViewed() + " minutos");
                    System.out.println();
                }
            }
        }

        public static void addMovie(Movie movie) {
            movies.add(movie);
            System.out.println("Película agregada:");
            System.out.println(movie);
        }
    }

    public static class methodsSerie {
        private static List<Serie> series = new ArrayList<>();

        public static void showSerie() {
            if (series.isEmpty()) {
                System.out.println("No hay series disponibles.");
            } else {
                System.out.println("Lista de series:");
                for (Serie serie : series) {
                    System.out.println("Id: " + serie.getId());
                    System.out.println("Título: " + serie.getTitle());
                    System.out.println("Género: " + serie.getGender());
                    System.out.println("Creador: " + serie.getCreator());
                    System.out.println("Duración: " + serie.getDuration() + " minutos");
                    System.out.println("Año: " + serie.getYear());
                    System.out.println("Visto: " + (serie.getViewed() ? "Sí" : "No"));
                    System.out.println("Tiempo visto: " + serie.getTimeViewed() + " minutos");
                    System.out.println("Temporadas: " + serie.getSessionQuantity());
                    System.out.println();
                }
            }
        }

        public static void addSerie(Serie serie) {
            series.add(serie);
            System.out.println("Serie agregada:");
            System.out.println(serie);
        }
    }

    public static class methodsBook {
        private static List<Book> books = new ArrayList<>();

        public static void showBook() {
            if (books.isEmpty()){
                System.out.println("No hay libros disponibles.");
            } else {
                System.out.println("Lista de libros:");
                for(Book book : books){
                    System.out.println("id:" + book.getId());
                    System.out.println("Título: " + book.getTitle());
                    System.out.println("Fecha edicion:" + book.getEdititionDate());
                    System.out.println("Editorial: " + book.getEditorial());
                    System.out.println("Autor:" + book.getAuthors());
                    System.out.println("Isbn:" + book.getIsbn());
                    System.out.println("Leido: " + (book.getReaded() ? "Sí" : "No"));
                    System.out.println("Tiempo de lectura: " + book.getTimeReaded() + " minutos");
                }
            }
        }

        public static void addBook(Book book) {
            books.add(book);
            System.out.println("Libro agregado:");
            System.out.println(book);
        }
    }

    public static class methodsMagazine {
        private static List<Magazine> magazines = new ArrayList<>();

        public static void showMagazine() {
            if (magazines.isEmpty()) {
                System.out.println("No hay revistas disponibles. ");
            } else {
                System.out.println("Lista de revitas: ");
                for (Magazine magazine : magazines) {
                    System.out.println("id:" + magazine.getId());
                    System.out.println("Título: " + magazine.getTitle());
                    System.out.println("Fecha edicion: " + magazine.getEdititionDate());
                    System.out.println("Editorial: " + magazine.getEditorial());
                    System.out.println("Autor: " +magazine.getAuthors());
                }
            }
        }

        public static void addMagazine(Magazine magazine) {
            magazines.add(magazine);
            System.out.println("Revista agregada:");
            System.out.println(magazine);
        }
    }
}
