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

public class Omni implements jugarAliens{
    public static int vida12 = 500;
    private int fuerza12, costo03;
    
    public Omni(){}
    
    public Omni(int fuerza12, int costo03){
        this.fuerza12 = fuerza12;
        this.costo03 = costo03;
    }

    public int getCosto03() {
        return costo03;
    }

    public void setCosto03(int costo03) {
        this.costo03 = costo03;
    }

    public int getFuerza12() {
        return fuerza12;
    }

    public void setFuerza12(int fuerza12) {
        this.fuerza12 = fuerza12;
    }

    @Override
    public void atacar() {
        Omni omni = new Omni();
        omni.setFuerza12(650);
        int a =3;
        Scanner lee4 = new Scanner(System.in);
        System.out.println("Se creo el Omni, deseas atacar? ");
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
                                System.out.println("Alien ataco con: "+omni.getFuerza12()+" a Peloton: " +(vida2-omni.getFuerza12()));
                                break;
                            case 2:
                                System.out.println("Alien ataco con: "+omni.getFuerza12()+" a Francotirador: " +(vida4-omni.getFuerza12()));
                                break;
                            case 3:
                                System.out.println("Alien ataco con: "+omni.getFuerza12()+" a Centro Humanos: "+(life1-omni.getFuerza12()));
                                break;
                            case 4:
                                System.out.println("Alien ataco con: "+omni.getFuerza12()+" a Centro Elfos: "+(life-omni.getFuerza12()));
                                break;
                            case 5:
                                System.out.println("Alien ataco con: "+omni.getFuerza12()+" a Tanque: "+(vida-omni.getFuerza12()));
                                break;
                            case 6:
                                System.out.println("Alien ataco a: "+omni.getFuerza12()+" a Mina de Elixir Oscuro: "+(vida5-omni.getFuerza12()));
                                break;
                            case 7:
                                System.out.println("Alien ataco a: "+omni.getFuerza12()+" a Avion: "+(vida3-omni.getFuerza12()));
                                break;
                            case 8:
                                System.out.println("Alien ataco a: "+omni.getFuerza12()+" a Mina de Elixir: "+(vida6-omni.getFuerza12()));
                                break;
                            case 9:
                                System.out.println("Alien ataco a: "+omni.getFuerza12()+" a Mina de Oro: "+(vida1-omni.getFuerza12()));
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
