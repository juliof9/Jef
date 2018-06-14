package Elfos;

import java.util.Scanner;

public class Arqueros implements jugarElfos{
    public static int vida01 = 400;
    private int ataque;
    
    public Arqueros(){}
    
    public Arqueros(int fuerza01){
        this.ataque = fuerza01;
    }

    public int getVida01() {
        return vida01;
    }

    public void setVida01(int vida01) {
        this.vida01 = vida01;
    }

    public int getataque() {
        return ataque;
    }

    public void setataque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public void atacar() {
        Arqueros arquero = new Arqueros();
        arquero.setataque(100);
        int a = 3;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Se entreno el Arquero, desea atacar? ");
        while (a != 2 ){
            System.out.println("1. Si");
            System.out.println("2. No");
            
            a = leer.nextInt();
            
            switch(a){
                case 1:
                    System.out.println("Arquero hizo un daño de: " + arquero.ataque + " al centro de mando Humanos: ");
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
