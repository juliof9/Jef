package Aliens;

public class MinaOro implements jugarAliens{
    private int vida05, recursos03;

    public int getVida05() {
        return vida05;
    }

    public void setVida05(int vida05) {
        this.vida05 = vida05;
    }

    public int getRecursos03() {
        return recursos03;
    }

    public void setRecursos03(int recursos03) {
        this.recursos03 = recursos03;
    }
    
    @Override
    public void daño(){
        System.out.println("Espere dos turnos para que se cree la mina de oro");
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public void defender() {
        
    }
}
