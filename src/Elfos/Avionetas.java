
package Elfos;

import java.util.Scanner;

public class Avionetas implements jugarElfos{
    public static int vida11 = 500;
    private int fuerza11;
    
    public Avionetas(){}
    
    public Avionetas(int fuerza11){
        this.fuerza11 = fuerza11;
    }
    
    public int getFuerza11() {
        return fuerza11;
    }

    public void setFuerza11(int fuerza11) {
        this.fuerza11 = fuerza11;
    }

    @Override
    public void atacar() {
        Avionetas avioneta = new Avionetas();
        avioneta.setFuerza11(200);
        int a = 3;
        Scanner lee = new Scanner(System.in);
        
        System.out.println("Se entreno la Avioneta, desea atacar? ");
        while (a != 2 ){
            System.out.println("1. Si");
            System.out.println("2. No");
            
            a = lee.nextInt();
            
            switch(a){
                case 1:
                    System.out.println("Avioneta hizo un daño de: " + avioneta.fuerza11 + " al centro de mando Humanos: ");
                    System.out.println("Vida del Avioneta: " + avioneta.vida11);
                    break;
                case 2:
                    System.out.println("Saliendo de este bloque...");
                    break;
            }
        }
    }

    @Override
    public void recolectar() {}

}
