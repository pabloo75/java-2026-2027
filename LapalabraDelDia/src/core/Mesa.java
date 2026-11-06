package core;

public class Mesa {
    public static final int MAX_INTENTOS = 6;
    public static final int GRIS = 0;
    public static final int AMARILLO = 1;
    public static final int VERDE = 2;

    private final String secreta;
    private final String[] intentos;
    private final int[][] estados;
    private int numIntentos;
    private boolean ganada;

    public Mesa(String secreta) {
        this.secreta = secreta;
        this.intentos = new String[MAX_INTENTOS];
        this.estados = new int[MAX_INTENTOS][];
        this.numIntentos = 0;
        this.ganada = false;
    }


    public void anadirIntento(String palabra) {
        intentos[numIntentos] = palabra;
        estados[numIntentos] = evaluar(palabra);
        ganada = palabra.equals(secreta);
        numIntentos++;
    }


    private int[] evaluar(String intento) {
        int longitud = secreta.length();
        int[] resultado = new int[longitud];
        boolean[] usada = new boolean[longitud];

        for (int i = 0; i < longitud; i++) {
            if (intento.charAt(i) == secreta.charAt(i)) {
                resultado[i] = VERDE;
                usada[i] = true;
            }
        }

        for (int i = 0; i < longitud; i++) {
            if (resultado[i] != VERDE) {
                int j = 0;
                boolean encontrada = false;
                while (j < longitud && !encontrada) {
                    if (!usada[j] && secreta.charAt(j) == intento.charAt(i)) {
                        usada[j] = true;
                        resultado[i] = AMARILLO;
                        encontrada = true;
                    }
                    j++;
                }
            }
        }
        return resultado;
    }

    public boolean estaTerminada() {
        return ganada || numIntentos >= MAX_INTENTOS;
    }

    public boolean estaGanada() {
        return ganada;
    }

    public int getNumIntentos() {
        return numIntentos;
    }

    public String getIntento(int i) {
        return intentos[i];
    }

    public int[] getEstados(int i) {
        return estados[i];
    }

    public String getSecreta() {
        return secreta;
    }
}