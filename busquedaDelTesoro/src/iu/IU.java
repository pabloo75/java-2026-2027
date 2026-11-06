package iu;
import core.Jugador;
import core.Mesa;
import core.Dificultad;

import java.util.Scanner;
public class IU {
    private final Scanner kb;

    public IU() {
        kb = new Scanner(System.in);
    }

    public String pedirNombre(){
        System.out.println("Bienvenido al juego \"Búsqueda del tesoro\"");
        System.out.println("Dime tu nombre:");
        String nombre = kb.nextLine().trim();
        while (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacío");
            nombre = kb.nextLine().trim();
        }
        return nombre;
    }
    public int pedirNumero(String texto, int max) {
        int numero = 0;
        boolean valido = false;
        while (!valido) {
            System.out.print(texto + " (1-" + max + "): ");
            String entrada = kb.nextLine().trim();
            if (esNumero(entrada)) {
                numero = Integer.parseInt(entrada);
                valido = numero >= 1 && numero <= max;
            }
            if (!valido) {
                System.out.println("Valor no válido.");
            }
        }
        return numero - 1;
    }

    private boolean esNumero(String s) {
        boolean ok = !s.isEmpty() && s.length() <= 9;
        int i = 0;
        while (ok && i < s.length()) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                ok = false;
            }
            i++;
        }
        return ok;
    }

    //public String pedircolocar(){}

    public void mostrarMesa(Mesa mesa) {
        int n = mesa.getTamaño();


        System.out.print("    ");
        for (int j = 1; j <= n; j++) {
            System.out.printf("%2d ", j);
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.printf("%2d  ", i + 1);
            for (int j = 0; j < n; j++) {
                System.out.print(" " + mesa.getCasilla(i, j) + " ");
            }
            System.out.println();
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarVictoria(Jugador jugador) {
        System.out.println("¡Enhorabuena, " + jugador.getNombre() + "! Has encontrado el tesoro.");
    }

    public void mostrarDerrotaMina(Jugador jugador) {
        System.out.println("¡BOOM! " + jugador.getNombre() + " ha pisado la mina. Has perdido.");
    }

    public void mostrarDerrotaSinJugadas(Jugador jugador) {
        System.out.println("Te has quedado sin jugadas, " + jugador.getNombre() + ". Has perdido.");
    }

    public void mostrarDerrotaSinVidas(Jugador jugador) {
        System.out.println("Te has quedado sin vidas, " + jugador.getNombre() + ". Has perdido.");
    }
    public void mostarString(String msg){

    }

    public Dificultad pedirDificultad(){
        System.out.println("Elige una dificultad entre: 1.fácil, 2.medio y 3.dificil");
        int opcion = pedirNumero("Dificultad", 3);
        return Dificultad.values()[opcion];
    }
}
