package iu;

import java.util.Scanner;
import core.Jugador;
import core.Mesa;
import core.Colores;
import core.Palabras;
import java.util.Scanner;

public class IU {
    private final Scanner sc;

    public IU() {
        sc = new Scanner(System.in);
    }

    public String pedirNombre() {
        System.out.print("Nombre del jugador: ");
        String nombre = sc.nextLine().trim();
        if (nombre.isEmpty()) {
            nombre = "Jugador";
        }
        return nombre;
    }


    public String pedirPalabra(int numeroIntento) {
        String palabra;
        boolean valida;
        do {
            System.out.print("Intento " + numeroIntento + "? ");
            palabra = sc.nextLine().trim().toUpperCase();
            valida = Palabras.tieneFormatoValido(palabra);
            if (!valida) {
                System.out.println("Debe tener " + Palabras.LONGITUD + " letras (solo letras).");
            }
        } while (!valida);
        return palabra;
    }

    public void mostrarMesa(Mesa mesa) {
        System.out.println();
        System.out.println("ADIVINA");
        System.out.println("LA PALABRA DEL DÍA");
        for (int i = 0; i < mesa.getNumIntentos(); i++) {
            System.out.println(formatearFila(mesa.getIntento(i), mesa.getEstados(i)));
        }
        if (mesa.getNumIntentos() < Mesa.MAX_INTENTOS) {
            System.out.println(filaVacia());
        }
    }

    private String formatearFila(String palabra, int[] estados) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            String letra = String.valueOf(palabra.charAt(i));
            sb.append(Colores.pintar(letra, Colores.paraEstado(estados[i]))).append("    ");
        }
        return sb.toString();
    }

    private String filaVacia() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Palabras.LONGITUD; i++) {
            sb.append("_    ");
        }
        return sb.toString();
    }

    public void mostrarResultado(Mesa mesa) {
        System.out.println();
        if (mesa.estaGanada()) {
            System.out.println(Colores.pintar("¡Enhorabuena! ¡Has ganado!", Colores.VERDE));
        } else {
            System.out.println(Colores.pintar("Has perdido. La palabra era: " + mesa.getSecreta(), Colores.VERMELLO));
        }
    }

    public boolean preguntarOtraPartida() {
        System.out.print("¿Jugar otra partida? (s/n): ");
        String respuesta = sc.nextLine().trim().toLowerCase();
        return respuesta.equals("s");
    }

    public void mostrarEstadisticas(Jugador jugador) {
        System.out.println();
        System.out.println(jugador.getNombre() + ": " + jugador.getPartidasGanadas()
                + " ganadas de " + jugador.getPartidasJugadas() + " partidas.");
        System.out.println("¡Hasta pronto!");
    }
}