
package Elfos;

import java.util.Random;

public class Avionetas implements jugarElfos{
    private int vida11, fuerza11;
    private Random rand = new Random(System.nanoTime());

    public int getVida11() {
        return vida11;
    }

    public void setVida11(int vida11) {
        this.vida11 = vida11;
    }

    public int getFuerza11() {
        return fuerza11;
    }

    public void setFuerza11(int fuerza11) {
        this.fuerza11 = fuerza11;
    }
    
    @Override
    public void daño(){
        System.out.println("Tardaran unos segundos crear su avioneta");
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
