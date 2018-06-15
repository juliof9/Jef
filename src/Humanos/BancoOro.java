package Humanos;

public class BancoOro implements jugarHumanos{
    public static int vida1 = 300;
    private int recursos;
    
    public BancoOro(){}
    
    public BancoOro(int recursos){
        this.recursos = recursos;
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
