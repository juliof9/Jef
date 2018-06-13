package Aliens;

public class ElixirOscuro implements jugarAliens{
    private int vida03, recursos01;

    public int getVida03() {
        return vida03;
    }

    public void setVida03(int vida03) {
        this.vida03 = vida03;
    }

    public int getRecursos01() {
        return recursos01;
    }

    public void setRecursos01(int recursos01) {
        this.recursos01 = recursos01;
    }
    
    @Override
    public void daño(){
        System.out.println("Se creo la edificacion");
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public void defender() {
        
    }
}
