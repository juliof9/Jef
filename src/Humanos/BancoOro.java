package Humanos;

public class BancoOro implements jugarHumanos{
    public static int vida1 = 300;
    private int recursos, costo8;
    
    public BancoOro(){}
    
    public BancoOro(int recursos, int costo8){
        this.recursos = recursos;
        this.costo8 = costo8;
    }

    public int getCosto8() {
        return costo8;
    }

    public void setCosto8(int costo8) {
        this.costo8 = costo8;
    }

    public int getRecursos() {
        return recursos;
    }

    public void setRecursos(int recursos) {
        this.recursos = recursos;
    }

    @Override
    public void atacar() {}

    @Override
    public void recolectar1() {
        System.out.println("Contruiste tu recolector de Oro");
    }
}
