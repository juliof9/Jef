package Humanos;

import java.util.Random;

public class Elixir implements jugarHumanos{
    private int vida6, recursos1;
    private Random rand = new Random(System.nanoTime());

    public int getVida6() {
        return vida6;
    }

    public void setVida6(int vida6) {
        this.vida6 = vida6;
    }

    public int getRecursos1() {
        return recursos1;
    }

    public void setRecursos1(int recursos1) {
        this.recursos1 = recursos1;
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
