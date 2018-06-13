package Elfos;

import java.util.Random;

public class MinaOro implements jugarElfos{
    private int vida0, recolector;
    private Random rand = new Random(System.nanoTime());

    public int getVida() {
        return vida0;
    }

    public void setVida(int vida) {
        this.vida0 = vida;
    }

    public int getRecolector() {
        return recolector;
    }

    public void setRecolector(int recolector) {
        this.recolector = recolector;
    }
    
    @Override
    public void daño(){
        
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public void defender() {
        
    }
}
