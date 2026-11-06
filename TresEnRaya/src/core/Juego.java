package core;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Juego {
    private Scanner kb;
    private Mesa mesa;
    private Jugador[] jugadores;

    public Juego(Scanner kb) {
        this.kb = kb;
        this.mesa = new Mesa();
        this.jugadores = new Jugador[2];
    }

    private void pedirDatos() {
        System.out.println("Dime vuestros nombres");
        System.out.print("Jugador 1 (X): ");
        jugadores[0] = new Jugador(kb.next(), 'X');
        System.out.print("Jugador 2 (O): ");
        jugadores[1] = new Jugador(kb.next(), 'O');
    }
    private void pedirJugada(Jugador j) {
        System.out.println("Turno de: " + j.getNombre() +  " (" + j.getFicha() + ")");
        boolean casillaCorrecta = false;
        while (!casillaCorrecta){
            System.out.println("Introduce fila (0,1,2)");
            int fila = kb.nextInt();
            System.out.println("Introduce columna(0,1,2,)");
            int columna = kb.nextInt();
            if(mesa.esValida(fila,columna)){
                mesa.colocar(fila,columna, j.getFicha());
                casillaCorrecta = true;
            }
            else {
                System.out.println("Posición invalida");
            }
        }
    }


    public void jugar() {
        pedirDatos();
        boolean quiereRevancha = true;
        while(quiereRevancha) {
            mesa = new Mesa();
            int indiceTurno = 0;
            boolean partidaEnCurso = true;
            while (partidaEnCurso) {
                mesa.mostrarMesa();
                Jugador jugadorActual = jugadores[indiceTurno];
                pedirJugada(jugadorActual);

                if (mesa.hayGanador(jugadorActual.getFicha())) {
                    mesa.mostrarMesa();
                    System.out.println("Gana : " + jugadorActual.getNombre());
                    partidaEnCurso = false;
                }
                else if (mesa.estaLlena()) {
                    mesa.mostrarMesa();
                    System.out.println("La mesa está llena, empate");
                    partidaEnCurso = false;
                }else  {
                    indiceTurno = 1 - indiceTurno;
                }
            }
            System.out.println("Quieres revancha? (si/no): ");
            String respuesta = kb.next().trim().toLowerCase();
            if(respuesta.equals("no")){
                quiereRevancha = false;
                System.out.println("Gracias por jugar");
            }
            else if(respuesta.equals("si")) {
                System.out.println("\nNueva Partida");
            }
        }

    }
}
