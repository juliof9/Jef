package Elfos;

import java.util.Random;

public class MinaElixir implements jugarElfos{
    private int vida9, recolector0;
    private Random rand = new Random(System.nanoTime());

    public int getVida9() {
        return vida9;
    }

    public void setVida9(int vida9) {
        this.vida9 = vida9;
    }

    public int getRecolector0() {
        return recolector0;
    }

    public void setRecolector0(int recolector0) {
        this.recolector0 = recolector0;
    }
    
    @Override
    public void daño(){
        System.out.println("Su mina se creo en este momento");
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void defender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
