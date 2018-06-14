package Elfos;

public class MinaOro implements jugarElfos{
    private int vida0, recolector;
    
    public MinaOro(){}
    
    public MinaOro(int vida0, int recolector){
        this.vida0 = vida0;
        this.recolector = recolector;
    }

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
    public void atacar() {
        
        //No puede atacar porque es una mina
    }

    @Override
    public void recolectar() {
        
    }
}
