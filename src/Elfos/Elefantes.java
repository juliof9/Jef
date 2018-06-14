package Elfos;

public class Elefantes implements jugarElfos{
    private int vida10, fuerza10;
    
    public Elefantes(){}
    
    public Elefantes(int vida10, int fuerza10){
        this.fuerza10 = fuerza10;
        this.vida10 = vida10;
    }

    public int getVida10() {
        return vida10;
    }

    public void setVida10(int vida10) {
        this.vida10 = vida10;
    }

    public int getFuerza10() {
        return fuerza10;
    }

    public void setFuerza10(int fuerza10) {
        this.fuerza10 = fuerza10;
    }

    @Override
    public void atacar() {
        System.out.println("Se entreno el Eleante, desea atacar? ");
        
    }

    @Override
    public void recolectar() {}
}
