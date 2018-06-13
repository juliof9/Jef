
package Elfos;

public class ElixirOscuro implements jugarElfos{
    @Override
    public void daño(){
        System.out.println("Se contruyo la mina de Elixir Oscuro");
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void defender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
