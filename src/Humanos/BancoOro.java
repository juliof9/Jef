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
        BancoOro bancooro = new BancoOro();
        bancooro.setRecursos(10000);
        System.out.println("Tienes: "+ bancooro.getRecursos() + " de Oro.");
    }
}
