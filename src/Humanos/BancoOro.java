package Humanos;

import java.util.Random;

public class BancoOro implements jugarHumanos{
    private int vida1, recursos;
    private Random rand = new Random(System.nanoTime());

    public int getVida1() {
        return vida1;
    }

    public void setVida1(int vida1) {
        this.vida1 = vida1;
    }

    public int getRecursos() {
        return recursos;
    }

    public void setRecursos(int recursos) {
        this.recursos = recursos;
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
