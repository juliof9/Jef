package Humanos;

import static Aliens.CuartelAliens.life2;
import static Elfos.Arqueros.vida01;
import static Elfos.Avionetas.vida11;
import static Elfos.CuartelElfos.life;
import static Elfos.Elefantes.vida10;
import static Elfos.ElixirOscuroE.vida9;
import static Elfos.Mago.vida8;
import static Elfos.MinaElixirE.vida09;
import static Elfos.MinaOroE.vida0;
import java.util.Scanner;

public class Tanque implements jugarHumanos{
    public static int vida = 600;
    private int fuerza, costo13;
    
    public Tanque(){}
    
    public Tanque(int fuerza, int costo13){
        this.fuerza = fuerza;
        this.costo13 = costo13;
    }

    public int getCosto13() {
        return costo13;
    }

    public void setCosto13(int costo13) {
        this.costo13 = costo13;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public void atacar() {
        Tanque tanque = new Tanque();
        tanque.setFuerza(300);
        int a = 3;
        Scanner lee5 = new Scanner(System.in);
        while (a != 2){
            System.out.println("Se creo el tanque, deseas atacar? ");
            System.out.println("1. Si");
            System.out.println("2. No");
            
            a = lee5.nextInt();
            switch(a){
                case 1:
                    int b = 11;
                    Scanner lee = new Scanner(System.in);
                    while( b != 10){
                        System.out.println("A quien deseas atacar?");
                        System.out.println("1. Arqueros");
                        System.out.println("2. Avionetas");
                        System.out.println("3. Centro de mando Elfos");
                        System.out.println("4. Centro de mando Aliens");
                        System.out.println("5. Elefantes");
                        System.out.println("6. Elixir Oscuro");
                        System.out.println("7. Mago");
                        System.out.println("8. Mina de Elixir");
                        System.out.println("9. Mina de Oro");
                        System.out.println("10. Salir");
                        b = lee.nextInt();
                        switch(b){
                            case 1:
                                System.out.println("Peloton ataco con: "+tanque.getFuerza()+" a Arquero: " +(vida01-tanque.getFuerza()));
                                break;
                            case 2:
                                System.out.println("Tanque ataco con: "+tanque.getFuerza()+" a Avioneta: " +(vida11-tanque.getFuerza()));
                                break;
                            case 3:
                                System.out.println("Tanque ataco con: "+tanque.getFuerza()+" a Centro Elfos: "+(life-tanque.getFuerza()));
                                break;
                            case 4:
                                System.out.println("Tanque ataco con: "+tanque.getFuerza()+" a Centro Aliens: "+(life2-tanque.getFuerza()));
                                break;
                            case 5:
                                System.out.println("Tanque ataco con: "+tanque.getFuerza()+" a Elefante: "+(vida10-tanque.getFuerza()));
                                break;
                            case 6:
                                System.out.println("Tanque ataco a: "+tanque.getFuerza()+" a Mina de Elixir Oscuro: "+(vida9-tanque.getFuerza()));
                                break;
                            case 7:
                                System.out.println("Tanque ataco a: "+tanque.getFuerza()+" a Mago: "+(vida8-tanque.getFuerza()));
                                break;
                            case 8:
                                System.out.println("Tanque ataco a: "+tanque.getFuerza()+" a Mina de Elixir: "+(vida09-tanque.getFuerza()));
                                break;
                            case 9:
                                System.out.println("Tanque ataco a: "+tanque.getFuerza()+" a Mina de Oro: "+(vida0-tanque.getFuerza()));
                                break;
                            case 10:
                                System.out.println("Saliendo de este bloque");
                                break;
                            default:
                                System.out.println("Ingreso: "+ b +" Por favor ingrese una opcion valida");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Saliendo de este bloque");
                    break;
                default:
                    System.out.println("Ingreso: "+ a +" ingrese una opcion valida");
            }
        }
    }

    @Override
    public void recolectar1() {
        
    }
}
