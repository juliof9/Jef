package Humanos;

public class Elixir implements jugarHumanos{
    public static int vida6 = 400;
    private int recursos1, costo9;
    
    public Elixir(){}
    
    public Elixir(int recursos1, int costo9){
        this.recursos1 = recursos1;
        this.costo9 = costo9;
    }

    public int getCosto9() {
        return costo9;
    }

    public void setCosto9(int costo9) {
        this.costo9 = costo9;
    }

    public int getRecursos1() {
        return recursos1;
    }

    public void setRecursos1(int recursos1) {
        this.recursos1 = recursos1;
    }

    @Override
    public void atacar() {}

    @Override
    public void recolectar1() {
        System.out.println("Contruiste el recolector de elixir.");
        int a = 0;
        while (a != 0){
            recursos1 = recursos1+1;
        }
    }
}
