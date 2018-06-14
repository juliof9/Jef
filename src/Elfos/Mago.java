
package Elfos;

public class Mago implements jugarElfos{
    private int vida8, fuerza8;
    
    public Mago(){}
    
    public Mago(int vida8, int fuerza8){
        this.fuerza8 = fuerza8;
        this.vida8 = vida8;
    }

    public int getVida8() {
        return vida8;
    }

    public void setVida8(int vida8) {
        this.vida8 = vida8;
    }

    public int getFuerza8() {
        return fuerza8;
    }

    public void setFuerza8(int fuerza8) {
        this.fuerza8 = fuerza8;
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public void recolectar(){}
}
