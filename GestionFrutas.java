import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionFrutas {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        List<String> listaFrutas = new ArrayList<>();

        FuncionesFrutas.agregarFrutas(listaFrutas, lector);

        FuncionesFrutas.mostrarFrutas(listaFrutas);

        FuncionesFrutas.mostrarCantidad(listaFrutas);

        FuncionesFrutas.reemplazarFruta(listaFrutas, lector);

        FuncionesFrutas.eliminarFruta(listaFrutas, lector);

        System.out.println("\nLista final de frutas:");

        FuncionesFrutas.mostrarFrutas(listaFrutas);

        lector.close();
    }
}