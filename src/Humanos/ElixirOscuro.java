package Humanos;

import java.util.Random;

public class ElixirOscuro implements jugarHumanos{
    private int vida5, fuerza5, fisico5;
    private Random rand = new Random(System.nanoTime());

    public int getVida5() {
        return vida5;
    }

    public void setVida5(int vida5) {
        this.vida5 = vida5;
    }

    public int getFuerza5() {
        return fuerza5;
    }

    public void setFuerza5(int fuerza5) {
        this.fuerza5 = fuerza5;
    }

    public int getFisico5() {
        return fisico5;
    }

    public void setFisico5(int fisico5) {
        this.fisico5 = fisico5;
    }
    
    @Override
    public void daño(){
        System.out.println("Se comenzo a construir la mina del elixir oscuro, espere 1 turno");
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public void defender() {
        
    }
}
