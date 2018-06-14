package Elfos;

public class MinaOro implements jugarElfos{
    public static int vida0 = 400;
    private int recolector;
    
    public MinaOro(){}
    
    public MinaOro(int recolector){
        this.recolector = recolector;
    }

    public int getRecolector() {
        return recolector;
    }

    public void setRecolector(int recolector) {
        this.recolector = recolector;
    }

    @Override
    public void atacar() {
        //No puede atacar porque es una mina
    }

    @Override
    public void recolectar() {
        
    }
}
