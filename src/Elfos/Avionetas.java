
package Elfos;

public class Avionetas implements jugarElfos{
    @Override
    public void daño(){
        System.out.println("Tardaran unos segundos crear su avioneta");
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
