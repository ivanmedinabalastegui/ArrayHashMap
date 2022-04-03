package ArrayList;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Metodos {

    ArrayList<String> ListaPais = new ArrayList<String>();
    ArrayList<String> ListaCapital = new ArrayList<String>();

    static String BOLD = "\033[1m";
    static String END = "\033[0m";

    public void MeterEntrada() {

        Scanner leer = new Scanner(System.in);

        System.out.print(BOLD + "Teclea un País: " + END);
        String Pais = leer.next();
        System.out.print(BOLD + "Teclea su Capital: " + END);
        String Capital = leer.next();

        ListaPais.add(Pais);
        ListaCapital.add(Capital);

        System.out.println("\n\t\t" + BOLD + "Nueva entrada incorporada" + END + "\n");
    }

    public void MostrarEntradas() {

        int numero = ListaPais.size();

        for (int i = 0; i < numero; i++) {
            System.out.println(BOLD + "País: " + END + ListaPais.get(i));
            System.out.println(BOLD + "Capital: " + END + ListaCapital.get(i) + "\n");
        }

        System.out.println("\t\t" + BOLD + "Hay " + numero + " elementos en el Atlas" + END);
    }

    public void BuscarEntrada() {

        try {
            Scanner leer = new Scanner(System.in);

            System.out.print(BOLD + "Teclea un País: " + END);
            String Pais = leer.next();
            int ind = ListaPais.indexOf(Pais);
            if (ListaCapital.get(ind) == null) {
                System.out.println(BOLD + "De este país no se encuentra capital" + END);
            } else {
                System.out.println(BOLD + "Capital: " + END + ListaCapital.get(ind));
            }
        } catch (Exception e) {
            System.out.println("\n\t" + BOLD + "Seleccione un país del Atlas" + END);
        }
    }

    public void ModificarEntrada() {

        try {
            Scanner leer = new Scanner(System.in);

            System.out.print(BOLD + "Teclea un país: " + END);
            String Pais = leer.next();
            int ind = ListaPais.indexOf(Pais);
            System.out.print(BOLD + "Teclea la modificación de Capital: " + END);
            String NuevoPais = leer.next();
            ListaCapital.set(ind, NuevoPais);
        }
        catch (Exception e) {
            System.out.println("\n\t" + BOLD + "Por favor, seleccione un pais almacenado en el Atlas" + END);
        }
    }

    public void EliminarEntrada() {

        Scanner leer = new Scanner(System.in);

        System.out.print(BOLD + "Teclee el pais que desea eliminar: " + END);
        String Pais = leer.next();
        int numero = ListaPais.indexOf(Pais);
        System.out.println(BOLD + "Eliminando " + END + Pais + BOLD + " del Atlas" + END);
        ListaPais.remove(numero);
        ListaCapital.remove(numero);

    }

    public void EliminarAtlas() {

        ListaPais.clear();
        ListaCapital.clear();
        System.out.println(BOLD + "Atlas eliminado por completo" + END);

    }

    public void Salir() {
        System.out.println(BOLD + "Saliendo del programa" + END);
        System.exit(0);
    }
}
