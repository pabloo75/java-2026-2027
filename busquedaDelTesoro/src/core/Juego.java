package core;

import iu.IU;

import java.util.Scanner;

public class Juego {
    private IU iu;
    private Jugador jugador;
    private Mesa mesa;
    private int maxJugadas;
    private int maxVidas;

    public Juego(IU iu) {
        this.iu = iu;
        this.jugador = new Jugador(iu.pedirNombre());
        Dificultad dificultad = iu.pedirDificultad();
        this.mesa = new Mesa(dificultad.getTamaño(), dificultad.getMinas());
        this.maxJugadas = dificultad.getJugadas();
        this.maxVidas = dificultad.getVidas();
    }

    public void jugar() {
        int jugadasRestantes = maxJugadas;
        int vidasRestantes = maxVidas;
        boolean terminado = false;
        iu.mostrarMesa(mesa);

        while (!terminado) {
            iu.mostrarMensaje("Jugadas restantes: " + jugadasRestantes + " | Vidas: " + vidasRestantes);
            int fila = iu.pedirNumero("Fila", mesa.getTamaño());
            int col = iu.pedirNumero("Columna", mesa.getTamaño());

            if (mesa.yaProbada(fila, col)) {
                iu.mostrarMensaje("Ya probaste esta casilla.");
            } else {
                Resultado res = mesa.probar(fila, col);
                jugadasRestantes--;
                iu.mostrarMesa(mesa);

                if (res == Resultado.TESORO) {
                    iu.mostrarVictoria(jugador);
                    iu.mostrarMesa(mesa);
                    terminado = true;
                } else if (res == Resultado.MINA) {
                    vidasRestantes--;
                    iu.mostrarMensaje("¡Mina! Pierdes una vida.");
                    if (vidasRestantes <= 0) {
                        iu.mostrarDerrotaSinVidas(jugador);

                        terminado = true;
                    }
                }
                else {
                    iu.mostrarMensaje("Vacío");
                }

            }
            if (jugadasRestantes == 0) {
                iu.mostrarDerrotaSinJugadas(jugador);
                terminado = true;
            }
        }
    }
}

