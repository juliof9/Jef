package Aliens;

public class ElixirOscuroA implements jugarAliens{
    public static int vida03 = 500;
    private int recursos01, costo04;
    
    public ElixirOscuroA(){}
    
    public ElixirOscuroA(int recursos01, int costo04){
        this.recursos01 = recursos01;
        this.costo04 = costo04;
    }

    public int getCosto04() {
        return costo04;
    }

    public void setCosto04(int costo04) {
        this.costo04 = costo04;
    }

    public int getRecursos01() {
        return recursos01;
    }

    public void setRecursos01(int recursos01) {
        this.recursos01 = recursos01;
    }

    @Override
    public void atacar() {}

    @Override
    public void recolectar() {
        int a = 0;
        while (a != 0){
            recursos01 = recursos01+1;
        }
    }
}
