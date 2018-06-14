package Elfos;

import java.util.Random;

public class MinaElixir implements jugarElfos{
    private int vida9, recolector0;
    
    public MinaElixir(){}
    
    public MinaElixir(int vida9, int recolector0){
        this.recolector0 = recolector0;
        this.vida9 = vida9;
    }

    public int getVida9() {
        return vida9;
    }

    public void setVida9(int vida9) {
        this.vida9 = vida9;
    }

    public int getRecolector0() {
        return recolector0;
    }

    public void setRecolector0(int recolector0) {
        this.recolector0 = recolector0;
    }

    @Override
    public void atacar() {
        //No puede atacar porque es una mina
        
    }

    @Override
    public void recolectar() {
        
    }
}
