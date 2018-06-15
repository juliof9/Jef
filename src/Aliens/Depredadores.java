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

public class Depredadores implements jugarAliens{
    public static int vida00 = 500;
    
    private int fuerza00;
    
    public Depredadores(){}
    
    public Depredadores(int fuerza00){
        this.fuerza00 = fuerza00;
    }
    
    public int getFuerza00() {
        return fuerza00;
    }

    public void setFuerza00(int fuerza00) {
        this.fuerza00 = fuerza00;
    }

    @Override
    public void atacar() {
        Depredadores depredador = new Depredadores();
        depredador.setFuerza00(700);
        int a =3;
        Scanner lee4 = new Scanner(System.in);
        System.out.println("Se creo el depredador, deseas atacar? ");
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
                                System.out.println("Depredador ataco con: "+depredador.getFuerza00()+" a Peloton: " +(vida2-depredador.getFuerza00()));
                                break;
                            case 2:
                                System.out.println("Depredador ataco con: "+depredador.getFuerza00()+" a Francotirador: " +(vida4-depredador.getFuerza00()));
                                break;
                            case 3:
                                System.out.println("Depredador ataco con: "+depredador.getFuerza00()+" a Centro Humanos: "+(life1-depredador.getFuerza00()));
                                break;
                            case 4:
                                System.out.println("Depredador ataco con: "+depredador.getFuerza00()+" a Centro Elfos: "+(life-depredador.getFuerza00()));
                                break;
                            case 5:
                                System.out.println("Depredador ataco con: "+depredador.getFuerza00()+" a Tanque: "+(vida-depredador.getFuerza00()));
                                break;
                            case 6:
                                System.out.println("Depredador ataco a: "+depredador.getFuerza00()+" a Mina de Elixir Oscuro: "+(vida5-depredador.getFuerza00()));
                                break;
                            case 7:
                                System.out.println("Depredador ataco a: "+depredador.getFuerza00()+" a Avion: "+(vida3-depredador.getFuerza00()));
                                break;
                            case 8:
                                System.out.println("Depredador ataco a: "+depredador.getFuerza00()+" a Mina de Elixir: "+(vida6-depredador.getFuerza00()));
                                break;
                            case 9:
                                System.out.println("Depredador ataco a: "+depredador.getFuerza00()+" a Mina de Oro: "+(vida1-depredador.getFuerza00()));
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
