package Aliens;

public class MinaElixir implements jugarAliens{
    public static int vida04 = 500;
    private int recursos02;

    public MinaElixir(){}
    
    public MinaElixir(int recursos02){
        this.recursos02 = recursos02;
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
        
    }
}
