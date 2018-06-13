package Aliens;

import java.util.Random;

public class Depredadores implements jugarAliens{
    private int vida00, fuerza00;
    private Random rand = new Random(System.nanoTime());

    public int getVida00() {
        return vida00;
    }

    public void setVida00(int vida00) {
        this.vida00 = vida00;
    }

    public int getFuerza00() {
        return fuerza00;
    }

    public void setFuerza00(int fuerza00) {
        this.fuerza00 = fuerza00;
    }
    
    @Override
    public void daño(){
        System.out.println("Se creo el depredador");
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public void defender() {
        
    }
}
