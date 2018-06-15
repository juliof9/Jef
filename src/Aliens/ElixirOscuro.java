package Aliens;

public class ElixirOscuro implements jugarAliens{
    public static int vida03 = 500;
    private int recursos01;
    
    public ElixirOscuro(){}
    
    public ElixirOscuro(int recursos01){
        this.recursos01 = recursos01;
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
        
    }
}
