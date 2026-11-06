package core;

import java.util.Scanner;

public class Mesa {
    private char[][] tablero;

    public Mesa() {
        tablero = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public void mostrarMesa() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tablero[i][j] + " ");
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("_______________");
            }
        }
    }
    public boolean esValida(int fila, int col){
        if(fila < 0 || fila > 2 || col < 0 || col > 2){
            System.out.println("Fuera del tablero ");
            return false;
        }
        if(tablero[fila][col] != ' '){
            System.out.println("Casilla ocupada");
            return false;
        }
        return true;
    }
    public void colocar(int fila, int col, char ficha){
        tablero[fila][col] = ficha;
    }

    public boolean hayGanador(char ficha) {
        //Rectas
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == ficha && tablero[i][1] == ficha && tablero[i][2] == ficha) || (tablero[0][i] == ficha && tablero[1][i] == ficha && tablero[2][i] == ficha)) {
                return true;
            }
        }
            //Diagonales
            if ((tablero[0][0] == ficha && tablero[1][1] == ficha && tablero[2][2] == ficha) || (tablero[0][2] == ficha && tablero[1][1] ==ficha && tablero[2][0] == ficha )) {
                return true;
            }
        return false;
    }
    public boolean estaLlena(){
        boolean llena = true;
        for(int i = 0; i<3;i++){
            for(int j= 0;j<3;j++){
                if(tablero[i][j] == ' '){
                    llena = false;
                }
            }
        }
        return llena;
    }
}


