package Humanos;

import java.util.Random;

public class BancoOro implements jugarHumanos{
    private int vida1, fuerza1, fisico1;
    private Random rand = new Random(System.nanoTime());

    public int getVida1() {
        return vida1;
    }

    public void setVida1(int vida1) {
        this.vida1 = vida1;
    }

    public int getFuerza1() {
        return fuerza1;
    }

    public void setFuerza1(int fuerza1) {
        this.fuerza1 = fuerza1;
    }

    public int getFisico1() {
        return fisico1;
    }

    public void setFisico1(int fisico1) {
        this.fisico1 = fisico1;
    }
    
    @Override
    public void daño(){
        System.out.println("El banco taradara 3 turnos en crearse");
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public void defender() {
        
    }
}
