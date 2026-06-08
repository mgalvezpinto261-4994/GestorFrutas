import java.util.List;
import java.util.Scanner;

public class FuncionesFrutas {

    public static void agregarFrutas(List<String> listaFrutas, Scanner lector) {

        System.out.print("¿Cuántas frutas desea ingresar?: ");
        int cantidad = lector.nextInt();
        lector.nextLine();

        for (int i = 0; i < cantidad; i++) {

            System.out.print("Ingrese una fruta: ");
            String fruta = lector.nextLine();

            listaFrutas.add(fruta);
        }
    }

    public static void mostrarFrutas(List<String> listaFrutas) {

        System.out.println("\nFrutas registradas:");

        for (String fruta : listaFrutas) {

            System.out.println("- " + fruta);
        }
    }

    public static void mostrarCantidad(List<String> listaFrutas) {

        System.out.println("\nCantidad de frutas: " + listaFrutas.size());
    }

    public static void reemplazarFruta(List<String> listaFrutas, Scanner lector) {

        System.out.print("\nIngrese la fruta que desea reemplazar: ");
        String frutaAntigua = lector.nextLine();

        if (listaFrutas.contains(frutaAntigua)) {

            System.out.print("Ingrese la nueva fruta: ");
            String frutaNueva = lector.nextLine();

            int posicion = listaFrutas.indexOf(frutaAntigua);

            listaFrutas.set(posicion, frutaNueva);

            System.out.println("Fruta reemplazada correctamente.");

        } else {

            System.out.println("La fruta no se encuentra en la lista.");
        }
    }

    public static void eliminarFruta(List<String> listaFrutas, Scanner lector) {

        System.out.print("\nIngrese la fruta que desea eliminar: ");
        String frutaEliminar = lector.nextLine();

        if (listaFrutas.contains(frutaEliminar)) {

            listaFrutas.remove(frutaEliminar);

            System.out.println("Fruta eliminada correctamente.");

        } else {

            System.out.println("La fruta no se encuentra en la lista.");
        }
    }
}