package iu;
import core.Mesa;
import core.Juego;

public class Main {
    public static void main(String[] args) {
        IU iu = new IU();
        Juego juego = new Juego(iu);
        juego.jugar();

    }
}

