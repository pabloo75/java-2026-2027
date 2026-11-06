package core;

import java.util.Random;

public class Mesa {
    private int tamaño;
    private char[][] tablero;
    private boolean[][] hayMina; // mas de 1 mina
    private int filaTesoro, colTesoro;

    public Mesa(int tamaño, int minas) {
        this.tamaño = tamaño;
        tablero = new char[tamaño][tamaño];
        hayMina = new boolean[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                tablero[i][j] = '?';
            }
        }

        Random r = new Random();
        filaTesoro = r.nextInt(tamaño);
        colTesoro = r.nextInt(tamaño);
        int f;
        int c;
        int colocadas = 0;
        while (colocadas < minas) {
            f = r.nextInt(tamaño);
            c = r.nextInt(tamaño);
            boolean esTesoro = (f == filaTesoro && c == colTesoro);
            if (!hayMina[f][c] && !esTesoro) {
                hayMina[f][c] = true;
                colocadas++;
            }
        }
    }

    //cambia la mesa
    public Resultado probar(int fila, int col) {
        Resultado res;
        if (hayMina[fila][col]) {
            tablero[fila][col] = 'M';
            res = Resultado.MINA;
        } else if (fila == filaTesoro && col == colTesoro) {
            tablero[fila][col] = 'T';
            res = Resultado.TESORO;
        } else {
            tablero[fila][col] = '.';
            res = Resultado.SIGUE;
        }
        return res;
    }


    public boolean yaProbada(int fila, int col) {
        return tablero[fila][col] != '?';
    }

    public int getTamaño() {
        return tamaño;
    }

    public char getCasilla(int fila, int col) {
        return tablero[fila][col];
    }
}