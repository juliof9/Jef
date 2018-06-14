package Humanos;

import java.util.Random;

public class Tanque implements jugarHumanos{
    private int vida, fuerza;
    private Random rand = new Random(System.nanoTime());

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public void recolectar1() {
        
    }
}
