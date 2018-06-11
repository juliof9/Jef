package Menu;

import Aliens.jugarAliens;
import java.util.Scanner;
import ClasesAbstractas.AbstractFactory;
import ClasesAbstractas.FactoryProducer;
import Humanos.jugarHumanos;

public class Menu {
    
    private static Menu instance;
    
    private Menu(){
        
    }
    
    public static Menu getInstance(){
        if(instance == null){
            instance = new Menu();
        }
        return instance;
    }
    
    public void opciones(){
        int op = 5;
        Scanner teclado = new Scanner(System.in);
        
        while (op != 4){
            System.out.println("Bienvenido al juego... Que raza deseas elegir?");
            System.out.println("1. Humanos");
            System.out.println("2. Aliens");
            System.out.println("3. Elfos");
            System.out.println("4. Salir");
            
            op = teclado.nextInt();
            
            switch(op){
                case 1:
                    int valor = 5;
                    Scanner leer = new Scanner(System.in);
                    
                    while (valor != 4){
                        System.out.println("En que desea gastar sus recursos de la raza humanos? ");
                        System.out.println("1. Milicia");
                        System.out.println("2. Edificaciones");
                        System.out.println("3. Vehiculos de guerra");
                        System.out.println("4. Salir");
                        
                        valor = leer.nextInt();
                        
                        switch(valor){
                            case 1:
                                int a = 4;
                                Scanner lee = new Scanner(System.in);
                                
                                while (a != 3){
                                    System.out.println("Que soldado desea entrenar?");
                                    System.out.println("1. Peloton");
                                    System.out.println("2. Super Soldado (Francotirador)");
                                    System.out.println("3. Terminar Turno");
                                    
                                    a = lee.nextInt();
                                    
                                    switch(a){
                                        case 1:
                                            AbstractFactory factory;
                                            
                                            factory = FactoryProducer.getFactory("jugarHumanos");
                                            jugarHumanos Peloton = factory.getjugarHumanos("Peloton");
                                            Peloton.jugar();
                                            break;
                                        case 2:
                                            AbstractFactory factor;
                                            
                                            factor = FactoryProducer.getFactory("jugarHumanos");
                                            jugarHumanos Francotirador = factor.getjugarHumanos("Francotirador");
                                            Francotirador.jugar();
                                            break;
                                        case 3:
                                            System.out.println("Adios, saliendo del sistema");
                                            break;
                                        default:
                                            System.out.println("Usten ingreso" + a + "Por favor ingrese una opcion valida");
                                    }
                                }
                                break;
                            case 2:
                                int b = 5;
                                Scanner lectura = new Scanner(System.in);
                                while (b != 4){
                                    System.out.println("Cual edificacion desea construir?");
                                    System.out.println("1. Mina o Banco de Oro");
                                    System.out.println("2. Mina de Elixir");
                                    System.out.println("3. Mina Elixir Oscuro");
                                    System.out.println("4. Salir");
                                    
                                    b = lectura.nextInt();
                                    
                                    switch(b){
                                        case 1:
                                            AbstractFactory facto;
                                            facto = FactoryProducer.getFactory("jugarHumanos");
                                            jugarHumanos BancoOro = facto.getjugarHumanos("BancoOro");
                                            BancoOro.jugar();
                                            break;
                                        case 2:
                                            AbstractFactory fact;
                                            fact = FactoryProducer.getFactory("jugarHumanos");
                                            jugarHumanos Elixir = fact.getjugarHumanos("ELixir");
                                            Elixir.jugar();
                                            break;
                                        case 3:
                                            AbstractFactory fac;
                                            fac = FactoryProducer.getFactory("jugarHumanos");
                                            jugarHumanos ElixirOscuro = fac.getjugarHumanos("Elixiroscuro");
                                            ElixirOscuro.jugar();
                                        case 4:
                                            System.out.println("Adios...");
                                            break;
                                        default:
                                            System.out.println("Ingreso el numero: " + b +"Ingrese una opcion valida");
                                    }
                                }
                                break;
                            case 3:
                                int c = 4;
                                Scanner tecla = new Scanner(System.in);
                                while (c != 3){
                                    System.out.println("Que vehiculo desea contruir? ");
                                    System.out.println("1. Avion");
                                    System.out.println("2. Tanque");
                                    System.out.println("3. Salir");
                                    
                                    c = tecla.nextInt();
                                    
                                    switch(c){
                                        case 1:
                                            AbstractFactory fa;
                                            fa = FactoryProducer.getFactory("jugarHumanos");
                                            jugarHumanos Avion = fa.getjugarHumanos("Avion");
                                            Avion.jugar();
                                            break;
                                        case 2:
                                            AbstractFactory f;
                                            f = FactoryProducer.getFactory("jugarHumanos");
                                            jugarHumanos Tanque = f.getjugarHumanos("Tanque");
                                            Tanque.jugar();
                                            break;
                                        case 3:
                                            System.out.println("Adios...");
                                            break;
                                        default:
                                            System.out.println("Ingreso: "+ c +"Ingrese una opcion valida.");
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Fin del programa");
                                break;
                        }
                    }
                    break;
                case 2:
                    int valor1 = 5;
                    Scanner teclas = new Scanner(System.in);
                    
                    while (valor1 != 4){
                        System.out.println("Se escogio la raza Aliens, que desea hacer? \n");
                        System.out.println("1. Milicias");
                        System.out.println("2. Edificaciones");
                        System.out.println("3. Vehiculos de guerra");
                        System.out.println("4. Salir");
                        
                        valor1 = teclas.nextInt();
                        
                        switch(valor1){
                            case 1:
                                int d = 4;
                                Scanner leer1 = new Scanner(System.in);
                                
                                while (d != 3){
                                    System.out.println("Sus milicias son las siguientes: \n");
                                    System.out.println("1. Aliens");
                                    System.out.println("2. Depredadores (Super soldado)");
                                    System.out.println("3. Salir");
                                    
                                    d = leer1.nextInt();
                                    
                                    switch(d){
                                        case 1:
                                            AbstractFactory factory1;
                                            factory1 = FactoryProducer.getFactory("jugarAliens");
                                            jugarAliens Aliens = factory1.getjugarAliens("Aliens");
                                            Aliens.jugar();
                                            break;
                                        case 2:
                                            AbstractFactory factory2;
                                            factory2 =FactoryProducer.getFactory("jugarAliens");
                                            jugarAliens Depredadores = factory2.getjugarAliens("Depredadores");
                                            Depredadores.jugar();
                                            break;
                                        case 3:
                                            System.out.println("Saliendo");
                                            break;
                                        default:
                                            System.out.println("Usted ingreso: " + d + " Ingrese una opcion valida");
                                    }
                                }
                                break;
                            case 2:
                                int e = 5;
                                Scanner leer3 = new Scanner(System.in);
                                
                                while(e != 4){
                                    System.out.println("1. Mina de Oro");
                                    System.out.println("2. Mina de Elixir");
                                    System.out.println("3. Mina de Elixir Oscuro");
                                    System.out.println("4. Salir");
                                    
                                    e = leer3.nextInt();
                                    
                                    switch(e){
                                        case 1:
                                            AbstractFactory factory3;
                                            factory3 = FactoryProducer.getFactory("jugarAliens");
                                            jugarAliens MinaOro = factory3.getjugarAliens("MinaOro");
                                            MinaOro.jugar();
                                            break;
                                        case 2:
                                            AbstractFactory factory4;
                                            factory4 = FactoryProducer.getFactory("jugarAliens");
                                            jugarAliens MinaElixir = factory4.getjugarAliens("MinaElixir");
                                            MinaElixir.jugar();
                                            break;
                                        case 3:
                                            AbstractFactory factory5;
                                            factory5 = FactoryProducer.getFactory("jugarAliens");
                                            jugarAliens ElixirOscuro = factory5.getjugarAliens("ElixirOscuro");
                                            ElixirOscuro.jugar();
                                            break;
                                        case 4:
                                            System.out.println("Saliendo de este bloque");
                                            break;
                                        default:
                                            System.out.println("Ingreso: " + e + "Ingrese una opcion valida");
                                    }
                                }
                                break;
                            case 3:
                                int f = 4;
                                Scanner leer6 = new Scanner(System.in);
                                
                                while( f != 3){
                                    System.out.println("Que behiculos de guerra desea construir? \n");
                                    System.out.println("1. Omnis");
                                    System.out.println("2. Naves");
                                    System.out.println("3. Salir de este bloque");
                                    
                                    f = leer6.nextInt();
                                    
                                    switch(f){
                                        case 1:
                                            AbstractFactory factory6;
                                            factory6 = FactoryProducer.getFactory("jugarAliens");
                                            jugarAliens Omni = factory6.getjugarAliens("Omni");
                                            Omni.jugar();
                                            break;
                                        case 2:
                                            AbstractFactory factory7;
                                            factory7 = FactoryProducer.getFactory("jugarAliens");
                                            jugarAliens Naves = factory7.getjugarAliens("Naves");
                                            Naves.jugar();
                                            break;
                                        case 3:
                                            System.out.println("Saliendo de este bloque");
                                            break;
                                        default:
                                            System.out.println("Ingreso el valor de: " + f + "Ingrese otra opcion");
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Saliendo de este bloque");
                                break;
                            default:
                                System.out.println("Ingreso: " + valor1 + "Por favor ingrese una opcion valida");
                        }
                    }
                    break;
                case 3:
                    int valor2 = 5;
                    Scanner leer4 = new Scanner(System.in);
                    
                    while( valor2 != 4){
                        System.out.println("Se escogio la raza Elfos");
                        System.out.println("1. Milicias");
                        System.out.println("2. Edificaciones");
                        System.out.println("3. Vehiculos de guerra");
                        System.out.println("4. Salir");
                        
                        valor2 = leer4.nextInt();
                        
                        switch(valor2){
                            case 1:
                                System.out.println("");
                        }
                    }
            }
        }
    }
}
