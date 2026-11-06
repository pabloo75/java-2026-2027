package iu;

import core.Juego;
import core.Mesa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Juego juego = new Juego(kb);
        juego.jugar();
    }
}
