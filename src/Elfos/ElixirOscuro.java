
package Elfos;

public class ElixirOscuro implements jugarElfos{
    public static int vida9 = 500;
    private int recolector1;
    
    public ElixirOscuro(){}
    
    public ElixirOscuro(int recolector1){
        this.recolector1 = recolector1;
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
        
    }
}
