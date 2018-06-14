
package Elfos;

public class ElixirOscuro implements jugarElfos{
    private int vida9, recolector1;
    
    public ElixirOscuro(){}
    
    public ElixirOscuro(int vida9, int recolector1){
        this.vida9 = vida9;
        this.recolector1 = recolector1;
    }

    public int getVida9() {
        return vida9;
    }

    public void setVida9(int vida9) {
        this.vida9 = vida9;
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
