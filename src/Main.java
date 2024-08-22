import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionMenu= -1;
        while(opcionMenu != 0) {
            Methods.mostrarMenu();
            opcionMenu= scanner.nextInt();
            int opcionSubMenu=-1;
            switch (opcionMenu) {
                case 1:
                    Methods.subMenuMovie();
                    opcionSubMenu=scanner.nextInt();
                    while (opcionSubMenu != 0){
                        switch (opcionSubMenu){
                            case 1:
                                Methods.methodsMovie.showMovies();
                                break;
                            case 2:
                                break;
                            case 0:
                                System.out.println("Saliendo...");
                                break;
                        }
                    }

                    break;
                case 2:
                    Methods.subMenuSerie();
                    opcionSubMenu=scanner.nextInt();
                    while (opcionSubMenu != 0){
                        switch (opcionSubMenu){
                            case 1:
                                Methods.methodsMovie.showMovies();
                                break;
                            case 2:
                                break;
                            case 0:
                                System.out.println("Saliendo...");
                                break;
                        }
                    }
                    break;
                case 3:
                    Methods.subMenuBook();
                    opcionSubMenu=scanner.nextInt();
                    while (opcionSubMenu != 0){
                        switch (opcionSubMenu){
                            case 1:
                                Methods.methodsMovie.showMovies();
                                break;
                            case 2:
                                break;
                            case 0:
                                System.out.println("Saliendo...");
                                break;
                        }
                    }
                    break;
                case 4:
                    Methods.subMenuMagazine();
                    opcionSubMenu=scanner.nextInt();
                    while (opcionSubMenu != 0){
                        switch (opcionSubMenu){
                            case 1:
                                Methods.methodsMovie.showMovies();
                                break;
                            case 2:
                                break;
                            case 0:
                                System.out.println("Saliendo...");
                                break;
                        }
                    }
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