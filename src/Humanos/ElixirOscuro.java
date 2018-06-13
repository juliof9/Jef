package Humanos;

import java.util.Random;

public class ElixirOscuro implements jugarHumanos{
    private int vida5, recursos2;
    private Random rand = new Random(System.nanoTime());

    public int getVida5() {
        return vida5;
    }

    public void setVida5(int vida5) {
        this.vida5 = vida5;
    }

    public int getRecursos2() {
        return recursos2;
    }

    public void setRecursos2(int recursos2) {
        this.recursos2 = recursos2;
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
