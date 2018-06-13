package Humanos;

import java.util.Random;

public class Avion implements jugarHumanos{
    private int vida3, fuerza3, fisico3;
    private Random rand = new Random(System.nanoTime());

    public int getVida3() {
        return vida3;
    }

    public void setVida3(int vida3) {
        this.vida3 = vida3;
    }

    public int getFuerza3() {
        return fuerza3;
    }

    public void setFuerza3(int fuerza3) {
        this.fuerza3 = fuerza3;
    }

    public int getFisico3() {
        return fisico3;
    }

    public void setFisico3(int fisico3) {
        this.fisico3 = fisico3;
    }
    
    
    @Override
    public void daño(){
        System.out.println("Se creo el Avion, fiuuu!!");
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public void defender() {
        
    }
}
