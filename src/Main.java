import java.util.Scanner;
import edu.misena.senaviewer.model.Movie;
import edu.misena.senaviewer.model.Serie;
import edu.misena.senaviewer.model.Book;
import edu.misena.senaviewer.model.Magazine;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionMenu = -1;

        Methods.addMovie(new Movie("Inception", "Sci-Fi", "Christopher Nolan", 148, 50));
        Methods.addSerie(new Serie("Stranger Things", "Science Fiction", "Matt y Ross Duffer", 50, 65, 4));
        Methods.addBook(new Book(234, "1984", "8 de junio de 1949", "National Geographic Partners", "Secker & Warburg", "978-0451524935", true, 250));
        Methods.addMagazine(new Magazine(123, "National Geographic", "Agosto 2024", "National Geographic Partners", "vogue"));

        while (opcionMenu != 0) {
            Methods.mostrarMenu();
            opcionMenu = scanner.nextInt();
            scanner.nextLine();

            switch (opcionMenu) {
                case 1:
                    Methods.showMovies();
                    break;
                case 2:
                    Methods.showSerie();
                    break;
                case 3:
                    Methods.showBook();
                    break;
                case 4:
                    Methods.showMagazine();
                    break;
                case 5:
                    //report
                    break;
                case 6:
                    // report today
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 0 al 6.");
            }
        }
        scanner.close();
    }
}
