
package Elfos;

public class ElixirOscuroE implements jugarElfos{
    public static int vida9 = 500;
    private int recolector1, costo0;
    
    public ElixirOscuroE(){}
    
    public ElixirOscuroE(int recolector1, int costo0){
        this.recolector1 = recolector1;
        this.costo0 = costo0;
    }

    public int getCosto0() {
        return costo0;
    }

    public void setCosto0(int costo0) {
        this.costo0 = costo0;
    }

    public int getrecolector1() {
        return recolector1;
    }

    public void setrecolector1(int recolector1) {
        this.recolector1 = recolector1;
    }

    @Override
    public void atacar() {
        //No puede atacar porque es un recolector
    }

    @Override
    public void recolectar() {
        int a = 0;
        while (a != 0){
            recolector1 = recolector1+1;
        }
    }
}
