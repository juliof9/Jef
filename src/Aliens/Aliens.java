package Aliens;

import java.util.Random;

public class Aliens implements jugarAliens{
    private int vida02, fuerza02;
    private Random rand = new Random(System.nanoTime());

    public int getVida02() {
        return vida02;
    }

    public void setVida02(int vida02) {
        this.vida02 = vida02;
    }

    public int getFuerza02() {
        return fuerza02;
    }

    public void setFuerza02(int fuerza02) {
        this.fuerza02 = fuerza02;
    }
    
    @Override
    public void daño(){
        System.out.println("Se comenzo a entrenar a los Aliens");
    }

    @Override
    public void atacar() {
        System.out.println("");
    }

    @Override
    public void defender() {
        System.out.println("");
    }
}
