package Humanos;

import java.util.Random;

public class Tanque implements jugarHumanos{
    private int vida, fuerza, fisico;
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

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }
    
    @Override
    public void daño(){
        System.out.println("Se creo el tanque");
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public void defender() {
        
    }
}
