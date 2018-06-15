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

public class Aliens implements jugarAliens{
    public static int vida02 = 500;
    private int fuerza02;
    
    public Aliens(){}
    
    public Aliens (int fuerza02){
        this.fuerza02 = fuerza02;
    }

    public int getFuerza02() {
        return fuerza02;
    }

    public void setFuerza02(int fuerza02) {
        this.fuerza02 = fuerza02;
    }

    @Override
    public void atacar() {
        Aliens aliens = new Aliens();
        aliens.setFuerza02(400);
        int a =3;
        Scanner lee4 = new Scanner(System.in);
        System.out.println("Se creo el Alien, deseas atacar? ");
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
                                System.out.println("Alien ataco con: "+aliens.getFuerza02()+" a Peloton: " +(vida2-aliens.getFuerza02()));
                                break;
                            case 2:
                                System.out.println("Alien ataco con: "+aliens.getFuerza02()+" a Francotirador: " +(vida4-aliens.getFuerza02()));
                                break;
                            case 3:
                                System.out.println("Alien ataco con: "+aliens.getFuerza02()+" a Centro Humanos: "+(life1-aliens.getFuerza02()));
                                break;
                            case 4:
                                System.out.println("Alien ataco con: "+aliens.getFuerza02()+" a Centro Elfos: "+(life-aliens.getFuerza02()));
                                break;
                            case 5:
                                System.out.println("Alien ataco con: "+aliens.getFuerza02()+" a Tanque: "+(vida-aliens.getFuerza02()));
                                break;
                            case 6:
                                System.out.println("Alien ataco a: "+aliens.getFuerza02()+" a Mina de Elixir Oscuro: "+(vida5-aliens.getFuerza02()));
                                break;
                            case 7:
                                System.out.println("Alien ataco a: "+aliens.getFuerza02()+" a Avion: "+(vida3-aliens.getFuerza02()));
                                break;
                            case 8:
                                System.out.println("Alien ataco a: "+aliens.getFuerza02()+" a Mina de Elixir: "+(vida6-aliens.getFuerza02()));
                                break;
                            case 9:
                                System.out.println("Alien ataco a: "+aliens.getFuerza02()+" a Mina de Oro: "+(vida1-aliens.getFuerza02()));
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
