package Humanos;

import static Aliens.CentroAliens.life3;
import static Elfos.Arqueros.vida01;
import static Elfos.Avionetas.vida11;
import static Elfos.CentroElfos.life;
import static Elfos.Elefantes.vida10;
import static Elfos.ElixirOscuro.vida9;
import static Elfos.Mago.vida8;
import static Elfos.MinaElixir.vida09;
import static Elfos.MinaOro.vida0;
import java.util.Scanner;

public class Avion implements jugarHumanos{
    public static int vida3 = 400;
    private int fuerza3;
    
    public Avion(){}
    
    public Avion(int fuerza3){
        this.fuerza3 = fuerza3;
    }

    public int getFuerza3() {
        return fuerza3;
    }

    public void setFuerza3(int fuerza3) {
        this.fuerza3 = fuerza3;
    }

    @Override
    public void atacar() {
        Avion avion = new Avion();
        avion.setFuerza3(400);
        int a =3;
        Scanner lee2 = new Scanner(System.in);
        System.out.println("Se creo el avion, deseas atacar? ");
        while (a != 2){
            System.out.println("1. Si");
            System.out.println("2. No");
            
            a = lee2.nextInt();
            switch(a){
                case 1:
                    int b = 11;
                    Scanner lee = new Scanner(System.in);
                    System.out.println("A quien deseas atacar?");
                    while( b != 10){
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
                                System.out.println("Avion ataco con: "+avion.getFuerza3()+" a Arquero: " +(vida01-avion.getFuerza3()));
                                break;
                            case 2:
                                System.out.println("Avion ataco con: "+avion.getFuerza3()+" a Avioneta: " +(vida11-avion.getFuerza3()));
                                break;
                            case 3:
                                System.out.println("Avion ataco con: "+avion.getFuerza3()+" a Centro Elfos: "+(life-avion.getFuerza3()));
                                break;
                            case 4:
                                System.out.println("Avion ataco con: "+avion.getFuerza3()+" a Centro Aliens: "+(life3-avion.getFuerza3()));
                                break;
                            case 5:
                                System.out.println("Avion ataco con: "+avion.getFuerza3()+" a Elefante: "+(vida10-avion.getFuerza3()));
                                break;
                            case 6:
                                System.out.println("Avion ataco a: "+avion.getFuerza3()+" a Mina de Elixir Oscuro: "+(vida9-avion.getFuerza3()));
                                break;
                            case 7:
                                System.out.println("Avion ataco a: "+avion.getFuerza3()+" a Mago: "+(vida8-avion.getFuerza3()));
                                break;
                            case 8:
                                System.out.println("Avion ataco a: "+avion.getFuerza3()+" a Mina de Elixir: "+(vida09-avion.getFuerza3()));
                                break;
                            case 9:
                                System.out.println("Avion ataco a: "+avion.getFuerza3()+" a Mina de Oro: "+(vida0-avion.getFuerza3()));
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
