package Aliens;

import static Elfos.CuartelElfos.life;
import static Humanos.Avion.vida3;
import static Humanos.BancoOro.vida1;
import static Humanos.CuartelHumanos.life1;
import static Humanos.Elixir.vida6;
import static Humanos.ElixirOscuro.vida5;
import static Humanos.Francotirador.vida4;
import static Humanos.Peloton.vida2;
import static Humanos.Tanque.vida;
import java.util.Scanner;


public class Naves implements jugarAliens{
    public static int vida06 = 900;
    private int fuerza11;
    
    public Naves(){}
    
    public Naves(int fuerza11){
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
        Naves nave = new Naves();
        nave.setFuerza11(400);
        int a =3;
        Scanner lee4 = new Scanner(System.in);
        System.out.println("Se creo la nave, deseas atacar? ");
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
                                System.out.println("Nave ataco con: "+nave.getFuerza11()+" a Peloton: " +(vida2-nave.getFuerza11()));
                                break;
                            case 2:
                                System.out.println("Nave ataco con: "+nave.getFuerza11()+" a Francotirador: " +(vida4-nave.getFuerza11()));
                                break;
                            case 3:
                                System.out.println("Nave ataco con: "+nave.getFuerza11()+" a Centro Humanos: "+(life1-nave.getFuerza11()));
                                break;
                            case 4:
                                System.out.println("Nave ataco con: "+nave.getFuerza11()+" a Centro Elfos: "+(life-nave.getFuerza11()));
                                break;
                            case 5:
                                System.out.println("Nave ataco con: "+nave.getFuerza11()+" a Tanque: "+(vida-nave.getFuerza11()));
                                break;
                            case 6:
                                System.out.println("Nave ataco a: "+nave.getFuerza11()+" a Mina de Elixir Oscuro: "+(vida5-nave.getFuerza11()));
                                break;
                            case 7:
                                System.out.println("Nave ataco a: "+nave.getFuerza11()+" a Avion: "+(vida3-nave.getFuerza11()));
                                break;
                            case 8:
                                System.out.println("Nave ataco a: "+nave.getFuerza11()+" a Mina de Elixir: "+(vida6-nave.getFuerza11()));
                                break;
                            case 9:
                                System.out.println("Nave ataco a: "+nave.getFuerza11()+" a Mina de Oro: "+(vida1-nave.getFuerza11()));
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
