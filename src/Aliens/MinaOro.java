package Aliens;

public class MinaOro implements jugarAliens{
    public static int vida05 = 500;
    private int recursos03, costo06;
    
    public MinaOro(){}
    
    public MinaOro(int recursos03, int costo06){
        this.recursos03 = recursos03;
        this.costo06 = costo06;
    }

    public int getCosto06() {
        return costo06;
    }

    public void setCosto06(int costo06) {
        this.costo06 = costo06;
    }
    
    public int getRecursos03() {
        return recursos03;
    }

    public void setRecursos03(int recursos03) {
        this.recursos03 = recursos03;
    }
    
    @Override
    public void atacar() {}

    @Override
    public void recolectar() {
        int a = 0;
        while (a != 0){
            recursos03 = recursos03+1;
        }
    }
}
