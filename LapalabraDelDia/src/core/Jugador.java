package core;

public class Jugador {
    private final String nombre;
    private int partidasJugadas;
    private int partidasGanadas;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.partidasJugadas = 0;
        this.partidasGanadas = 0;
    }

    public void registrarPartida(boolean ganada) {
        partidasJugadas++;
        if (ganada) {
            partidasGanadas++;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }
}
