package Humanos;

public class ElixirOscuro implements jugarHumanos{
    public static int vida5 = 400;
    private int recursos2, costo10;
    
    public ElixirOscuro(){}
    
    public ElixirOscuro(int recursos2, int costo10){
        this.recursos2 = recursos2;
        this.costo10 = costo10;
    }

    public int getCosto10() {
        return costo10;
    }

    public void setCosto10(int costo10) {
        this.costo10 = costo10;
    }

    public int getRecursos2() {
        return recursos2;
    }

    public void setRecursos2(int recursos2) {
        this.recursos2 = recursos2;
    }

    @Override
    public void atacar() {}

    @Override
    public void recolectar1() {
        System.out.println("Construiste tu recolector de Elixir oscuro");
        int a = 0;
        while (a != 0){
            recursos2 = recursos2+1;
        }
    }
}
