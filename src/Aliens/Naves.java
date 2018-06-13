package Aliens;

import java.util.Random;

public class Naves implements jugarAliens{
    private int vida06, fuerza11;
    private Random rand = new Random(System.nanoTime());

    public int getVida06() {
        return vida06;
    }

    public void setVida06(int vida06) {
        this.vida06 = vida06;
    }

    public int getFuerza11() {
        return fuerza11;
    }

    public void setFuerza11(int fuerza11) {
        this.fuerza11 = fuerza11;
    }
    
    @Override
    public void daño(){
        System.out.println("Se comenzaron a crear las naves");
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public void defender() {
        
    }
}
