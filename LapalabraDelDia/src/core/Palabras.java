package core;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Palabras {
    public static final int LONGITUD = 5;

    private final List<String> lista;
    private final Random random;

    public Palabras() {
        lista = new ArrayList<>(Arrays.asList(
                "RUBIA", "FAROL", "ROSAS", "CASAS", "PERRO", "GATOS", "LIBRO", "PLAYA",
                "NUBES", "MUNDO", "TIGRE", "SILLA", "MESAS", "CARTA", "FUEGO", "VERDE",
                "NEGRO", "BLUSA", "TORRE", "PIANO", "RADIO", "LIMON", "MANGO", "SALSA",
                "CAMPO", "BARCO", "COCHE", "DULCE", "FELIZ", "HUEVO", "JUEGO", "LLAVE"
        ));
        random = new Random();
    }

    public String elegirAleatoria() {
        return lista.get(random.nextInt(lista.size()));
    }

    public static boolean tieneFormatoValido(String palabra) {
        boolean valida = palabra.length() == LONGITUD;
        int i = 0;
        while (valida && i < palabra.length()) {
            valida = Character.isLetter(palabra.charAt(i));
            i++;
        }
        return valida;
    }

    public int total() {
        return lista.size();
    }
}