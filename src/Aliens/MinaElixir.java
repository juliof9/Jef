package Aliens;

public class MinaElixir implements jugarAliens{
    public static int vida04 = 500;
    private int recursos02, costo05;

    public MinaElixir(){}
    
    public MinaElixir(int recursos02, int costo05){
        this.recursos02 = recursos02;
        this.costo05 = costo05;
    }

    public int getCosto05() {
        return costo05;
    }

    public void setCosto05(int costo05) {
        this.costo05 = costo05;
    }
    
    public int getRecursos02() {
        return recursos02;
    }

    public void setRecursos02(int recursos02) {
        this.recursos02 = recursos02;
    }

    @Override
    public void atacar() {}

    @Override
    public void recolectar() {
        int a = 0;
        while (a != 0){
            recursos02 = recursos02+1;
        }
    }
}
