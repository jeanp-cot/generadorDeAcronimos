import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String nombre = "Infrastructure as a service ";

        String acronimo = obtenerAcronimo(nombre);

        System.out.println(acronimo);
    }

    private static String obtenerAcronimo(String nombre) {
        String[] palabrasSeparadas = separarPalabras(nombre);
        String acronimo = "";
        for (String palabra : palabrasSeparadas) {
            if (palabra.length() < 3) {
                acronimo += palabra.toLowerCase(Locale.ROOT).charAt(0);
            } else {
                acronimo += palabra.toUpperCase(Locale.ROOT).charAt(0);
            }
        }
        return acronimo;
    }

    private static String[] separarPalabras(String nombre) {
        String[] palabrasSeparadasPorEspaciosEnBlanco = nombre.split(" ");

        ArrayList<String> palabrasSeparadasPorGuion = new ArrayList<>();

        for (String palabra : palabrasSeparadasPorEspaciosEnBlanco) {
            String[] aux = palabra.split("-");
            palabrasSeparadasPorGuion.addAll(Arrays.asList(aux));
        }

        return palabrasSeparadasPorGuion.toArray(new String[0]);
    }
}