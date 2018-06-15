package Elfos;

public class MinaElixirE implements jugarElfos{
    public static int vida09 = 500;
    private int recolector0, costo2;
    
    public MinaElixirE(){}
    
    public MinaElixirE(int recolector0,int costo2){
        this.recolector0 = recolector0;
        this.costo2 = costo2;
    }

    public int getCosto2() {
        return costo2;
    }

    public void setCosto2(int costo2) {
        this.costo2 = costo2;
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
        int a = 0;
        while (a != 0){
            recolector0 = recolector0+1;
        }
    }
}
