package Humanos;

import static Elfos.Arqueros.vida01;
import static Elfos.Avionetas.vida11;
import static Elfos.CentroElfos.life;
import static Elfos.Elefantes.vida10;
import static Elfos.ElixirOscuro.vida9;
import static Elfos.Mago.vida8;
import static Elfos.MinaElixir.vida09;
import static Elfos.MinaOro.vida0;
import java.util.Scanner;

public class Peloton implements jugarHumanos{
    public static int vida2 = 600;
    private int fuerza2;

    public int getFuerza2() {
        return fuerza2;
    }

    public void setFuerza2(int fuerza2) {
        this.fuerza2 = fuerza2;
    }

    @Override
    public void atacar() {
        Peloton peloton = new Peloton();
        peloton.setFuerza2(100);
        int a =3;
        Scanner lee4 = new Scanner(System.in);
        System.out.println("Se creo el peloton, deseas atacar? ");
        while (a != 2){
            System.out.println("1. Si");
            System.out.println("2. No");
            
            a = lee4.nextInt();
            switch(a){
                case 1:
                    int b = 10;
                    Scanner lee = new Scanner(System.in);
                    System.out.println("A quien deseas atacar?");
                    while( b != 9){
                        System.out.println("1. Arqueros");
                        System.out.println("2. Avionetas");
                        System.out.println("3. CentroElfos");
                        System.out.println("4. Elefantes");
                        System.out.println("5. Elixir Oscuro");
                        System.out.println("6. Mago");
                        System.out.println("7. Mina de Elixir");
                        System.out.println("8. Mina de Oro");
                        System.out.println("9. Salir");
                        b = lee.nextInt();
                        switch(b){
                            case 1:
                                System.out.println("Peloton ataco con: "+peloton.getFuerza2()+" a Arquero: " +(vida01-peloton.getFuerza2()));
                                break;
                            case 2:
                                System.out.println("Peloton ataco con: "+peloton.getFuerza2()+" a Avioneta: " +(vida11-peloton.getFuerza2()));
                                break;
                            case 3:
                                System.out.println("Peloton ataco con: "+peloton.getFuerza2()+" a Centro Elfos: "+(life-peloton.getFuerza2()));
                                break;
                            case 4:
                                System.out.println("Peloton ataco con: "+peloton.getFuerza2()+" a Elefante: "+(vida10-peloton.getFuerza2()));
                                break;
                            case 5:
                                System.out.println("Peloton ataco a: "+peloton.getFuerza2()+" a Mina de Elixir Oscuro: "+(vida9-peloton.getFuerza2()));
                                break;
                            case 6:
                                System.out.println("Peloton ataco a: "+peloton.getFuerza2()+" a Mago: "+(vida8-peloton.getFuerza2()));
                                break;
                            case 7:
                                System.out.println("Peloton ataco a: "+peloton.getFuerza2()+" a Mina de Elixir: "+(vida09-peloton.getFuerza2()));
                                break;
                            case 8:
                                System.out.println("Peloton ataco a: "+peloton.getFuerza2()+" a Mina de Oro: "+(vida0-peloton.getFuerza2()));
                                break;
                            case 9:
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
    public void recolectar1() {}
}
