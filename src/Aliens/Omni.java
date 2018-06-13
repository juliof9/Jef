package Aliens;

import java.util.Random;

public class Omni implements jugarAliens{
    private int vida12, fuerza12;
    private Random rand = new Random(System.nanoTime());

    public int getVida12() {
        return vida12;
    }

    public void setVida12(int vida12) {
        this.vida12 = vida12;
    }

    public int getFuerza12() {
        return fuerza12;
    }

    public void setFuerza12(int fuerza12) {
        this.fuerza12 = fuerza12;
    }
    
    @Override
    public void daño(){
        System.out.println("Se trabaja en crear los omnis");
    }

    @Override
    public void atacar() {
        System.out.println("");
    }

    @Override
    public void defender() {
        System.out.println("");
    }
}
