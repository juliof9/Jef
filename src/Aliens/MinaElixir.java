package Aliens;

public class MinaElixir implements jugarAliens{
    private int vida04, recursos02;

    public int getVida04() {
        return vida04;
    }

    public void setVida04(int vida04) {
        this.vida04 = vida04;
    }

    public int getRecursos02() {
        return recursos02;
    }

    public void setRecursos02(int recursos02) {
        this.recursos02 = recursos02;
    }
           
    @Override
    public void daño(){
        System.out.println("Espere un turno para que se cree la mina del elixir");
    }

    @Override
    public void atacar() {
            
    }

    @Override
    public void defender() {
        
    }
}
