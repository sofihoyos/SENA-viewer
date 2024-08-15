import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionMenu= -1;
        while(opcionMenu != 0) {
            Methods.mostrarMenu();
            opcionMenu= scanner.nextInt();
            switch (opcionMenu){
                case 1:
                    System.out.println("MOVIES");

            }

        }
    }
}