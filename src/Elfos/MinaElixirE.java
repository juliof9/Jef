package Elfos;

public class MinaElixirE implements jugarElfos{
    public static int vida09 = 500;
    private int recolector0;
    
    public MinaElixirE(){}
    
    public MinaElixirE(int recolector0){
        this.recolector0 = recolector0;
    }

    public int getRecolector0() {
        return recolector0;
    }

    public void setRecolector0(int recolector0) {
        this.recolector0 = recolector0;
    }

    @Override
    public void atacar() {
        //No puede atacar porque es una mina
        
    }

    @Override
    public void recolectar() {
        
    }
}
