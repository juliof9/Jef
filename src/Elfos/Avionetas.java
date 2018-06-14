
package Elfos;

import java.util.Scanner;

public class Avionetas implements jugarElfos{
    private int vida11, fuerza11;
    
    public Avionetas(){}
    
    public Avionetas(int vida11, int fuerza11){
        this.fuerza11 = fuerza11;
        this.vida11 = vida11;
    }

    public int getVida11() {
        return vida11;
    }

    public void setVida11(int vida11) {
        this.vida11 = vida11;
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
        avioneta.setVida11(300);
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
