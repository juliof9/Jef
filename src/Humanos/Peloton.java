package Humanos;

import java.util.Random;

public class Peloton implements jugarHumanos{
    private int vida2, fuerza2, fisico2;
    private Random rand = new Random(System.nanoTime());

    public int getVida2() {
        return vida2;
    }

    public void setVida2(int vida2) {
        this.vida2 = vida2;
    }

    public int getFuerza2() {
        return fuerza2;
    }

    public void setFuerza2(int fuerza2) {
        this.fuerza2 = fuerza2;
    }

    public int getFisico2() {
        return fisico2;
    }

    public void setFisico2(int fisico2) {
        this.fisico2 = fisico2;
    }
    
    @Override
    public void daño(){
        System.out.println("Se creo el peloton");
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public void defender() {
        
    }
}
