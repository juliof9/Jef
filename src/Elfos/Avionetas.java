
package Elfos;

import static Aliens.Aliens.vida02;
import static Aliens.CuartelAliens.life2;
import static Aliens.Depredadores.vida00;
import static Aliens.ElixirOscuro.vida03;
import static Aliens.MinaElixir.vida04;
import static Aliens.MinaOro.vida05;
import static Aliens.Naves.vida06;
import static Aliens.Omni.vida12;
import static Humanos.CuartelHumanos.life1;
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
        Scanner lee4 = new Scanner(System.in);
        System.out.println("Se creo la Avioneta, deseas atacar? ");
        int a = 3;
        while (a != 2){
            System.out.println("1. Si");
            System.out.println("2. No");
            
            a = lee4.nextInt();
            switch(a){
                case 1:
                    int b = 11;
                    Scanner lee = new Scanner(System.in);
                    while( b != 10){
                        System.out.println("A quien deseas atacar?");
                        System.out.println("1. Peloton");
                        System.out.println("2. Francotirador");
                        System.out.println("3. CentroHumanos");
                        System.out.println("4. CentroElfos");
                        System.out.println("5. Tanque");
                        System.out.println("6. Elixir Oscuro");
                        System.out.println("7. Avion");
                        System.out.println("8. Mina de Elixir");
                        System.out.println("9. Banco de Oro");
                        System.out.println("10. Salir");
                        b = lee.nextInt();
                        switch(b){
                            case 1:
                                System.out.println("Avioneta ataco con: "+avioneta.getFuerza11()+" a Aliens: " +(vida02-avioneta.getFuerza11()));
                                break;
                            case 2:
                                System.out.println("Avioneta ataco con: "+avioneta.getFuerza11()+" a depredador: " +(vida00-avioneta.getFuerza11()));
                                break;
                            case 3:
                                System.out.println("Avioneta ataco con: "+avioneta.getFuerza11()+" a Centro Humanos: "+(life1-avioneta.getFuerza11()));
                                break;
                            case 4:
                                System.out.println("Avioneta ataco con: "+avioneta.getFuerza11()+" a Centro Aliens: "+(life2-avioneta.getFuerza11()));
                                break;
                            case 5:
                                System.out.println("Avioneta ataco con: "+avioneta.getFuerza11()+" a Naves: "+(vida06-avioneta.getFuerza11()));
                                break;
                            case 6:
                                System.out.println("Avioneta ataco a: "+avioneta.getFuerza11()+" a Mina de Elixir Oscuro: "+(vida03-avioneta.getFuerza11()));
                                break;
                            case 7:
                                System.out.println("Avioneta ataco a: "+avioneta.getFuerza11()+" a Omni: "+(vida12-avioneta.getFuerza11()));
                                break;
                            case 8:
                                System.out.println("Avioneta ataco a: "+avioneta.getFuerza11()+" a Mina de Elixir: "+(vida04-avioneta.getFuerza11()));
                                break;
                            case 9:
                                System.out.println("Avioneta ataco a: "+avioneta.getFuerza11()+" a Mina de Oro: "+(vida05-avioneta.getFuerza11()));
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
    public void recolectar() {}

}
