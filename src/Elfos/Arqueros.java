package Elfos;

import java.util.Random;

public class Arqueros implements jugarElfos{
    private int vida01, fuerza01;
    private Random rand = new Random(System.nanoTime());

    public int getVida01() {
        return vida01;
    }

    public void setVida01(int vida01) {
        this.vida01 = vida01;
    }

    public int getFuerza01() {
        return fuerza01;
    }

    public void setFuerza01(int fuerza01) {
        this.fuerza01 = fuerza01;
    }
            
    @Override
    public void daño(){
        System.out.println("Se creo el arquero");
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
