package Aliens;

public class MinaOro implements jugarAliens{
    public static int vida05 = 500;
    private int recursos03;
    
    public MinaOro(){}
    
    public MinaOro(int recursos03){
        this.recursos03 = recursos03;
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
        
    }
}
