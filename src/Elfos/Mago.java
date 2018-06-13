
package Elfos;

import java.util.Random;

public class Mago implements jugarElfos{
    private int vida8, fuerza8;
    private Random rand = new Random(System.nanoTime());

    public int getVida8() {
        return vida8;
    }

    public void setVida8(int vida8) {
        this.vida8 = vida8;
    }

    public int getFuerza8() {
        return fuerza8;
    }

    public void setFuerza8(int fuerza8) {
        this.fuerza8 = fuerza8;
    }
    
    @Override
    public void daño(){
        System.out.println("Soy un Mago");
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
