package core;

public class Colores {
    public static final String NEGRO = "\u001b[30m";
    public static final String VERMELLO = "\u001b[31m";
    public static final String VERDE = "\u001b[32m";
    public static final String AMARELO = "\u001b[33m";
    public static final String BRANCO = "\u001b[37m";
    public static final String RESET = "\u001B[0m";


    public static String paraEstado(int estado) {
        String color = BRANCO;
        if (estado == Mesa.VERDE) {
            color = VERDE;
        } else if (estado == Mesa.AMARILLO) {
            color = AMARELO;
        }
        return color;
    }


    public static String pintar(String texto, String color) {
        return color + texto + RESET;
    }
}

