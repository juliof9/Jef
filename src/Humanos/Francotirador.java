package Humanos;

import java.util.Random;

public class Francotirador implements jugarHumanos{
    private int vida4, fuerza4;
    private Random rand = new Random(System.nanoTime());

    public int getVida4() {
        return vida4;
    }

    public void setVida4(int vida4) {
        this.vida4 = vida4;
    }

    public int getFuerza4() {
        return fuerza4;
    }

    public void setFuerza4(int fuerza4) {
        this.fuerza4 = fuerza4;
    }
    
    @Override
    public void daño(){
        System.out.println("Se creo el Francotirador");
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public void defender() {
        
    }
}
