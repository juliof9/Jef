
package Elfos;

import static Humanos.CentroHumanos.life1;
import java.util.Scanner;

public class Mago implements jugarElfos{
    public static int vida8 = 600;
    private int fuerza8;
    
    public Mago(){}
    
    public Mago(int fuerza8){
        this.fuerza8 = fuerza8;
    }
    
    public int getFuerza8() {
        return fuerza8;
    }

    public void setFuerza8(int fuerza8) {
        this.fuerza8 = fuerza8;
    }

    @Override
    public void atacar() {
        Mago mago = new Mago();
        mago.setFuerza8(200);
        int a = 3;
        Scanner lee2 = new Scanner(System.in);
        
        System.out.println("Se entreno el Mago, desea atacar? ");
        while (a != 2 ){
            System.out.println("1. Si");
            System.out.println("2. No");
            
            a = lee2.nextInt();
            
            switch(a){
                case 1:
                    System.out.println("Mago hizo un daño de: " + mago.fuerza8 + " al centro de mando Humanos: "+ (life1-mago.fuerza8));
                    break;
                case 2:
                    System.out.println("Saliendo de este bloque...");
                    break;
            }
        }
    }

    @Override
    public void recolectar(){}
}
