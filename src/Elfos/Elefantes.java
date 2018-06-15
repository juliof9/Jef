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

public class Elefantes implements jugarElfos{
    public static int vida10 = 200;
    private int fuerza10;
    
    public Elefantes(){}
    
    public Elefantes(int fuerza10){
        this.fuerza10 = fuerza10;
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
        elefante.setFuerza10(300);
        int a = 3;
        Scanner lee4 = new Scanner(System.in);
        System.out.println("Se creo el elefante, deseas atacar? ");
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
                                System.out.println("Elefante ataco con: "+elefante.getFuerza10()+" a Aliens: " +(vida02-elefante.getFuerza10()));
                                break;
                            case 2:
                                System.out.println("Elefante ataco con: "+elefante.getFuerza10()+" a depredador: " +(vida00-elefante.getFuerza10()));
                                break;
                            case 3:
                                System.out.println("Elefante ataco con: "+elefante.getFuerza10()+" a Centro Humanos: "+(life1-elefante.getFuerza10()));
                                break;
                            case 4:
                                System.out.println("Elefante ataco con: "+elefante.getFuerza10()+" a Centro Aliens: "+(life2-elefante.getFuerza10()));
                                break;
                            case 5:
                                System.out.println("Elefante ataco con: "+elefante.getFuerza10()+" a Naves: "+(vida06-elefante.getFuerza10()));
                                break;
                            case 6:
                                System.out.println("Elefante ataco a: "+elefante.getFuerza10()+" a Mina de Elixir Oscuro: "+(vida03-elefante.getFuerza10()));
                                break;
                            case 7:
                                System.out.println("Elefante ataco a: "+elefante.getFuerza10()+" a Omni: "+(vida12-elefante.getFuerza10()));
                                break;
                            case 8:
                                System.out.println("Elefante ataco a: "+elefante.getFuerza10()+" a Mina de Elixir: "+(vida04-elefante.getFuerza10()));
                                break;
                            case 9:
                                System.out.println("Elefante ataco a: "+elefante.getFuerza10()+" a Mina de Oro: "+(vida05-elefante.getFuerza10()));
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
