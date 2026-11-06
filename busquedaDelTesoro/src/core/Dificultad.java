package core;

public enum Dificultad {
    FACIL (3,5,1,0),
    MEDIO(5,10,2,2),
    DIFICIL(10,25,5,3);

    private int tamaño;
    private int jugadas;
    private int minas;
    private int vidas;

    Dificultad(int tamaño,int jugadas, int minas, int vidas){
        this.tamaño = tamaño;
        this.jugadas=jugadas;
        this.minas=minas;
        this.vidas = vidas;
    }
    public int getTamaño(){
        return tamaño;
    }
    public int getJugadas() {
        return jugadas;
    }
    public int getMinas(){
        return minas;
    }
    public int getVidas(){
        return vidas;
    }

}
