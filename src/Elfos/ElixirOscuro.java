
package Elfos;

import java.util.Random;

public class ElixirOscuro implements jugarElfos{
    private int vida9, recolector1;
    private Random rand = new Random(System.nanoTime());

    public int getVida9() {
        return vida9;
    }

    public void setVida9(int vida9) {
        this.vida9 = vida9;
    }

    public int getrecolector1() {
        return recolector1;
    }

    public void setrecolector1(int recolector1) {
        this.recolector1 = recolector1;
    }
    
    @Override
    public void daño(){
        System.out.println("Se contruyo la mina de Elixir Oscuro");
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void defender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
