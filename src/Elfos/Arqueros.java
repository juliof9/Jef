package Elfos;

import static Aliens.Aliens.vida02;
import static Aliens.CuartelAliens.life2;
import static Aliens.Depredadores.vida00;
import static Aliens.ElixirOscuroA.vida03;
import static Aliens.MinaElixir.vida04;
import static Aliens.MinaOro.vida05;
import static Aliens.Naves.vida06;
import static Aliens.Omni.vida12;
import static Humanos.CuartelHumanos.life1;
import java.util.Scanner;

public class Arqueros implements jugarElfos{
    public static int vida01 = 900;
    private int ataque, costo6;
    
    public Arqueros(){}
    
    public Arqueros(int fuerza01, int costo6){
        this.ataque = fuerza01;
        this.costo6 = costo6;
    }

    public int getCosto6() {
        return costo6;
    }

    public void setCosto6(int costo6) {
        this.costo6 = costo6;
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
        arquero.setataque(300);
        int a =3;
        Scanner lee4 = new Scanner(System.in);
        
        while (a != 2){
            System.out.println("Se creo el Arquero, deseas atacar? ");
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
                                System.out.println("Arquero ataco con: "+arquero.getataque()+" a Aliens: " +(vida02-arquero.getataque()));
                                break;
                            case 2:
                                System.out.println("Arquero ataco con: "+arquero.getataque()+" a depredador: " +(vida00-arquero.getataque()));
                                break;
                            case 3:
                                System.out.println("Arquero ataco con: "+arquero.getataque()+" a Centro Humanos: "+(life1-arquero.getataque()));
                                break;
                            case 4:
                                System.out.println("Arquero ataco con: "+arquero.getataque()+" a Centro Aliens: "+(life2-arquero.getataque()));
                                break;
                            case 5:
                                System.out.println("Arquero ataco con: "+arquero.getataque()+" a Naves: "+(vida06-arquero.getataque()));
                                break;
                            case 6:
                                System.out.println("Arquero ataco a: "+arquero.getataque()+" a Mina de Elixir Oscuro: "+(vida03-arquero.getataque()));
                                break;
                            case 7:
                                System.out.println("Arquero ataco a: "+arquero.getataque()+" a Omni: "+(vida12-arquero.getataque()));
                                break;
                            case 8:
                                System.out.println("Arquero ataco a: "+arquero.getataque()+" a Mina de Elixir: "+(vida04-arquero.getataque()));
                                break;
                            case 9:
                                System.out.println("Arquero ataco a: "+arquero.getataque()+" a Mina de Oro: "+(vida05-arquero.getataque()));
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
