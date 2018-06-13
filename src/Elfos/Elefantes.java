package Elfos;

import java.util.Random;

public class Elefantes implements jugarElfos{
    private int vida10, fuerza10;
    private Random rand = new Random(System.nanoTime());

    public int getVida10() {
        return vida10;
    }

    public void setVida10(int vida10) {
        this.vida10 = vida10;
    }

    public int getFuerza10() {
        return fuerza10;
    }

    public void setFuerza10(int fuerza10) {
        this.fuerza10 = fuerza10;
    }
    
    @Override
    public void daño(){
        System.out.println("Tomara un turno crear su edificacion Elefantes");
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
