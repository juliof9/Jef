
package Elfos;

public class MinaElixir implements jugarElfos{
    @Override
    public void daño(){
        System.out.println("Su mina se creo en este momento");
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
