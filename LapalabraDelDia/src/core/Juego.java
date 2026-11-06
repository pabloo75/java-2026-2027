package core;
import iu.IU;

public class Juego {
    private final IU iu;
    private final Palabras palabras;
    private Jugador jugador;

    public Juego() {
        iu = new IU();
        palabras = new Palabras();
    }


    public void iniciar() {
        jugador = new Jugador(iu.pedirNombre());
        boolean seguir;
        do {
            jugarPartida();
            seguir = iu.preguntarOtraPartida();
        } while (seguir);
        iu.mostrarEstadisticas(jugador);
        iu.pedirPalabra(palabras.total());
    }


    private void jugarPartida() {
        Mesa mesa = new Mesa(palabras.elegirAleatoria());
        iu.mostrarMesa(mesa);

        while (!mesa.estaTerminada()) {
            String palabra = iu.pedirPalabra(mesa.getNumIntentos() + 1);
            mesa.anadirIntento(palabra);
            iu.mostrarMesa(mesa);
        }

        jugador.registrarPartida(mesa.estaGanada());
        iu.mostrarResultado(mesa);
    }
}