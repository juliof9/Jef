package Humanos;

public class Tanque implements jugarHumanos{
    public static int vida = 600;
    private int fuerza;
    
    public Tanque(){}
    
    public Tanque(int fuerza){
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public void recolectar1() {
        
    }
}
