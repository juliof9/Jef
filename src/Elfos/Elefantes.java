package Elfos;

import java.util.Scanner;

public class Elefantes implements jugarElfos{
    private int vida10, fuerza10;
    
    public Elefantes(){}
    
    public Elefantes(int vida10, int fuerza10){
        this.fuerza10 = fuerza10;
        this.vida10 = vida10;
    }

    public int getVida10() {
        return vida10;
    }

    public void setVida10(int vida10) {
        this.vida10 = vida10;
    }

    public int getFuerza10() {
        return fuerza10;
    }

    public void setFuerza10(int fuerza10) {
        this.fuerza10 = fuerza10;
    }

    @Override
    public void atacar() {
        Elefantes elefante = new Elefantes();
        elefante.setVida10(400);
        elefante.setFuerza10(50);
        int a = 3;
        Scanner lee1 = new Scanner(System.in);
        
        System.out.println("Se entreno el Elefante, desea atacar? ");
        while (a != 2 ){
            System.out.println("1. Si");
            System.out.println("2. No");
            
            a = lee1.nextInt();
            
            switch(a){
                case 1:
                    System.out.println("Elefante hizo un daño de: " + elefante.fuerza10 + " al centro de mando Humanos: ");
                    System.out.println("Vida del Elefante: " + elefante.vida10);
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
