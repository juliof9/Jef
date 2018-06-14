
package Elfos;

public class Avionetas implements jugarElfos{
    private int vida11, fuerza11;
    
    public Avionetas(){}
    
    public Avionetas(int vida11, int fuerza11){
        this.fuerza11 = fuerza11;
        this.vida11 = vida11;
    }

    public int getVida11() {
        return vida11;
    }

    public void setVida11(int vida11) {
        this.vida11 = vida11;
    }

    public int getFuerza11() {
        return fuerza11;
    }

    public void setFuerza11(int fuerza11) {
        this.fuerza11 = fuerza11;
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public void recolectar() {}

}
