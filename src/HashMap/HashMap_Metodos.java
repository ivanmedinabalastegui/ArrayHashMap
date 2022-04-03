package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Metodos {

    static String BOLD = "\033[1m";
    static String END = "\033[0m";

    HashMap<String, String> Lista = new HashMap<String, String>();

    public void MeterEntrada() {

        Scanner leer = new Scanner(System.in);

        System.out.print(BOLD + "Teclea un País: " + END);
        String Pais = leer.next();
        System.out.print(BOLD + "Teclea un Capital: " + END);
        String Capital = leer.next();

        Lista.put(Pais, Capital);

        System.out.println(BOLD + "Nueva entrada incorporada"+ END);
    }


    public void MostrarEntrada() {
        int x = 0;
        for (String i : Lista.keySet()) {
            System.out.println(BOLD + "Pais: " + END + i + "\n" + BOLD + "Capital: " + END + Lista.get(i));
            System.out.print("\n");
            x = x + 1;
        }
        System.out.println(BOLD + "Hay " + x + " elementos en el Atlas" + END);
    }

    public void BuscarEntrada() {

        Scanner leer = new Scanner(System.in);

        System.out.print(BOLD + "Teclee un país: " + END);
        String PAIS = leer.next();
        if (!Lista.containsKey(PAIS)) {
            System.out.println("\n\t" + BOLD + "Seleccione un pais almacenado en el Atlas" + END);
        } else {
            System.out.println(BOLD + "Capital: " + END + Lista.get(PAIS));
        }
    }

    public void ModificarEntrada() {

        Scanner leer = new Scanner(System.in);

        System.out.print(BOLD + "Teclee un pais: " + END);
        String Pais = leer.next();
        if (!Lista.containsKey(Pais)) {
            System.out.println(BOLD + "Seleccione un pais almacenado en el Atlas para modificarlo" + END);
        } else {
            Lista.remove(Pais);
            System.out.print(BOLD +"Teclea la modificación de capital: " + END);
            String Capital = leer.next();
            Lista.put(Pais, Capital);
        }

    }

    public void EliminarEntrada() {

        Scanner leer = new Scanner(System.in);

        System.out.print(BOLD + "Teclee el pais que desea eliminar: " + END);
        String Pais = leer.next();
        System.out.println(BOLD + "Eliminando " + END + Pais + BOLD + " del Atlas" + END);
        Lista.remove(Pais);
    }

    public void EliminarAtlas() {

        Lista.clear();
        System.out.println(BOLD + "Atlas eliminado por completo" + END);
    }

    public void Salir() {
        System.out.println(BOLD + "Saliendo del programa" + END);
        System.exit(0);
    }

}
