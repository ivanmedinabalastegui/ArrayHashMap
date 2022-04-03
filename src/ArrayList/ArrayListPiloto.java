package ArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListPiloto {

    static String BOLD = "\033[1m";
    static String UNDERLINE = "\033[4m";
    static String END = "\033[0m";

    public static void main(String[] args) {

        ArrayList_Metodos metodos = new ArrayList_Metodos();
        Scanner leer = new Scanner(System.in);

        boolean opcion = true;

        while (opcion) {

            System.out.println("\n\t\t" + BOLD + UNDERLINE + "PROGRAMA ATLAS\n" + END);
            System.out.println(BOLD + "1. Añadir una entrada al atlas" + END);
            System.out.println(BOLD + "2. Mostrar el contenido del atlas" + END);
            System.out.println(BOLD + "3. Buscar una entrada del atlas" + END);
            System.out.println(BOLD + "4. Modificar una entrada del atlas");
            System.out.println(BOLD + "5. Eliminar una entrada del atlas" + END);
            System.out.println(BOLD + "6. Elimina el contenido completo del atlas" + END);
            System.out.println(BOLD + "7. Salir" + END);
            System.out.println(BOLD + "\tTeclea una de las opciones: " + END);

            try {
                int numero = leer.nextInt();
                System.out.print("\n");

                switch (numero) {
                    case 1:
                        metodos.MeterEntrada();
                        break;

                    case 2:
                        metodos.MostrarEntradas();
                        break;

                    case 3:
                        metodos.BuscarEntrada();
                        break;

                    case 4:
                        metodos.ModificarEntrada();
                        break;

                    case 5:
                        metodos.EliminarEntrada();
                        break;

                    case 6:
                        metodos.EliminarAtlas();
                        break;

                    case 7:
                        metodos.Salir();

                        break;

                    default:
                        System.out.println(BOLD + "Teclea un número entero" + END);
                }
            } catch (InputMismatchException e) {
                System.out.println("\n" + BOLD + "Elija una opción correcta" + END);
                leer.nextLine();

            }
        }
        leer.close();
    }
}