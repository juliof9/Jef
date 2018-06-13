package Humanos;

import java.util.Random;

public class Elixir implements jugarHumanos{
    private int vida6, fuerza6, fisico6;
    private Random rand = new Random(System.nanoTime());

    public int getVida6() {
        return vida6;
    }

    public void setVida6(int vida6) {
        this.vida6 = vida6;
    }

    public int getFuerza6() {
        return fuerza6;
    }

    public void setFuerza6(int fuerza6) {
        this.fuerza6 = fuerza6;
    }

    public int getFisico6() {
        return fisico6;
    }

    public void setFisico6(int fisico6) {
        this.fisico6 = fisico6;
    }
    
    
    
    @Override
    public void daño(){
        System.out.println("El elixir o la mina de elixir se creara en 2 turnos");
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public void defender() {
        
    }
}
