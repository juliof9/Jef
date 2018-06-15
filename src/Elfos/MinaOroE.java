package Elfos;

public class MinaOroE implements jugarElfos{
    public static int vida0 = 400;
    private int recolector, costo1;
    
    public MinaOroE(){}
    
    public MinaOroE(int recolector,int costo1){
        this.recolector = recolector;
        this.costo1 = costo1;
    }

    public int getCosto1() {
        return costo1;
    }

    public void setCosto1(int costo1) {
        this.costo1 = costo1;
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
