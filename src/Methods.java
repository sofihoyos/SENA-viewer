import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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

    public static void subMenuMovie(){
        System.out.println("Menu Movies:");
        System.out.println("1. Show Movies");
        System.out.println("2. Add Movies");
        System.out.println("0. Exit");
        System.out.print("Seleccione una opcion (0-2): ");
    }

    public static void subMenuSerie(){
        System.out.println("Menu Movies:");
        System.out.println("1. Show Movies");
        System.out.println("2. Add Movies");
        System.out.println("0. Exit");
        System.out.print("Seleccione una opcion (0-2): ");
    }

    public static void subMenuMagazine(){
        System.out.println("Menu Movies:");
        System.out.println("1. Show Movies");
        System.out.println("2. Add Movies");
        System.out.println("0. Exit");
        System.out.print("Seleccione una opcion (0-2): ");
    }

    public static void subMenuBook(){
        System.out.println("Menu Movies:");
        System.out.println("1. Show Movies");
        System.out.println("2. Add Movies");
        System.out.println("0. Exit");
        System.out.print("Seleccione una opcion (0-2): ");
    }

    //
    public class methodsMovie{
        private static List<Movie> movies = new ArrayList<>();

        public static void addMovies(){
            Scanner scanner = new Scanner(System.in);
        }

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
    }


}
